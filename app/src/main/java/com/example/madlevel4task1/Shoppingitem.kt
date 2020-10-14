package com.example.madlevel4task1

import androidx.room.*

@Entity(tableName = "shoppingitemTable")
data class Shoppingitem (

    @ColumnInfo(name = "name")
    var shoppingItemName: String,

    @ColumnInfo(name = "quantity")
    var shoppingItemAmount: Short,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)