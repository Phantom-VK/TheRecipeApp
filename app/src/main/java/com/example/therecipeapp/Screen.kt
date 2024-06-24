package com.example.therecipeapp

import java.net.NoRouteToHostException

sealed class Screen(val route:String) {
    object RecipeScreenRoute:Screen("recipescreen")
    object DetailsScreenRoute:Screen("detailscreenroute")
}