package com.example.borutoapp.domain.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.borutoapp.util.constants.HERO_REMOTE_KEY

@Entity(tableName = HERO_REMOTE_KEY)
data class HeroRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)
