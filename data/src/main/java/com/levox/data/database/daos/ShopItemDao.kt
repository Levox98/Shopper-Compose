package com.levox.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.levox.data.entity.ShopItemDataEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ShopItemDao {
    @Insert
    suspend fun insertShopItem(shopItemDataEntity: ShopItemDataEntity)

    @Delete
    suspend fun deleteShopItem(shopItemDataEntity: ShopItemDataEntity)

    @Query("SELECT * FROM shopItem")
    fun getAllShopItems(): Flow<List<ShopItemDataEntity>>

    @Query("SELECT * FROM shopItem WHERE id = :id")
    fun getShopItem(id: Int): Flow<ShopItemDataEntity>
}