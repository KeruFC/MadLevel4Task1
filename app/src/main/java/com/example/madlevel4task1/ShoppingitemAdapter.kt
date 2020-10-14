package com.example.madlevel4task1

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import com.example.madlevel4task1.databinding.ItemShoppingBinding

class ShoppingitemAdapter(private val shoppingItems: List<Shoppingitem>): RecyclerView.Adapter<ShoppingitemAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ItemShoppingBinding.bind(itemView)

        fun databind(shoppingitem: Shoppingitem) {
            binding.tvName.text = shoppingitem.shoppingItemName
            binding.tvAmount.text = shoppingitem.shoppingItemAmount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_shopping, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return shoppingItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(shoppingItems[position])
    }


}