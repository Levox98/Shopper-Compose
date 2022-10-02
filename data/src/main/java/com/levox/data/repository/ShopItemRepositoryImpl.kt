package com.levox.data.repository

import com.levox.data.database.daos.ShopItemDao
import com.levox.domain.entity.ShopItem
import com.levox.domain.repository.ShopItemRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ShopItemRepositoryImpl @Inject constructor(
    val shopItemDao: ShopItemDao
) : ShopItemRepository {
    override fun addItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }

    override fun deleteItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }
}