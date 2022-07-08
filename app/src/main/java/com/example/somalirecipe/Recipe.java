package com.example.somalirecipe;

import java.io.Serializable;
import java.util.List;

public class Recipe implements Serializable {
    private String  name;
    private int duration;
    private List<String> ingredients;
    private String steps;


    public Recipe(String name, int duration, List<String> ingredients, String steps) {
        this.name = name;
        this.duration = duration;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }
}
