package com.example.appqr

import retrofit2.http.Query

interface ServicePromo {
    @GET("Promos")
    Call<List<Promo>> ListPromos(@path)
}