package br.com.zup.recursoshumanos.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class CadastroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCadastroBinding.inflate(inflater, container, false)

        binding.buttonCalcular.setOnClickListener {
            navega(it)
        }
        return binding.root

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            binding.buttonCalcular.setOnClickListener {
                navega(it)
            }
        } catch (ex: Exception) {
            Log.i("Erros", "Erro na inicialização da interfaceClick ${ex.message}")

        }

    }
    private fun navega(view: View) {

        val argNome = binding.editNome.toString()
        val argsHorasT = binding.editValorH.toString().toFloat()
        val argsSalario = binding.editHorasT.toString().toFloat()
        view.findNavController()
            .navigate(CadastroFragmentDirections.actionCadastroFragmentToDetalheFragment(argNome, argsSalario, argsHorasT))
    }
}