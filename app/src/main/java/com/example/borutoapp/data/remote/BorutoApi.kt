package com.example.borutoapp.data.remote

import com.example.borutoapp.domain.models.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BorutoApi {

    @GET("/boruto/heroes")
    suspend fun getAllHeroes(
        @Query("page") page: Int = 1
    ): ApiResponse

    @GET("/boruto/heroes/search")
    suspend fun searchAllHeroes(
        @Query("name") name: String
    ): ApiResponse

}