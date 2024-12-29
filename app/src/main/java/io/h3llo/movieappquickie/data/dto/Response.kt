package io.h3llo.movieappquickie.data.dto

data class MovieResponse(
    val results : List<MovieDto>
)

data class MovieDto(
    val id:Int,
    val title:String
)