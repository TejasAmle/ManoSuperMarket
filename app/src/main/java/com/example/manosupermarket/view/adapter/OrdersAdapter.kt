package com.example.manosupermarket.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.manosupermarket.R
import com.example.manosupermarket.model.OrderItem

class OrdersAdapter(val orderItem: ArrayList<OrderItem>) :
    RecyclerView.Adapter<OrderListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.orders_list, parent, false)
        return OrderListViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderListViewHolder, position: Int) {
        holder.bindItems(orderItem = orderItem[position])
    }

    override fun getItemCount(): Int {
        return orderItem.size
    }
}


class OrderListViewHolder(val binding: View) : RecyclerView.ViewHolder(binding) {
    fun bindItems(orderItem: OrderItem) {
        val order = binding.findViewById(R.id.order_number) as TextView
        val price = binding.findViewById(R.id.price) as TextView
        val items = binding.findViewById(R.id.items) as TextView
        val payStatus = binding.findViewById(R.id.pay_status) as ImageView
        val dateTime = binding.findViewById(R.id.date_time) as TextView

        order.text = orderItem.id.toString()
        price.text = orderItem.price
        items.text = orderItem.itemCount
        dateTime.text = orderItem.timestamp
    }
}