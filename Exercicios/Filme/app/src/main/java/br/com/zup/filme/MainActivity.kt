package br.com.zup.filme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    companion object{
        const val TAG = "APP_FILME"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoMensagem = findViewById<Button>(R.id.bottom_mensagem)
        botaoMensagem.setOnClickListener {
            Toast.makeText(this, "Esse filme é Maravilhoso!!", Toast.LENGTH_LONG).show()
        }

       val botaoEmail = findViewById<Button>(R.id.button_email)
        botaoEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/html"
            intent.putExtra(Intent.EXTRA_EMAIL, "emaildo@diretor.com")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Assunto")
            intent.putExtra(Intent.EXTRA_TEXT, "Eu sou o corpo do email")

            startActivity(intent)
        }


        val buttonDetalhe = findViewById<Button>(R.id.bottom_detalhe_filme)
        buttonDetalhe.setOnClickListener {
            val intent = Intent(this, DetalheFilme::class.java)
            startActivity(intent)
        }
    }
}
