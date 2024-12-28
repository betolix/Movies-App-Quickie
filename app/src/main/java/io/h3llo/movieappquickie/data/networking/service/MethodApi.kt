package io.h3llo.movieappquickie.data.networking.service

import retrofit2.http.GET
import retrofit2.http.Query

interface MethodApi {

    // https://api.themoviedb.org/3/movie/upcoming?api_key=2daaecb9ca6189631bfadd5744bf366c&language=es-ES&papa=1
    // URL_BASE -> https://api.themoviedb.org/3/
    // METHOD -> movie/upcoming
    // PARAMETERS -> ?api_key=2daaecb9ca6189631bfadd5744bf366c&language=es-ES&papa=1
    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key") apiKey:String,
        @Query("Language") language:String = "es",
        @Query("page") page: Int = 1
    )



}