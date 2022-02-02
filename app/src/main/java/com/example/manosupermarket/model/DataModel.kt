package com.example.manosupermarket.model



data class DataModel(
    val next: Any? = null,
    val previous: Any? = null,
    val count: Int? = null,
    val results: Results? = null
)

data class FilterItem(
    val count: Int? = null,
    val name: String? = null,
    val id: Int? = null
)

data class OrderItem(
    val itemCount: String? = null,
    val thumbnail: String? = null,
    val isNew: Boolean? = null,
    val price: String? = null,
    val id: Int? = null,
    val type: Int? = null,
    val timestamp: String? = null,
    val status: String? = null
)

data class Results(
    val filter: List<FilterItem?>? = null,
    val order: List<OrderItem?>? = null
)
