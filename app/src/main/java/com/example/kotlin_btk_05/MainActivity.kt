package com.example.kotlin_btk_05

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kotlin_btk_05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    fun toplabtn(view: View){
        val num1 = binding.editTextsayi1.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = binding.editTextsayi2.text.toString().toDoubleOrNull() ?: 0.0

        val toplam = num1 + num2
        binding.textViewSonuc.text = toplam.toString()

    }

    fun cikarmabtn(view: View){
        val num1 = binding.editTextsayi1.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = binding.editTextsayi2.text.toString().toDoubleOrNull() ?: 0.0

        val cikarma = num1 - num2
        binding.textViewSonuc.text = cikarma.toString()

    }

    fun carpmabtn(view: View){
        val num1 = binding.editTextsayi1.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = binding.editTextsayi2.text.toString().toDoubleOrNull() ?: 0.0

        val carpma = num1 * num2
        binding.textViewSonuc.text = carpma.toString()

    }

    fun bölbtn(view: View) {
        val num1 = binding.editTextsayi1.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = binding.editTextsayi2.text.toString().toDoubleOrNull() ?: 0.0

        val bolme = num1 / num2
        binding.textViewSonuc.text = bolme.toString()
    }
}