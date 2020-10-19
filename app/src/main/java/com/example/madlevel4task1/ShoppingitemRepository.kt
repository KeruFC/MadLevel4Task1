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

    suspend fun insertProduct(shoppingitem: Shoppingitem) {
        shoppingitemDao.insertProduct(shoppingitem)
    }

    suspend fun deleteProduct(shoppingitem: Shoppingitem) {
        shoppingitemDao.deleteProduct(shoppingitem)
    }

    suspend fun deleteAllProducts() {
        shoppingitemDao.deleteAllShoppingitems()
    }

}
