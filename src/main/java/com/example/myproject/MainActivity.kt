package com.example.myproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myprojecaat.constance.Constance
import com.example.myproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingClass.root)



        bindingClass.button.setOnClickListener {
           val result = bindingClass.editT1.text.toString()

            bindingClass.image.visibility = View.VISIBLE
            bindingClass.textV2.visibility = View.VISIBLE


            when(result){

                Constance.DIRECTOR -> {
                    val text = "зарплата ${Constance.DIRECTOR_ZP}"
                    if (bindingClass.editT2.text.toString().toInt() == Constance.DIRECTOR_PASSWORD) {
                        bindingClass.textV2.text = text
                        bindingClass.image.setImageResource(R.drawable.andreyy)
                        bindingClass.textV2.setBackgroundColor(Color.GREEN)

                    }
                }

                Constance.INJINER -> {
                    val text = "зарплата ${Constance.INJINER_ZP}"
                    if (bindingClass.editT2.text.toString().toInt() == Constance.INJINER_PASSWORD){
                        bindingClass.textV2.text = text
                        bindingClass.image.setImageResource(R.drawable.bob)
                        bindingClass.textV2.setBackgroundColor(Color.GREEN)
                    }



                }

                Constance.DVORNIK -> {
                    val text = "${Constance.DVORNIK_ZP}"
                    if (bindingClass.editT2.text.toString().toInt() == Constance.DVORNIK_PASSWORD){
                        bindingClass.textV2.text = text
                        bindingClass.image.setImageResource(R.drawable.victor)
                        bindingClass.textV2.setBackgroundColor(Color.GREEN)
                    }

                }
                else -> {
                    bindingClass.textV2.text = "неверныйе имя или пароль"
                    bindingClass.textV2.setBackgroundColor(Color.RED)
                    bindingClass.image.setImageResource(R.drawable.not)
                }

            }

         }
    }
}


