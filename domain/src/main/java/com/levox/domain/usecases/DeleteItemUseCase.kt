package com.levox.domain.usecases

import com.levox.domain.entities.ShopItem
import com.levox.domain.repositories.ShopItemRepository

class DeleteItemUseCase(
    private val repository: ShopItemRepository
) {
    operator fun invoke(shopItem: ShopItem) = repository.deleteItem(shopItem)
}