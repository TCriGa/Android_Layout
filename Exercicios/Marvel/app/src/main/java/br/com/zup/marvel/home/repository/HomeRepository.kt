package br.com.zup.marvel.home.repository

import br.com.zup.marvel.home.datasource.PersonagemLocalDataSource
import br.com.zup.marvel.home.model.Personagens

class HomeRepository  (
    private val personagemLocalDatasource : PersonagemLocalDataSource
        ){


    fun getAllPersonagem():List<Personagens>{
        return personagemLocalDatasource.getAllPersonagens()
    }
}