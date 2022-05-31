package Class

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Carrinho(
    private var quantidade: Int,
    private var valorDoProduto: Double
) : Parcelable {
    fun getQuantidade()= this.quantidade
    fun valorDoProduto()= this.valorDoProduto
}