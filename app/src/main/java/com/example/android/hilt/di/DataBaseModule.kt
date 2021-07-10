package com.example.android.hilt.di

import android.content.Context
import androidx.room.Room
import com.example.android.hilt.data.AppDatabase
import com.example.android.hilt.data.LogDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


/**
 * Created by Raouf Ben Ammar on 10/07/2021.
 */
@InstallIn(SingletonComponent::class)
@Module
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDataBase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "logging.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideLogDao(database: AppDatabase): LogDao {
        return database.logDao()
    }

}