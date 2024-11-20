package com.exercise.splashapp.screens.home

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import com.exercise.splashapp.navigation.Screen
import com.exercise.splashapp.screens.common.ListContent

@Composable
fun HomeScreen(navHostController: NavHostController,     homeViewModel: HomeViewModel = hiltViewModel()) {
    val getAllImages = homeViewModel.getAllImages.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            HomeTopBar(
                onSearchClicked = {
                    navHostController.navigate(Screen.Search.route)
                }
            )
        },
        content = { it ->
            ListContent(items = getAllImages, it)
        }
    )
}