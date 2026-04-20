package com.kolyambus.lab3mobile

import java.io.Serializable

data class Tip(
    val day: Int,
    val header: Int,
    val shortDesc: Int,
    val longDesc: Int,
    val image: Int
) : Serializable