package io.jonpruessmeier.currencyconverter

import retrofit2.Response
import retrofit2.http.GET

interface CurrencyApi {

    @GET("/currencies")
    fun getCurrencies(): Response<Map<String, String>>

}