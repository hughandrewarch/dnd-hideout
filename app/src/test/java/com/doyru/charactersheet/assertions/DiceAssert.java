package com.doyru.charactersheet.assertions;

import com.doryu.charactersheet.models.Dice;

import org.fest.assertions.api.Assertions;

public class DiceAssert {

    private Dice mActualDice;

    private DiceAssert(Dice actualDice) {
        mActualDice = actualDice;
    }

    public static DiceAssert assertThat(Dice actualDice) {
        return new DiceAssert(actualDice);
    }

    public DiceAssert isEqualTo(Dice expectedDice) {
        Assertions.assertThat(expectedDice).isNotNull();

        int expectedQuantity = expectedDice.getQuantity();
        int expectedBase = expectedDice.getBase();

        Assertions.assertThat(mActualDice).overridingErrorMessage("Expected dice %dd%d, but was null!", expectedQuantity, expectedBase).isNotNull();

        int actualQuantity = mActualDice.getQuantity();
        int actualBase = mActualDice.getBase();

        Assertions.assertThat(actualQuantity).overridingErrorMessage("Expected dice %dd%d, but was %dd%d", expectedQuantity, expectedBase, actualQuantity, actualBase).isEqualTo(expectedQuantity);
        Assertions.assertThat(actualBase).overridingErrorMessage("Expected dice %dd%d, but was %dd%d", expectedQuantity, expectedBase, actualQuantity, actualBase).isEqualTo(expectedBase);

        return this;
    }
}
