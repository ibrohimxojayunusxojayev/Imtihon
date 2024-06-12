package com.example.imtihon3.navigation

import android.graphics.drawable.Icon
import com.example.imtihon3.R

sealed class BottomNavScreen(val route:String, val icon: Int) {
    data object Home:BottomNavScreen(route = "home", R.drawable.home_fill)
    data object Saved:BottomNavScreen(route = "Saved", R.drawable.saved_fill)
    companion object{
        fun all(): List<BottomNavScreen> {
            return listOf(Home, Saved)
        }
    }
}