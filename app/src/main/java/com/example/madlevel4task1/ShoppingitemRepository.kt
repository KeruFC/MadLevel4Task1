package com.example.madlevel4task1

import android.content.Context

class ShoppingitemRepository(context: Context) {

    private val shoppingitemDao: ShoppingitemDao

    init {
        val database = ShoppingListRoomDatabase.getDatabase(context)
        shoppingitemDao = database!!.productDao()
    }

    suspend fun getAllProducts(): List<Shoppingitem> {
        return shoppingitemDao.getAllShoppingitems()
    }

    suspend fun insertProduct(product: Shoppingitem) {
        shoppingitemDao.insertProduct(product)
    }

    suspend fun deleteProduct(product: Shoppingitem) {
        shoppingitemDao.deleteProduct(product)
    }

    suspend fun deleteAllProducts() {
        shoppingitemDao.deleteAllShoppingitems()
    }

}
