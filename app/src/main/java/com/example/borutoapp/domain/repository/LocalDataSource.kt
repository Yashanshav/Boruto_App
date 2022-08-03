package com.example.borutoapp.domain.repository

import com.example.borutoapp.domain.models.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}