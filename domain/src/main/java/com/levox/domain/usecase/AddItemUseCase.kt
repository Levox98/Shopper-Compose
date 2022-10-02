package com.levox.domain.usecase

import com.levox.domain.entity.ShopItem
import com.levox.domain.repository.ShopItemRepository

class AddItemUseCase(
    private val repository: ShopItemRepository
) {
    operator fun invoke(shopItem: ShopItem) = repository.addItem(shopItem)
}