package com.example.colorapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.colorapp.data.model.Color

@Dao
interface ColorDao {
    @Insert
    suspend fun insertColor(color: Color)

    @Query("SELECT * FROM colors")
    fun getAllColors(): LiveData<List<Color>>

    @Query("DELETE FROM colors")
    suspend fun deleteAll()
}
