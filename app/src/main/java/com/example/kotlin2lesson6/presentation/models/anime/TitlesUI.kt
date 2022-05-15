package com.example.kotlin2lesson6.presentation.models.anime

import com.example.domain.models.anime.TitlesModel


data class TitlesUI(
    val en: String?,
    val enJp: String?,
    val jaJp: String?
)

fun TitlesModel.toUI() = TitlesUI(en, enJp, jaJp)
