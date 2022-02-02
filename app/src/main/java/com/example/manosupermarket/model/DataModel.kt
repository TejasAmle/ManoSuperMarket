package com.example.manosupermarket.model

import com.google.gson.annotations.SerializedName


data class DataModel(

    @field:SerializedName("next")
    val next: Any? = null,

    @field:SerializedName("previous")
    val previous: Any? = null,

    @field:SerializedName("count")
    val count: Int? = null,

    @field:SerializedName("results")
    val results: Results? = null
)

data class FilterItem(

    @field:SerializedName("count")
    val count: Int? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
)

data class OrderItem(

    @field:SerializedName("item_count")
    val itemCount: String? = null,

    @field:SerializedName("thumbnail")
    val thumbnail: String? = null,

    @field:SerializedName("is_new")
    val isNew: Boolean? = null,

    @field:SerializedName("price")
    val price: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("type")
    val type: Int? = null,

    @field:SerializedName("timestamp")
    val timestamp: String? = null,

    @field:SerializedName("status")
    val status: String? = null
)

data class Results(

    @field:SerializedName("filter")
    val filter: List<FilterItem?>? = null,

    @field:SerializedName("order")
    val order: List<OrderItem?>? = null
)
