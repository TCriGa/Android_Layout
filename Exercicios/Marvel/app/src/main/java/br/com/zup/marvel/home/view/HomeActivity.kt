package br.com.zup.marvel.home.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.marvel.*
import br.com.zup.marvel.home.model.Personagens
import br.com.zup.marvel.home.view.adapter.HomeAdapter
import br.com.zup.marvel.databinding.ActivityHomeBinding
import br.com.zup.marvel.detalhe.DetalheActivity
import br.com.zup.marvel.home.viewmodel.HomeViewModel

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel : HomeViewModel by lazy {
        ViewModelProvider(this)[HomeViewModel::class.java]
    }

    private val adapter: HomeAdapter by lazy {
        HomeAdapter(arrayListOf(), this::irParaDetalheFilme)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirRV()
        binding.textView.setOnLongClickListener {
            viewModel.getAllPersonagens()
            return@setOnLongClickListener true
        }
    }

    private fun exibirRV() {
        adicionarPersonagens()
        binding.rvPersonagens.adapter = adapter
        binding.rvPersonagens.layoutManager = LinearLayoutManager(this)
    }

    private fun adicionarPersonagens() {
        viewModel.response.observe(this){
            adapter.atualizarListaFilme(it)
        }

    }

    private fun irParaDetalheFilme(personagens: Personagens) {
        val intent = Intent(this, DetalheActivity::class.java).apply {
            putExtra(CHAVE_MARVEL,personagens)
        }
        startActivity(intent)
    }

}