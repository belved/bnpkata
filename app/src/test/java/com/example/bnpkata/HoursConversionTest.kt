package com.example.bnpkata

import org.junit.Assert
import org.junit.Test
import java.util.*

class HoursConversionTest {

    private val viewModel = TimeViewModel()

    @Test
    fun getSingleHourTimeZero() {
        val date = Date(2010,10,10,0,5,0)
        Assert.assertEquals(viewModel.getSingleHourRow(date), "0000")
    }

    @Test
    fun getSingleHourTimeOne() {
        val date = Date(2010,10,10,1,5,0)
        Assert.assertEquals(viewModel.getSingleHourRow(date), "Y000")
    }

    @Test
    fun getSingleHourTimeTwo() {
        val date = Date(2010,10,10,2,5,0)
        Assert.assertEquals(viewModel.getSingleHourRow(date), "YY00")
    }

    @Test
    fun getSingleHourTimeThree() {
        val date = Date(2010,10,10,3,5,0)
        Assert.assertEquals(viewModel.getSingleHourRow(date), "YYY0")
    }

    @Test
    fun getSingleHourTimeFour() {
        val date = Date(2010,10,10,4,5,0)
        Assert.assertEquals(viewModel.getSingleHourRow(date), "YYYY")
    }

    @Test
    fun getFiveHourTimeZero() {
        val date = Date(2010,10,10,4,5,0)
        Assert.assertEquals(viewModel.getFiveHoursRow(date), "0000")
    }

    @Test
    fun getSeHourTimeOne() {
        val date = Date(2010,10,10,8,5,0)
        Assert.assertEquals(viewModel.getFiveHoursRow(date), "Y000")
    }

    @Test
    fun getFiveHourTimeTwo() {
        val date = Date(2010,10,10,12,5,0)
        Assert.assertEquals(viewModel.getFiveHoursRow(date), "YY00")
    }

    @Test
    fun getFiveHourTimeThree() {
        val date = Date(2010,10,10,16,5,0)
        Assert.assertEquals(viewModel.getFiveHoursRow(date), "YYY0")
    }

    @Test
    fun getFiveHourTimeFour() {
        val date = Date(2010,10,10,23,5,0)
        Assert.assertEquals(viewModel.getFiveHoursRow(date), "YYYY")
    }
}