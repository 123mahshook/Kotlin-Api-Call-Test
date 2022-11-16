package com.filepicker.animals.model

import com.google.gson.annotations.SerializedName

data class ApiKey(
    val message:String?,
    val key:String?
)
data class Animal (val name: String?,
                   val taxonomy:Taxonomy?,
                   val location:String?,
                   val speed: Speed?,
                   val diet:String?,

                   @SerializedName("lifespan")
                   val lifeSpan:String?,

                   @SerializedName("Image")
                   val imageUrl:String?
)


data class Taxonomy(
    val kingdom:String?,
    val order:String?,
    val family:String?
)

data class Speed(
    val metric:String?,
    val imperial:String?
)

//test api class

data class Page(
    val page:Int?,

    @SerializedName("per_page")
    val perPage:Int?,

    val total:Int?,

    @SerializedName("total_pages")
    val totalPages:Int?,

    @SerializedName("data")
    val userData:List<Users>?

)

data class Users(
    val id:Int?,
    val email:String?,

    @SerializedName("first_name")
    val firstName:String?,

    @SerializedName("last_name")
    val lastName:String?,

    @SerializedName("avatar")
    val userImage:String?
)