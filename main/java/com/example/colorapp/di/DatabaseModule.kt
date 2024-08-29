package com.example.colorapp.di

import android.content.Context
import com.example.colorapp.data.database.ColorDatabase
import com.example.colorapp.data.repository.ColorRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideColorDatabase(context: Context): ColorDatabase {
        return ColorDatabase.getDatabase(context)
    }

    @Provides
    @Singleton
    fun provideColorRepository(db: ColorDatabase): ColorRepository {
        return ColorRepository(db.colorDao())
    }
}
