package com.rian.beritaapp.data.remote

import com.rian.beritaapp.BuildConfig
import com.rian.beritaapp.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET("v2/top-headlines?country=us")
    fun getTopHeadlines(
        @Query("apiKey") apiKey: String = BuildConfig.NEWS_API_KEY
    ): Call<NewsResponse>
}

