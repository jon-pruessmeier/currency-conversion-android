package io.jonpruessmeier.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.conversionBtn);

        btn.setOnClickListener {
            val res = RetrofitInstance.api.getCurrencies();
            println(res.toString());
        }
    }
}