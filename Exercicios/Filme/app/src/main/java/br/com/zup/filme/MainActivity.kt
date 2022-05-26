package br.com.zup.filme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoMensagem = findViewById<Button>(R.id.bottom_mensagem)
        botaoMensagem.setOnClickListener {
            Toast.makeText(this, "Esse filme é Maravilhoso!!", Toast.LENGTH_LONG).show()
        }
        val buttonDetalhe = findViewById<Button>(R.id.bottom_detalhe_filme)
        buttonDetalhe.setOnClickListener {
            val intent = Intent(this, DetalheFilme::class.java)
            startActivity(intent)
        }
    }

}
