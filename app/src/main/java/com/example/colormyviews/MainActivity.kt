package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        //This doesn't work
        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text,constraint_layout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColord(it) }
        }
    }

    private fun makeColord(view : View){
            when(view.id){
                R.id.box_one_text -> view.setBackgroundColor(Color.BLUE)
                R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
                R.id.box_three_text -> view.setBackgroundColor(Color.GREEN)
                R.id.box_four_text -> view.setBackgroundColor(Color.YELLOW)
                R.id.box_five_text  -> view.setBackgroundColor(Color.RED)
                else -> view.setBackgroundColor(Color.CYAN)


            }
    }
}