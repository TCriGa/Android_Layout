package br.com.zup.marvel.home.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.marvel.*
import br.com.zup.marvel.home.model.Personagens
import br.com.zup.marvel.home.view.adapter.HomeAdapter
import br.com.zup.marvel.databinding.ActivityHomeBinding
import br.com.zup.marvel.detalhe.DetalheActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    private val adapter: HomeAdapter by lazy {
        HomeAdapter(arrayListOf(), this::irParaDetalheFilme)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        exibirRV()

    }

    private fun exibirRV() {
        adicionarPersonagens()
        binding.rvPersonagens.adapter = adapter
        binding.rvPersonagens.layoutManager = LinearLayoutManager(this)
    }

    private fun adicionarPersonagens() {
        val listaPersonagens = mutableListOf<Personagens>()

        listaPersonagens.add(
            Personagens(
                BABY_GROOT,
                DETALHE_GROOT,
                R.drawable.baby_groot
            )
        )

        listaPersonagens.add(
            Personagens(
                FENTICEIRA_SCARLATE,
                DETALHE_FENTICEIRA,
                R.drawable.wanda
            )
        )
        listaPersonagens.add(
            Personagens(
                PANTERA_NEGRA,
                DETALHE_PANTERA,
                R.drawable.black_panther_
            )
        )

        listaPersonagens.add(
            Personagens(
                CAPITAO_AMERICA,
                DETALHE_CAPITAO,
                R.drawable.capitao_america
            )
        )

        listaPersonagens.add(
            Personagens(
                ERIK_K,
                DETALHE_ERIK,
                R.drawable.erik_killmonger
            )
        )
        listaPersonagens.add(
            Personagens(
                HOMEM_ARANHA,
                DETALHE_HOMEM_ARANHA,
                R.drawable.homem_aranha
            )
        )
        listaPersonagens.add(
            Personagens(
                LOKI,
                DETALHE_LOKI,
                R.drawable.loki
            )
        )
        listaPersonagens.add(
            Personagens(
                THANOS,
                DETALHE_THANOS,
                R.drawable.thanos
            )
        )
        listaPersonagens.add(
            Personagens(
                VIUVA_NEGRA,
                VIUVA_DETALHE,
                R.drawable.viuva_negra
            )
        )
        listaPersonagens.add(
            Personagens(
                THOR,
                DETALHE_THOR,
                R.drawable.thor
            )
        )

        adapter.atualizarListaFilme(listaPersonagens)
    }

    private fun irParaDetalheFilme(personagens: Personagens) {
        val intent = Intent(this, DetalheActivity::class.java).apply {
            putExtra(CHAVE_MARVEL,personagens)
        }
        startActivity(intent)
    }

}