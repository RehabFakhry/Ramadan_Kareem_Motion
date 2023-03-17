package com.example.ramadankareemmotion

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import java.lang.Math.abs

class MainActivity : AppCompatActivity() {

//    private lateinit var prayerTime:TextView
//    private lateinit var linearLayout:LinearLayout
    private lateinit var cardView :CardView
    private lateinit var motionLayout: MotionLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

