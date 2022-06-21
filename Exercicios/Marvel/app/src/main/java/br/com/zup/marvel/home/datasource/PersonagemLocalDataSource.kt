package br.com.zup.marvel.home.datasource

import br.com.zup.marvel.*
import br.com.zup.marvel.home.model.Personagens

class PersonagemLocalDataSource {
    fun getAllPersonagens(): MutableList<Personagens>{

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
        return listaPersonagens
    }
}