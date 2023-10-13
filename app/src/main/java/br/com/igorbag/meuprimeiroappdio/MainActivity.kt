package br.com.igorbag.meuprimeiroappdio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textGreetings = findViewById<TextView>(R.id.textGreetings)

        val calendar = Calendar.getInstance();
        val timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        val greetings: String = when (timeOfDay) {
            in 0..11 -> getText(R.string.morning).toString()
            in 12..15 -> getText(R.string.afternoon).toString()
            else -> getText(R.string.night).toString()
        }

        textGreetings.text = greetings

        //O desafio sera criar uma valor dentro do string.xml
        // E trocar o texto do xml e tornar internacional (Ingles, Espanhol, etc...)
    }
}