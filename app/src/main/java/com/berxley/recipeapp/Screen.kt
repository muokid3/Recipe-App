package com.berxley.recipeapp

sealed class Screen(val route:String) {
    object RecipeScreen:Screen("recipeScreen")
    object DetailsScreen:Screen("detailsScreen")
}