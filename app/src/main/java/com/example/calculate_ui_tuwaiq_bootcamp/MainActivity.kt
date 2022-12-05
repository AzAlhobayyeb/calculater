package com.example.calculate_ui_tuwaiq_bootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculate_ui_tuwaiq_bootcamp.databinding.ActivityMainBinding
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val number1 = binding.etNum1.text.toString()
        val number2 = binding.etNum2.text.toString()


        binding.bAdd.setOnClickListener { calAdd() }

        binding.bMinus.setOnClickListener { calMinus() }

        binding.bMutli.setOnClickListener { calMul() }

        binding.bDivide.setOnClickListener { calDiv()}
    }
        private fun calAdd(){
            val numberOne = binding.etNum1.text.toString()
            val num1Double = numberOne.toDoubleOrNull()
            if (num1Double == null){
                Toast.makeText(applicationContext,"Please enter a Number", Toast.LENGTH_SHORT).show()
                return
            }
            val numbertwo = binding.etNum2.text.toString()
            val number2Double = numbertwo.toDoubleOrNull()
            if (number2Double == null){
                Toast.makeText(applicationContext,"Please enter a Number", Toast.LENGTH_SHORT).show()
                return
            }
            val result = num1Double + number2Double

            val formatResult =NumberFormat.getInstance().format(result)
            binding.tv2.text = formatResult
        }

    private fun calMinus(){
        val numberOne = binding.etNum1.text.toString()
        val num1Double = numberOne.toDoubleOrNull()
        if (num1Double == null){
            Toast.makeText(applicationContext,"Please enter a Number", Toast.LENGTH_SHORT).show()
            return
        }
        val numbertwo = binding.etNum2.text.toString()
        val number2Double = numbertwo.toDoubleOrNull()
        if (number2Double == null){
            Toast.makeText(applicationContext,"Please enter a Number", Toast.LENGTH_SHORT).show()
            return
        }
        val result = num1Double - number2Double

        val formatResult =NumberFormat.getInstance().format(result)
        binding.tv2.text = formatResult
    }

    private fun calMul(){
        val numberOne = binding.etNum1.text.toString()
        val num1Double = numberOne.toDoubleOrNull()
        if (num1Double == null){
            Toast.makeText(applicationContext,"Please enter a Number", Toast.LENGTH_SHORT).show()
            return
        }
        val numbertwo = binding.etNum2.text.toString()
        val number2Double = numbertwo.toDoubleOrNull()
        if (number2Double == null){
            Toast.makeText(applicationContext,"Please enter a Number", Toast.LENGTH_SHORT).show()
            return
        }
        val result = num1Double * number2Double

        val formatResult =NumberFormat.getInstance().format(result)
        binding.tv2.text = formatResult
    }

    private fun calDiv(){
        val numberOne = binding.etNum1.text.toString()
        val num1Double = numberOne.toDoubleOrNull()
        if (num1Double == null){
            Toast.makeText(applicationContext,"Please enter a Number", Toast.LENGTH_SHORT).show()
            return
        }
        val numbertwo = binding.etNum2.text.toString()
        val number2Double = numbertwo.toDoubleOrNull()
        if (number2Double == null){
            Toast.makeText(applicationContext,"Please enter a Number", Toast.LENGTH_SHORT).show()
            return
        }
        val result = num1Double / number2Double

        val formatResult =NumberFormat.getInstance().format(result)
        binding.tv2.text = formatResult
    }

}
