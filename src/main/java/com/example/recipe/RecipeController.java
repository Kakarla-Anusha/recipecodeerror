/*
 * 
 * You can use the following import statements
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.recipe;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;

@RestController
public class RecipeController {
    RecipeService recipeservice = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> recipes() {
        return recipeservice.recipes();
    }

}
