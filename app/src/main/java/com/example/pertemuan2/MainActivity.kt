package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        buat tanpa binding
//        val btnToast = findViewById<Button>(R.id.btn_toast)

        with(binding){
            txtNumber.text = number.toString()
            btnCount.setOnClickListener(){
                number++
                txtNumber.text = number.toString()
            }
            btnToast.setOnClickListener{
                Toast.makeText(this@MainActivity, number.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}