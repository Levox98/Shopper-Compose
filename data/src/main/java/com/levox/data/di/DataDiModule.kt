package com.levox.data.di

import com.levox.data.database.ShopItemDatabase
import com.levox.data.repository.ShopItemRepositoryImpl
import com.levox.domain.repository.ShopItemRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataDiModule {

    @Provides
    @Singleton
    fun provideShopItemDao(database: ShopItemDatabase) = database.shopItemDao()

    @Provides
    @Singleton
    fun bindShopItemRepository(repository: ShopItemRepositoryImpl): ShopItemRepository = repository
}