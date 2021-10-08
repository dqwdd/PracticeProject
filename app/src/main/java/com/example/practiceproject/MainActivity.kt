package com.example.practiceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practiceproject.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {


    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvent()
        setValues()
    }

    override fun setupEvent() {
    }

    override fun setValues() {
    }


}