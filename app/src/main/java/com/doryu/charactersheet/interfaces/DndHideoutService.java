package com.doryu.charactersheet.interfaces;

import com.doryu.charactersheet.models.Spell;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface DndHideoutService {

    @GET("/api/dnd5/v1/spells")
    public void getSpells(Callback<List<Spell>> cb);

    @GET("/api/dnd5/v1/spells/{class_name}")
    public void getSpells(@Path("class_name") String characterClassName, Callback<List<Spell>> cb);
}
