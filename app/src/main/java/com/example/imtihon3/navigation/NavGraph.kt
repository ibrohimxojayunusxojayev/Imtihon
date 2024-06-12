package com.example.imtihon3.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.imtihon3.database.AppDatabase
import com.example.imtihon3.screens.detail.DetailView
import com.example.imtihon3.screens.detail.DetailViewModel
import com.example.imtihon3.screens.primary.PrimaryModel
import com.example.imtihon3.screens.primary.PrimaryView
import com.example.imtihon3.screens.primary.PrimaryViewModel
import com.example.imtihon3.screens.splash.SplashView

@Composable
fun AppNavigation(navController: NavHostController) {
    val db = AppDatabase.getInstance(LocalContext.current)
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            SplashView(navController = navController)
        }
        composable(route = Screen.Primary.route) {
            val primaryModel = PrimaryModel(db)
            val primaryViewModel = PrimaryViewModel(primaryModel, navController)
            PrimaryView(primaryViewModel)
        }
        composable(Screen.Detail.route, arguments = listOf(navArgument("id") {
            type = NavType.IntType
        })) {
            val id = it.arguments?.getInt("id")!!
            val book = db.getBookDao().getBook(id)
            val primaryModel = PrimaryModel(db)
            val dvm = DetailViewModel(primaryModel)
            DetailView(dvm = dvm, navController = navController, book)
        }
    }
}
