package com.example.borutoapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.borutoapp.domain.models.Hero
import com.example.borutoapp.domain.models.HeroRemoteKey

@Dao
interface HeroRemoteKeyDao {

    @Query("SELECT * FROM hero_remote_key_table WHERE id = :id")
    fun getRemoteKey(id: Int): HeroRemoteKey?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addAllRemoteKeys(heroRemoteKeys: List<HeroRemoteKey>)

    @Query("DELETE FROM hero_remote_key_table")
    fun deleteAllRemoteKeys()
}