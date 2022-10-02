package com.levox.data.repository

import com.levox.data.database.daos.ShopItemDao
import com.levox.data.entity.toData
import com.levox.domain.entity.ShopItem
import com.levox.domain.repository.ShopItemRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ShopItemRepositoryImpl @Inject constructor(
    private val shopItemDao: ShopItemDao
) : ShopItemRepository {
    override suspend fun addItem(shopItem: ShopItem) {
        shopItemDao.insertShopItem(shopItem.toData())
    }

    override suspend fun deleteItem(shopItemId: Int) {
        shopItemDao.deleteShopItem(shopItemId)
    }
}