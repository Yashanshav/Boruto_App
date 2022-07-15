package com.example.borutoapp.presentation.screen.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    Scaffold (
        topBar =  {
            HomeTopBar(onSearchClicked = {})
        }
    ) {}
}
