package com.omnicell.submission.recipe.controller;


import com.omnicell.submission.recipe.model.Recipe;
import com.omnicell.submission.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @GetMapping("/")
    public List<Recipe> allRecipe() {
        return recipeService.findAll();
    }

    @GetMapping("/{id}")
        public Recipe findRecipeById(@PathVariable Long id){
        return recipeService.findById(id);
    }

    @PostMapping("/")
    public Recipe createEmployee( @RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

}
