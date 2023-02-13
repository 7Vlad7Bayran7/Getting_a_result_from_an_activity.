package com.example.binnding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import com.example.binnding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val launcher = registerForActivityResult(StartActivityForResult()) { it ->
        Log.i("MyLog", "Getting a result from an activity")
        if (it.resultCode == RESULT_OK) {
            println(it.data?.getStringExtra("Test1"))
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            binding.bt1.setOnClickListener() {
            launcher.launch(Intent(this, SecondActivity2::class.java))
        }
    }


}