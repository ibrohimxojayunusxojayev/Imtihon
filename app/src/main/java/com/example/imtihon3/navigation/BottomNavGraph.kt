package com.example.imtihon3.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.imtihon3.screens.home.HomeView
import com.example.imtihon3.screens.primary.PrimaryViewModel
import com.example.imtihon3.screens.saved.SavedView

@Composable
fun BottomNavGraph(pvm: PrimaryViewModel, bottomNavController: NavHostController) {
    NavHost(navController = bottomNavController, startDestination = BottomNavScreen.Home.route) {
        composable(route = BottomNavScreen.Home.route) {
            HomeView(pvm = pvm)
        }
        composable(route = BottomNavScreen.Saved.route) {
            SavedView(pvm = pvm)
        }
    }
}