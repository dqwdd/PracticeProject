package com.example.practiceproject

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    lateinit var mContext: Context


    abstract fun setupEvent()

    abstract fun setValues()

}