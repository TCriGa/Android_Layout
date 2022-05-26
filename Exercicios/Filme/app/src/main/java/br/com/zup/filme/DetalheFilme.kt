package br.com.zup.filme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DetalheFilme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_filme)

        Log.v("App Filme", "Passou pelo onCreat() da Detalhe")
        setContentView(R.layout.activity_detalhe_filme)
    }
}