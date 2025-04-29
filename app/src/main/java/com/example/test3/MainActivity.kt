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

            val name = bindingClass.edName.text.toString()

            when(name){
                Constance.dvornik-> {
                    bindingClass.tvRes.visibility = View.VISIBLE
                    val tempText = "ваша зарплата: ${Constance.dvornik_salary}"
                    if(bindingClass.edPswd.text.toString().toInt() == Constance.dvornik_pswd)
                        bindingClass.tvRes.text = tempText
                    else
                        bindingClass.tvRes.text = "введен неверный код"
                }
                Constance.manager-> {
                    bindingClass.tvRes.visibility = View.VISIBLE
                    val tempText = "ваша зарплата: ${Constance.manager_salary}"
                    if(bindingClass.edPswd.text.toString().toInt() == Constance.manager_pswd)
                        bindingClass.tvRes.text = tempText
                    else
                        bindingClass.tvRes.text = "введен неверный код"
                }
                Constance.director-> {
                    bindingClass.tvRes.visibility = View.VISIBLE
                    val tempText = "ваша зарплата: ${Constance.director_salary}"
                    if(bindingClass.edPswd.text.toString().toInt() == Constance.director_pswd)
                        bindingClass.tvRes.text = tempText
                    else
                        bindingClass.tvRes.text = "введен неверный код"
                }
                else-> {
                    bindingClass.tvRes.visibility = View.VISIBLE
                    bindingClass.tvRes.text = "нет такого"
                }
            }
        }

    }
}