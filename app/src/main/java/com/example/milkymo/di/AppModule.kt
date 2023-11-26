package com.example.milkymo.di

import android.app.Application
import com.example.milkymo.data.manager.LocalUserManagerImpl
import com.example.milkymo.domain.manager.LocalUserManager
import com.example.milkymo.domain.usecases.AppEntryUseCases
import com.example.milkymo.domain.usecases.ReadAppEntry
import com.example.milkymo.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}