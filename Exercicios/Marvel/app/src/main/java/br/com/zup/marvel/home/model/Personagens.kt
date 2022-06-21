package br.com.zup.marvel.home.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Personagens(private var nome : String,
                  private var descricao : String,
                  private var imagem : Int) : Parcelable {
    fun getImagem() = this.imagem
    fun getNome() = this.nome
    fun getDescricao() = this.descricao
}