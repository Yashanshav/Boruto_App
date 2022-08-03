package com.example.borutoapp.data.repository

import androidx.paging.PagingData
import androidx.paging.PagingSource
import com.example.borutoapp.domain.models.Hero
import com.example.borutoapp.domain.repository.DataStoreOperations
import com.example.borutoapp.domain.repository.LocalDataSource
import com.example.borutoapp.domain.repository.RemoteDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(
    private val local: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val dataStore: DataStoreOperations
) {

    fun getAllHeroes(): Flow<PagingData<Hero>> {
        return remoteDataSource.getAllHeroes()
    }

    fun searchAllHeroes(query: String): Flow<PagingData<Hero>> {
        return remoteDataSource.searchHeroes(query = query)
    }

    suspend fun getSelectedHero(heroId: Int): Hero {
        return local.getSelectedHero(heroId = heroId)
    }

    suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.saveOnBoardingState(completed)
    }

    fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.readOnBoardingState()
    }

}