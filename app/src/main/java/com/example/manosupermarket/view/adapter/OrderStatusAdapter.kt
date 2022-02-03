package com.example.manosupermarket.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.manosupermarket.R
import com.example.manosupermarket.model.FilterItem

class OrderStatusAdapter(val filterItem: ArrayList<FilterItem>) :
    RecyclerView.Adapter<OrderStatusListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderStatusListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.order_status_list, parent, false)
        return OrderStatusListViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderStatusListViewHolder, position: Int) {
        holder.bindItems(filterItem = filterItem[position])
    }

    override fun getItemCount(): Int {
        return filterItem.size
    }
}


class OrderStatusListViewHolder(val binding: View) : RecyclerView.ViewHolder(binding) {
    fun bindItems(filterItem: FilterItem) {

        val orderStatus = binding.findViewById(R.id.order_status_et) as TextView
        val orderNumber = binding.findViewById(R.id.order_number)  as TextView

        orderStatus.text = filterItem.name
        orderNumber.text = filterItem.count.toString()

    }
}