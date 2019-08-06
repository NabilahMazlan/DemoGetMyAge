package com.example.demogetmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener(View.OnClickListener {
            val userDOB = etDOB.text.toString()
            var output = ""
            if(userDOB.isNotEmpty()){
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year -  userDOB.toInt()
//                if (age < 18){
//                    output = "Underage"
//                }else if(age in 18..65){
//                    output = "Young people"
//                }else if(age in 66..79){
//                    output = "Middle-aged"
//                }else if(age in 80..99){
//                    output = "Elderly"
//                }else{
//                    output = "Long-lived elderly"
//                }
                when(age){
                    in 0..17 -> output = "Underage"
                    in 18..65 -> output = "Young People"
                    in 66..79 -> output = "Middle-aged"
                    in 80..99 -> output = "Elderly"
                    else -> {
                        output = "Long-lived Elderly"
                    }

                }
                tvShowAge.text = "Your are is $age \n You are a/an $output"
            }else{
                Toast.makeText(this, "Please enter your Birth Year", Toast.LENGTH_SHORT).show()
            }



        })
    }
}
