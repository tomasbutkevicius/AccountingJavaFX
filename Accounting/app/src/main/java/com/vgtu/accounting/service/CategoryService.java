package com.vgtu.accounting.service;

import com.vgtu.accounting.response.CategoryResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CategoryService {

    @GET("categories/user/{id}")
    Call<List<CategoryResponse>> getUserCategories(@Path("id") String id);

    @GET("categories")
    Call<List<CategoryResponse>> getCategories();

    @GET("categories/{id}")
    Call<CategoryResponse> getCategory(@Path("id") String id);

}
