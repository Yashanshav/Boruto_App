package com.example.borutoapp.data.local

import androidx.room.RoomDatabase
import com.example.borutoapp.data.local.dao.HeroDao

abstract class HeroDatabase: RoomDatabase() {

    abstract fun heroDao(): HeroDao
}