package com.example.colorapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.colorapp.data.model.Color
import com.example.colorapp.data.repository.ColorRepository
import com.example.colorapp.data.repository.FirebaseRepository
import dagger.hilt.android.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ColorViewModel @Inject constructor(
    private val colorRepository: ColorRepository,
    private val firebaseRepository: FirebaseRepository
) : ViewModel() {

    val allColors: LiveData<List<Color>> = colorRepository.getAllColors()

    fun addColor(color: Color) = viewModelScope.launch {
        colorRepository.insertColor(color)
    }

    fun syncColors() = viewModelScope.launch {
        val colors = allColors.value ?: emptyList()
        firebaseRepository.syncColors(colors)
    }
}
