package com.example.madlevel4task1

import androidx.room.*
import kotlinx.coroutines.channels.ProducerScope

@Dao
interface ShoppingitemDao {

    @Query("SELECT * FROM shoppingitemTable")
    suspend fun getAllShoppingitems(): List<Shoppingitem>

    @Insert
    suspend fun insertProduct(shoppingitem: Shoppingitem)

    @Delete
    suspend fun deleteProduct(shoppingitem: Shoppingitem)

    @Query("DELETE FROM shoppingitemTable")
    suspend fun deleteAllShoppingitems()
}