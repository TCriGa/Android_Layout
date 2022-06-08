package br.com.zup.minha__musica_favorita.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Musica(
    private var imagem: Int,

) : Parcelable {
    fun getImagem() = this.imagem
}