package com.example.mipt_2lab

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import androidx.activity.ComponentActivity

class WordCount()
{
    fun count(input: String): Int
    {
        val words = input.split("\\w+".toRegex())
        val count = words.count() - 1
        return count
    }
}
class SymbolCount()
{
    fun count(input: String): Int
    {
        var count = 0
        for (i in 0..input.length - 1)
        {
            val ch = input[i]
            if (ch != ' ')
            {
                ++count
            }
        }
        return count
    }
}
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val counterType = resources.getStringArray(R.array.choices)
        val counterInput : EditText = findViewById(R.id.editText)
        val buttonStatus : Button = findViewById(R.id.button1)
        val answer : TextView = findViewById(R.id.textView)
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null)
        {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, counterType)
            spinner.adapter = adapter
        }
        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long)
            {
                when (position) {
                    0 -> {
                        buttonStatus.setOnClickListener{
                            val counterInputError : String = counterInput.text.toString()
                            if(counterInputError.trim().isEmpty())
                            {
                                answer.setTextColor(Color.RED)
                                answer.text = "Klaida. Įvesties laukas yra tuščias."
                            }
                            else
                            {
                               answer.setTextColor(Color.BLACK)
                               answer.text = "Žodžių kiekis duotame tekste: " + WordCount().count(counterInputError).toString()
                            }
                        }
                    }

                    1 -> {
                        buttonStatus.setOnClickListener{
                            val counterInputError : String = counterInput.text.toString()
                            if(counterInputError.trim().isEmpty())
                            {
                                answer.setTextColor(Color.RED)
                                answer.text = "Klaida. Įvesties laukas yra tuščias."
                            }
                            else
                            {
                                answer.setTextColor(Color.BLACK)
                                answer.text = "Simbolių kiekis duotame tekste: " + SymbolCount().count(counterInputError).toString()
                            }
                        }
                    }

                    else -> {}
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?)
            {
                buttonStatus.setOnClickListener {
                    answer.setTextColor(Color.RED)
                    answer.text = "Klaida. Nepasirinktas skaičiavimo tipas"
                }
            }
        }



    }
}