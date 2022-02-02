package com.example.manosupermarket.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.manosupermarket.databinding.OrdersListBinding

class OrdersAdapter:  RecyclerView.Adapter<OrderListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderListViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: OrderListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}


data class OrderListViewHolder(val binding: OrdersListBinding) :
    RecyclerView.ViewHolder(binding.root)