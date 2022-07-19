package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val nome = findViewById<TextView>(R.id.textView)
        //nome.text = "Engates HongKong"
        //val tipo = findViewById<TextView>(R.id.tipo)
        //tipo.text = "Honnda City"
        //val valor = findViewById<TextView>(R.id.valor)
        //valor.text = "269,00R$"
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter()
    }


}