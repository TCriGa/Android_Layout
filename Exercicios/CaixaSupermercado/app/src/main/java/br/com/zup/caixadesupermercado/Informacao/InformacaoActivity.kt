package br.com.zup.caixadesupermercado.Informacao
import CARRINHO
import Class.Carrinho
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.caixadesupermercado.Home.HomeActivity
import br.com.zup.caixadesupermercado.R
import br.com.zup.caixadesupermercado.databinding.ActivityInformacaoBinding

class InformacaoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInformacaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformacaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setTitle(getString(R.string.detalhe_compra))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recuperarExibirDados()


        binding.buttonRefazerCompras.setOnClickListener{
            val intent2 = Intent(this, HomeActivity ::class.java)
            startActivity(intent2)
        }

    }

    private fun recuperarExibirDados() {
        val carrinho = intent.getParcelableExtra<Carrinho>(CARRINHO)

        if (carrinho != null){
            val valorTotal = calcularValorTotal(
                carrinho.getQuantidade(),
                carrinho.valorDoProduto()
            )
            exibirValorTotal(valorTotal)
        }
    }

    private fun calcularValorTotal(
        quantidade :Int,
        valorUnitario : Double
    ): Double{
        return quantidade * valorUnitario
    }

    @SuppressLint("SetTextI18n")
    private fun exibirValorTotal(valorTotal: Double){
        binding.textTotalValue.text = "R$ ${"%.2f".format(valorTotal)}"
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
