package br.com.zup.zoologico.zoo.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Animal(
    private var nomeAnimal: String,
    private var descricaoAnimal: String
) : Parcelable {
    fun getNomeAnimal() = this.nomeAnimal
    fun getDescricaoAnimal() = this.descricaoAnimal
}