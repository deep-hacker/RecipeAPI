package com.omnicell.submission.recipe.repository;


import com.omnicell.submission.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
