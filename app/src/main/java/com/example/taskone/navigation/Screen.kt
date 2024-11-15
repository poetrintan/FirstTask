package com.example.taskone.navigation

sealed class Screen (val route: String){
    data object Home : Screen("Home")
    data object Reccomendation : Screen("Recommendation")
    data object About : Screen("About Me")
    data object Detail : Screen("detail_animes")
}