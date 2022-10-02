package com.levox.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.levox.domain.entities.ShopItem

@Entity(tableName = "shopItem")
data class ShopItemDataEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val amount: Int
) {
    fun toDomain() = ShopItem(name, amount)
}
