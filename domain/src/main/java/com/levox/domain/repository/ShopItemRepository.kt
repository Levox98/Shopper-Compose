package com.levox.domain.repository

import com.levox.domain.entity.ShopItem

interface ShopItemRepository {
    suspend fun addItem(shopItem: ShopItem)
    suspend fun deleteItem(shopItemId: Int)
}