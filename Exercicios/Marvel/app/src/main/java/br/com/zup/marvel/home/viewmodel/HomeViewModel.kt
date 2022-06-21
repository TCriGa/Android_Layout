package br.com.zup.marvel.home.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.marvel.home.datasource.PersonagemLocalDataSource
import br.com.zup.marvel.home.model.Personagens
import br.com.zup.marvel.home.repository.HomeRepository

class HomeViewModel() : ViewModel() {
    private val repository = HomeRepository(PersonagemLocalDataSource())
    private val _response : MutableLiveData<List<Personagens>> = MutableLiveData()
    val response : LiveData<List<Personagens>> = _response

    fun getAllPersonagens(){
        try{
            _response.value = repository.getAllPersonagem()
        }catch (e:Exception){
            Log.e("ViewModel Error", ">>>> ${e.message}")
        }
    }
}