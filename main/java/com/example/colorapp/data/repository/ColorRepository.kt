package com.example.colorapp.data.repository

import androidx.lifecycle.LiveData
import com.example.colorapp.data.dao.ColorDao
import com.example.colorapp.data.model.Color

class ColorRepository(private val colorDao: ColorDao) {

    fun getAllColors(): LiveData<List<Color>> = colorDao.getAllColors()

    suspend fun insertColor(color: Color) = colorDao.insertColor(color)

    suspend fun deleteAll() = colorDao.deleteAll()
}
