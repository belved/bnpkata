package com.example.bnpkata

import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.bnpkata.ImageHelper.displayValue
import com.example.bnpkata.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!


    private val viewModel = TimeViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addObserver()

        val handler = Handler()
        handler.postDelayed(object : Runnable {
            override fun run() {
                viewModel.computeTime(Date())
                handler.postDelayed(this, 1000)
            }
        },0)
    }

    override fun onDestroy() {
        super.onDestroy()
        removeObserver()
    }

    private fun updateView(view: LinearLayout, value: String) {
        val itemCount = view.childCount
        var index = 0

        while (index <= itemCount) {
            (view.getChildAt(index) as? ImageView)?.displayValue(this, value.substring(index, index+1))
            index++
        }
    }

    private fun addObserver() {
        viewModel.secondsRow.observe(this) { updateView(binding.firstRow, it) }
        viewModel.singleMinutesRow.observe(this) { updateView(binding.fifthRow, it) }
        viewModel.fiveMinutesRow.observe(this) { updateView(binding.fourthRow, it) }
        viewModel.singleHoursRow.observe(this) { updateView(binding.thirdRow, it) }
        viewModel.fiveHoursRow.observe(this) { updateView(binding.secondRow, it) }
    }

    private fun removeObserver() {
        viewModel.secondsRow.removeObservers(this)
        viewModel.singleMinutesRow.removeObservers(this)
        viewModel.fiveMinutesRow.removeObservers(this)
        viewModel.singleHoursRow.removeObservers(this)
        viewModel.fiveHoursRow.removeObservers(this)
    }
}