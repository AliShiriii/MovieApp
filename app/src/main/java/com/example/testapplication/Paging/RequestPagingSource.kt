package com.example.testapplication.Paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.testapplication.Api.RequestApi
import com.example.testapplication.Model.GetContent
import com.example.testapplication.Model.Request
import com.example.testapplication.Model.RequestBody
import com.example.testapplication.Model.SendRequest
import org.json.JSONObject
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RequestPagingSource @Inject constructor(val api: RequestApi) : PagingSource<Int, RequestBody>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, RequestBody> {

        val page = params.key ?: 1

        return try {

            val jsonObject = JSONObject()

            jsonObject.put("requestType", 2)
            jsonObject.put("requestId", " ")
            jsonObject.put("pageSize", 10)
            jsonObject.put("pageIndex", 1)
            jsonObject.put("orderBy", "createdate")
            jsonObject.put("order", "desc")

            val result = api.getBody(SendRequest(jsonObject))

            val response = result

            LoadResult.Page(

                data = response!!,
                prevKey = if (page == 1) null else page -1,
                nextKey = if (response.isEmpty()) null else page +1

            )

        }catch (exception : IOException){

            LoadResult.Error(exception)
        }catch (exception : HttpException){

            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, RequestBody>): Int? {
        TODO("Not yet implemented")
    }
}