package com.example.previsaodotempoapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class PrevisaoHTTP {
    public static Retrofit create(){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.open-meteo.com/v1/forecast?latitude=-26.23&longitude=-51.09&hourly=temperature_2m,precipitation/")
                .build();
    }
}