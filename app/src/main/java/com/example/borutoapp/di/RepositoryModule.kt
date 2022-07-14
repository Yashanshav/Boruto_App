package com.example.borutoapp.di

import android.content.Context
import com.example.borutoapp.data.pref.DataStoreOperationsImpl
import com.example.borutoapp.domain.repository.DataStoreOperations
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent :: class)
object RepositoryModule {

    // how this works:
    /*
    so the dagger hilt library searches all the functions in the library whose return
    type is same as the dependency we are trying to inject.
    and then it will use the block of that function to provide an instance of that function
     */
    @Provides
    @Singleton
    fun provideDataStoreOperations(
        @ApplicationContext context: Context
    ): DataStoreOperations {
        return DataStoreOperationsImpl(context = context)
    }
}