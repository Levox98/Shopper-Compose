package com.levox.domain.repositories

import com.levox.domain.entities.ShopItem

interface ShopItemRepository {
    fun addItem(shopItem: ShopItem)
    fun deleteItem(shopItem: ShopItem)
}