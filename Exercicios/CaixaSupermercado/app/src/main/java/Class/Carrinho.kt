package Class

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Carrinho(
    private val quantidade: Int,
    private val valorDoProduto: Double
) : Parcelable {
    fun getQuantidade()= this.quantidade
    fun valorDoProduto()= this.valorDoProduto
}