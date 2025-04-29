package com.example.test3

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.test3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btRes.setOnClickListener {

            val sumZP = bindingClass.edValue.text.toString().toInt()
            val name = bindingClass.edName.text.toString()

            bindingClass.tvRes.visibility = View.VISIBLE
            bindingClass.tvRes.text = "Накинул  $name $sumZP долларов"


            when(sumZP){
                in 0..10000 -> {
                    bindingClass.tvBot.visibility = View.VISIBLE
                    bindingClass.tvBot.text = "мало"
                }
                in 10000..1000000 -> {
                    bindingClass.tvBot.visibility = View.VISIBLE
                    bindingClass.tvBot.text = "норм"
                }
                in 100000..1000000 -> {
                    bindingClass.tvBot.visibility = View.VISIBLE
                    bindingClass.tvBot.text = "окееей"
                }
                else-> {
                    bindingClass.tvBot.visibility = View.VISIBLE
                    bindingClass.tvBot.text = "не верю"
                }
            }
        }

    }
}