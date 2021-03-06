package com.example.testapplication.Repository

import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.liveData
import com.example.testapplication.Api.RequestApi
import com.example.testapplication.Model.GetContent
import com.example.testapplication.Paging.RequestPagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(private val requestApi: RequestApi) {

    fun getBody() =

        Pager(

           config = PagingConfig(
               pageSize = 8,
               maxSize = 24,
               enablePlaceholders = false
           ),

           pagingSourceFactory = { RequestPagingSource(requestApi) }

       ).liveData
}
