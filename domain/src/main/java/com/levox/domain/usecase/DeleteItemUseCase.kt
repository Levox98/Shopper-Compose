package com.levox.domain.usecase

import com.levox.domain.entity.ShopItem
import com.levox.domain.repository.ShopItemRepository

class DeleteItemUseCase(
    private val repository: ShopItemRepository
) {
    suspend operator fun invoke(shopItemId: Int) = repository.deleteItem(shopItemId)
}