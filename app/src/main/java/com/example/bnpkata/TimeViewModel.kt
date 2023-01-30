package com.example.bnpkata

import android.util.Log
import java.util.Date

class TimeViewModel {

    fun getSingleMinutesRow(date: Date): String {
        return convertTimeToString( date.minutes%5, 4)
    }

    fun getFiveMinutesRow(date: Date): String {
        return convertTimeToString(date.minutes/5, 11)
    }

    private fun convertTimeToString(time: Int, numberOfPosition: Int): String {
        var index = 1
        var stringPosition = ""

        while(index <= numberOfPosition) {
            stringPosition += if(index <= time) "Y" else "0"
            index++
        }

        return stringPosition
    }
}