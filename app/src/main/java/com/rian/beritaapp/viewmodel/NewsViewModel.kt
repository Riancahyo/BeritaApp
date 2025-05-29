package com.rian.beritaapp.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.rian.beritaapp.data.model.Article
import com.rian.beritaapp.data.model.NewsResponse
import com.rian.beritaapp.data.remote.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsViewModel : ViewModel() {
    var articles by mutableStateOf<List<Article>>(emptyList())
    var isLoading by mutableStateOf(true)

    init {
        getNews()
    }

    private fun getNews() {
        ApiClient.apiService.getTopHeadlines().enqueue(object : Callback<NewsResponse> {
            override fun onResponse(
                call: Call<NewsResponse>,
                response: Response<NewsResponse>
            ) {
                articles = response.body()?.articles ?: emptyList()
                isLoading = false
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                isLoading = false
            }
        })
    }
}

