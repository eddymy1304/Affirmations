package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//usar anotaciones de recurso
//para evitar errores de orden
data class Affirmation(@StringRes val stringResourceID: Int, @DrawableRes val imageResourceID: Int) {
}