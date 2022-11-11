package com.example.my_new_bottom

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        var entradatext : EditText = findViewById(R.id.Txt)
        var text: String = entradatext.text.toString()
        text = text

        Toast.makeText(this, "El Mensaje es: "+ text, Toast.LENGTH_LONG).show()
    }
}