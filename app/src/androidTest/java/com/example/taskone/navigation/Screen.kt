package com.example.taskone.navigation

sealed class Screen (val route: String){
    data object Home: Screen("Home")
    data object Reccomendations: Screen("Recommendations")
    data object About: Screen("About Me")
    object Detail : Screen("detail/{itemName}") {
        fun createRoute(itemName: String) = "detail/$itemName"
    }
}