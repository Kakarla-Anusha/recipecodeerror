// Write your code here
package com.example.recipe;

import java.util.*;

public class Recipe {
    private int recipeId;
    private String recipeName;
    private String recipeType;
    private ArrayList<String> ingredients;

    public Recipe(int recipeId, String recipeName, String recipeType, ArrayList<String> ingredients) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeType = recipeType;
        this.ingredients = ingredients;
    }

    public getRecipeId() {
        return this.recipeId;
    }

    public setRecipeId(int recipeId) {
        this.recipeId=recipeId;
    }

    public getRecipeName() {
        return this.recipeName;
    }

    public setRecipeName(String recipeName) {
        this.recipeName=recipeName;
    }

    public getRecipeType() {
        return this.recipeType;
    }

    public setRecipeType(String recipeType) {
        this.recipeType=recipeType;
    
    }

    public getingridents() {
        return this.ingredients;
    }

    public setingridents(ArrayList<String> ingredients) {
        this.ingredients=ingredients;

    }
}