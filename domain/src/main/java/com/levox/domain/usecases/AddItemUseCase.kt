package com.levox.domain.usecases

import com.levox.domain.entities.ShopItem
import com.levox.domain.repositories.ShopItemRepository

class AddItemUseCase(
    private val repository: ShopItemRepository
) {
    operator fun invoke(shopItem: ShopItem) = repository.addItem(shopItem)
}