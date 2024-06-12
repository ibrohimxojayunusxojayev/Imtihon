package com.example.imtihon3.navigation

sealed class Screen(val route:String) {
    data object Splash:Screen(route = "splash_screen")
    data object Primary:Screen(route = "primary_screen")
    data object Detail:Screen(route = "detail_screen/{id}")
}