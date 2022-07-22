package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.model.Produto
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

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
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste",
                    descricao = "teste desc",
                    valor = BigDecimal("19.99")
                ),
            Produto(nome = "teste 01",
                    descricao = "teste desc 01",
                    valor = BigDecimal("29.99")
            )
        ))
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

}