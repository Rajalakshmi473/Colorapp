package com.example.colorapp.data.repository

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.example.colorapp.data.model.Color

class FirebaseRepository {

    private val database: DatabaseReference = FirebaseDatabase.getInstance().reference.child("colors")

    fun syncColors(colors: List<Color>) {
        colors.forEach { color ->
            database.child(color.id.toString()).setValue(color)
        }
    }
}
