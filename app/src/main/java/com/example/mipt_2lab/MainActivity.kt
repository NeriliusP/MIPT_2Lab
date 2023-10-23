package com.example.mipt_2lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.view.View
import android.widget.*
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mipt_2lab.ui.theme.MIPT_2LabTheme


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val counterType = resources.getStringArray(R.array.choices)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val counterInput : EditText = findViewById(R.id.editText)
        val buttonStatus : Button = findViewById(R.id.button1)
        if(spinner!=null)
        {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, counterType)
            spinner.adapter = adapter
        }
        buttonStatus 
        if(counter_input == null)
        {

        }

    }
}