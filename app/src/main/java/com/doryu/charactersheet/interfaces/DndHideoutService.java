package com.doryu.charactersheet.interfaces;

import com.doryu.charactersheet.models.Spell;
import com.doryu.charactersheet.models.classes.CharacterClass;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface DndHideoutService {

    @GET("/api/dnd5/v1/spells")
    public void getSpells(Callback<List<Spell>> cb);

    @GET("/api/dnd5/v1/spells")
    public void getSpells(String characterClassName, Callback<List<Spell>> cb);

    @GET("/api/dnd5/v1/spells")
    public void getSpells(CharacterClass characterClass, Callback<List<Spell>> cb);
}
