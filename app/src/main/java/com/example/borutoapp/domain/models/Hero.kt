package com.example.borutoapp.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.borutoapp.util.constants.HERO_DATABASE_TABLE

@Entity(tableName = HERO_DATABASE_TABLE)
data class Hero(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val family: List<String>,
    val abilities: List<String>,
    val natureType: List<String>
)
