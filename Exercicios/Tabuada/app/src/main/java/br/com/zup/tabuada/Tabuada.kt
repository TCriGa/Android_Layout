package br.com.zup.tabuada

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Tabuada (private var n : Int, private var result: Int) : Parcelable {

    fun getN()= this.n
    fun getResult()= this.result


}