package com.levox.domain.repository

import com.levox.domain.entity.ShopItem

interface ShopItemRepository {
    fun addItem(shopItem: ShopItem)
    fun deleteItem(shopItem: ShopItem)
}