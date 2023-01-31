package com.example.bnpkata

import org.junit.Assert
import org.junit.Test
import java.util.*

class SecondsConversionTest {

    private val viewModel = TimeViewModel()

    @Test
    fun getSecondsTimeOne() {
        val date = Date(2010,10,10,1,25,1)
        Assert.assertEquals(viewModel.getSecondsRow(date), "0")
    }

    @Test
    fun getSecondsTimeTwo() {
        val date = Date(2010,10,10,1,25,2)
        Assert.assertEquals(viewModel.getSecondsRow(date), "Y")
    }
}