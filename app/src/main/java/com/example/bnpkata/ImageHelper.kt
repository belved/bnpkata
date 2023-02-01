package com.example.bnpkata

import android.content.Context
import android.widget.ImageView

object ImageHelper {
    fun ImageView.displayValue(context: Context, value: String) {
        this.setColorFilter(context.getColor(if(value == "Y") R.color.yellow else R.color.black))
    }
}