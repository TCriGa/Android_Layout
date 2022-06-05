package br.com.zup.recursoshumanos.cadastro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import br.com.zup.recursoshumanos.R
import br.com.zup.recursoshumanos.databinding.FragmentCadastroBinding

class CadastroFragment : Fragment() {

    private lateinit var binding: FragmentCadastroBinding

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


    private fun navega(view: View){

        val argsNome = binding.editNome.toString()
        val argsHorasT = binding.editValorH.toString().toFloat()
        val argsSalario = binding.editHorasT.toString().toFloat()

        view.findNavController().navigate(CadastroFragmentDirections.actionCadastroFragmentToResultadoFragment())

    }

}
