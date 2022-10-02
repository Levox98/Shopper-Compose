package com.levox.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.levox.domain.entity.ShopItem

@Entity(tableName = "shopItem")
data class ShopItemDataEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val amount: Int
) {
    fun toDomain() = ShopItem(id, name, amount)
}

fun ShopItem.toData() = ShopItemDataEntity(id, name, amount)
