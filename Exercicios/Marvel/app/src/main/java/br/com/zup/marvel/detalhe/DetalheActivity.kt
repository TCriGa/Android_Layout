package br.com.zup.marvel.detalhe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.marvel.CHAVE_MARVEL
import br.com.zup.marvel.Class.Personagens
import br.com.zup.marvel.R
import br.com.zup.marvel.databinding.ActivityDetalheBinding

class DetalheActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetalheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(getString(R.string.detalhe))

        recuperarPersonagens()
    }

    private fun recuperarPersonagens(){
        val personagensMarvel = intent.getParcelableExtra<Personagens>(CHAVE_MARVEL)

        if (personagensMarvel != null){
            exibirPersonagens(personagensMarvel)
        }
    }

    private fun exibirPersonagens(personagem : Personagens){
        binding.ivPersonagem.setImageResource(personagem.getImagem())
        binding.textDetalhePersonagem.text = personagem.getDescricao()
        binding.textNomePersonagem.text = personagem.getNome()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}