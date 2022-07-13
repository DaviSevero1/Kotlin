package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = findViewById<TextView>(R.id.textView)
        nome.text = "Engates HongKong"
        val tipo = findViewById<TextView>(R.id.tipo)
        tipo.text = "Honnda City"
        val valor = findViewById<TextView>(R.id.valor)
        valor.text = "269,00R$"
    }


}