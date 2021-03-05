package com.besugos.dioapi.model

import com.google.gson.annotations.SerializedName

data class Product (
    @SerializedName("id")
    val id: String,
    @SerializedName("prname")
    val prname: String,
    @SerializedName("primage")
    val primage: String,
    @SerializedName("prprice")
    val prprice: String

    )