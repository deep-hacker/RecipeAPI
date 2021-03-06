package com.omnicell.submission.recipe.service;


import com.omnicell.submission.recipe.model.Recipe;
import com.omnicell.submission.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> findAll() {

         Iterable<Recipe> it = recipeRepository.findAll();

        List<Recipe> recipes = new ArrayList<Recipe>();
        it.forEach(e -> recipes.add(e));

        return recipes;
    }

    public Recipe findById(Long id) {
         Recipe recipe = recipeRepository.findById(id).orElse(null);
        return recipe;
    }

    public Recipe addRecipe(Recipe recipe){
       return recipeRepository.save(recipe);
    }

}
