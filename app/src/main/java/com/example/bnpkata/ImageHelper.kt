package com.example.bnpkata

import android.content.Context
import android.widget.ImageView

object ImageHelper {
    fun ImageView.displayValue(context: Context, value: String) {
        this.setColorFilter(context.getColor(if(value == "Y") R.color.yellow else R.color.black))
    }

    fun ImageView.displayValue(context: Context, value: Char) {
        this.setColorFilter(context.getColor(if(value.toString() == "Y") R.color.yellow else R.color.black))
    }
}