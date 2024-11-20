package com.exercise.splashapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.exercise.splashapp.screens.home.HomeScreen
import com.exercise.splashapp.screens.search.SearchScreen

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route){
            HomeScreen(navHostController)
        }
        composable(route = Screen.Search.route){
            SearchScreen(navHostController)
        }
    }
}