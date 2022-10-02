package com.levox.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.levox.data.database.daos.ShopItemDao
import com.levox.data.entities.ShopItemDataEntity

@Database(entities = [ShopItemDataEntity::class], version = 1, exportSchema = false)
abstract class ShopItemDatabase : RoomDatabase() {
    abstract fun shopItemDao(): ShopItemDao
}