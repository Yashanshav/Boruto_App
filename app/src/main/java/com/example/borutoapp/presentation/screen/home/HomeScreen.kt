package com.example.borutoapp.presentation.screen.home

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.example.borutoapp.navigation.Screen
import com.example.borutoapp.presentation.common.ListContent
import com.example.borutoapp.presentation.components.RatingWidget
import com.example.borutoapp.presentation.screen.search.SearchScreen
import com.example.borutoapp.ui.theme.LARGE_PADDING

@ExperimentalCoilApi
@Composable
fun HomeScreen(
    navController: NavHostController,
    homeViewModel: HomeViewModel = hiltViewModel()
) {
    Log.d("REQUEST MADE", "Home Screen Launched")
    val allHeroes = homeViewModel.getAllHeroes.collectAsLazyPagingItems()

    Scaffold (
        topBar =  {
            HomeTopBar(onSearchClicked = {
                navController.navigate(Screen.Search.route)
            })
        },
        content = {
            Log.d("LIST CONTENT", "List Content method initiated")
            ListContent(heroes = allHeroes, navController = navController)
        }
    )


}
