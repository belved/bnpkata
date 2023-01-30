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

    @Test
    fun getFiveMinuteTimeZero() {
        val date = Date(2010,10,10,1,4,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "00000000000")
    }

    @Test
    fun getFiveMinuteTimeOne() {
        val date = Date(2010,10,10,1,5,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "Y0000000000")
    }

    @Test
    fun getFiveMinuteTimeTwo() {
        val date = Date(2010,10,10,1,10,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YY000000000")
    }

    @Test
    fun getFiveMinuteTimeThree() {
        val date = Date(2010,10,10,1,15,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYY00000000")
    }

    @Test
    fun getFiveMinuteTimeFour() {
        val date = Date(2010,10,10,1,20,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYYY0000000")
    }

    @Test
    fun getFiveMinuteTimeFive() {
        val date = Date(2010,10,10,1,25,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYYYY000000")
    }

    @Test
    fun getFiveMinuteTimeSix() {
        val date = Date(2010,10,10,1,30,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYYYYY00000")
    }

    @Test
    fun getFiveMinuteTimeSeven() {
        val date = Date(2010,10,10,1,35,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYYYYYY0000")
    }

    @Test
    fun getFiveMinuteTimeHeight() {
        val date = Date(2010,10,10,1,40,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYYYYYYY000")
    }

    @Test
    fun getFiveMinuteTimeNine() {
        val date = Date(2010,10,10,1,45,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYYYYYYYY00")
    }

    @Test
    fun getFiveMinuteTimeTen() {
        val date = Date(2010,10,10,1,50,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYYYYYYYYY0")
    }

    @Test
    fun getFiveMinuteTimeEleven() {
        val date = Date(2010,10,10,1,55,0)
        Assert.assertEquals(viewModel.getFiveMinutesRow(date), "YYYYYYYYYYY")
    }
}