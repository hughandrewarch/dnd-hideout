package com.doryu.charactersheet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


/**
 * Created by Drew Arch on 2015-06-09.
 */
public class MainActivity extends Activity {

    /**
     * Global Variables *
     */
    private int animation_duration;
    private double main_section_threshold_o = 0.2;
    private double main_section_threshold = 0.2;

    /**
     * View and View Groups *
     */
    private RelativeLayout main_sections;
    private LinearLayout main_sections_bar;

    private static final String TAG = "CharacterSheet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation_duration = getResources().getInteger(R.integer.animation_duration);

        /** Views **/
        /** Main Sections **/
        main_sections = (RelativeLayout) findViewById(R.id.main_sections);
        main_sections_bar = (LinearLayout) findViewById(R.id.main_sections_bar);

        /** On Touch Listeners **/
        main_sections_bar.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_UP:
                        Log.d(TAG, "ActionUp: " + motionEvent.toString());
                        sectionsUp(motionEvent);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        sectionsMove(motionEvent);
                        break;
                    default:
                        break;
                }

                return true;
            }
        });

    }

    /**
     * Main Sections Motion Events *
     */
    private void sectionsUp(MotionEvent motionEvent) {

        //TODO make into global variables
        int barHeight = main_sections_bar.getMeasuredHeight();
        int almostUp = 0;//leaving this in case I want to set an upper limit to the bar

        //TODO add momentum logic
        if (motionEvent.getRawY() < MyHelpers.getUsableHeight(this) * main_section_threshold) {
            moveMainSections(main_sections, almostUp);
            main_section_threshold = main_section_threshold_o;
        } else {
            moveMainSections(main_sections, main_sections.getMeasuredHeight() - barHeight);
            main_section_threshold = (1 - main_section_threshold_o);
        }

    }

    void sectionsMove(MotionEvent motionEvent) {

        //TODO make into global variables
        int barHeight = main_sections_bar.getMeasuredHeight();
        int almostUp = 0;//leaving this in case I want to set an upper limit to the bar

        if (motionEvent.getRawY() > main_sections.getMeasuredHeight()) //Bar down stop
        {
            main_sections.setY(main_sections.getMeasuredHeight() - barHeight);
        } else if (motionEvent.getRawY() <= almostUp && main_sections.getY() <= almostUp) //Bar up stop
        {
            main_sections.setY(almostUp);
        } else //Bar moving
        {
            float newTabY = motionEvent.getRawY() - barHeight;

            if (newTabY <= almostUp)
                newTabY = almostUp;

            float thresh = .20f;
            if (motionEvent.getRawY() < main_sections.getMeasuredHeight() * main_section_threshold_o) {
                double total = main_sections.getMeasuredHeight() * thresh; //Distance of threshold
                double progr = main_sections.getMeasuredHeight() * thresh - motionEvent.getRawY(); //Progress into threshold
                double modifier = Math.pow((progr / total), 1.8); //1.8 arbitrarily choosen
                newTabY -= (progr * (1 - modifier));
                if (newTabY <= almostUp) {
                    newTabY = almostUp;
                }
                main_section_threshold = (main_section_threshold_o);
            } else if (motionEvent.getRawY() > main_sections.getMeasuredHeight() * (1 - main_section_threshold_o)) {
                double total = main_sections.getMeasuredHeight() - main_sections.getMeasuredHeight() * (1.0f - thresh); //Distance of threshold
                double progr_1 = main_sections.getMeasuredHeight() - motionEvent.getRawY(); //Progress Inverse into threshold
                double modifier = Math.pow((progr_1 / total), 1.8); //1.8 arbitrarily choosen
                newTabY += (progr_1 * (1 - modifier));
                if (newTabY > main_sections.getMeasuredHeight() - barHeight) {
                    newTabY = main_sections.getMeasuredHeight() - barHeight;
                }
                main_section_threshold = (1 - main_section_threshold_o);

            }

            main_sections.setY(newTabY);
        }

    }

    private void moveMainSections(RelativeLayout view, int end) {
        float start = view.getY();
        translateSections((int) start, end).start();
    }

    /**
     * Value Animators *
     */
    private ValueAnimator translateSections(int start, int end) {

        ValueAnimator animator = ValueAnimator.ofInt(start, end);

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                //Update Height
                int value = (Integer) valueAnimator.getAnimatedValue();
                main_sections.setY(value);
            }
        });
        animator.setInterpolator(new DecelerateInterpolator());
        return animator.setDuration(animation_duration);
    }

}