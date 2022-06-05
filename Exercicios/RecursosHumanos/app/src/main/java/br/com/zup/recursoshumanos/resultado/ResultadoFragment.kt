package br.com.zup.recursoshumanos.resultado

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.zup.recursoshumanos.databinding.FragmentResultadoBinding

class ResultadoFragment : Fragment() {

   private lateinit var binding: FragmentResultadoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultadoBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calcularExbibirSalario()

    }

    private fun calcularExbibirSalario (){



    }


}