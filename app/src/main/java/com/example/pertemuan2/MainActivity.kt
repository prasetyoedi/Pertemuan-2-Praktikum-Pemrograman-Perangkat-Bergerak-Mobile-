package com.example.pertemuan2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val adminUsername = "admin"
            val adminPasswd = "123"

            loginBtn.setOnClickListener{
                val valueUsername = usn.text.toString()
                val valuePasswd = pass.text.toString()

                if (valueUsername == adminUsername && valuePasswd == adminPasswd) {
                    Toast.makeText(
                        this@MainActivity,
                        "Login Sukses",
                        Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Login Gagal",
                        Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}