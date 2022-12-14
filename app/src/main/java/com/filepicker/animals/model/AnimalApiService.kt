package com.filepicker.animals.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class AnimalApiService {
    private val BASE_URL="https://reqres.in/api/"

    private val api=Retrofit.Builder().
            baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(AnimalApi::class.java)

    fun getApiKey():Single<Page>{
        return api.getApiKey()
    }

  /*  fun getAnimals(key:String):Single<List<Animal>>{
        return api.getAnimals(key)
    }*/
}