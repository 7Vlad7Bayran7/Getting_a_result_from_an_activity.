package com.example.binnding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.binnding.databinding.ActivitySecond2Binding

class SecondActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivitySecond2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bt2.setOnClickListener() {
            setResult(RESULT_OK, Intent().putExtra("Test1", "callback works"))
            finish()
        }
    }
}