package com.example.bnpkata

import org.junit.Assert
import org.junit.Test
import java.util.*

class MinutesConvertionTest {

    private val viewModel = TimeViewModel()

    @Test
    fun getSingleMinuteTimeZero() {
        val date = Date(2010,10,10,1,5,0)
        Assert.assertEquals(viewModel.getSingleMinutesRow(date), "0000")
    }

    @Test
    fun getSingleMinuteTimeOne() {
        val date = Date(2010,10,10,1,6,0)
        Assert.assertEquals(viewModel.getSingleMinutesRow(date), "Y000")
    }

    @Test
    fun getSingleMinuteTimeTwo() {
        val date = Date(2010,10,10,1,7,0)
        Assert.assertEquals(viewModel.getSingleMinutesRow(date), "YY00")
    }

    @Test
    fun getSingleMinuteTimeThree() {
        val date = Date(2010,10,10,1,8,0)
        Assert.assertEquals(viewModel.getSingleMinutesRow(date), "YYY0")
    }

    @Test
    fun getSingleMinuteTimeFour() {
        val date = Date(2010,10,10,1,9,0)
        Assert.assertEquals(viewModel.getSingleMinutesRow(date), "YYYY")
    }

}