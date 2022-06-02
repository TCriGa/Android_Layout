package br.com.zup.tabuada

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Tabuada (private var result: Int) : Parcelable {

    fun getResult()= this.result


}