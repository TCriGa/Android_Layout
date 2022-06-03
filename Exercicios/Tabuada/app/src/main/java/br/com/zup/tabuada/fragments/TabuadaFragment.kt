package br.com.zup.tabuada.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.zup.tabuada.`interface`.ClickFragments
import br.com.zup.tabuada.databinding.FragmentTabuadaBinding
import br.com.zup.tabuada.home.HomeActivity

class TabuadaFragment : Fragment() {
    private lateinit var binding: FragmentTabuadaBinding
    private lateinit var interfaceClick: ClickFragments

    override fun onAttach(context: Context) {

        super.onAttach(context)
        try {
            interfaceClick = context as HomeActivity //Cast, conversão
        } catch (ex: Exception) {
            Log.i("Erros", "Erro na inicialização da interfaceClick ${ex.message}")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTabuadaBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonCalcular.setOnClickListener {
            val numeroDigitado = binding.editText.text.toString()
            if (numeroDigitado.isNotEmpty()) {
                interfaceClick.clickFragments(numeroDigitado.toInt())
                limparCampos()
            } else {
                binding.editText.error = "Por favor, preencha os campos"
            }

        }

    }


    private fun limparCampos() {
        binding.editText.text.clear()
    }

}
