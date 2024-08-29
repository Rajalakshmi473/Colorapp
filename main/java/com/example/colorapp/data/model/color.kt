package com.example.colorapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "colors")
data class Color(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val color: String,
    val time: Long
)
