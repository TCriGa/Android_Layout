package br.com.zup.recursoshumanos.resultado

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import br.com.zup.recursoshumanos.databinding.FragmentResultadoBinding

class ResultadoFragment : Fragment() {

    private lateinit var binding: FragmentResultadoBinding

    val args: ResultadoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultadoBinding.inflate(inflater, container, false)

        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nome.text = args.nomeArgs
        binding.textHorast .text = " Horas Trabalhadas ${args.horasT} "
        binding.textValorh.text = " Valor por Hora ${args.salarioT} "
        binding.textSalariot.text = " Salário total ${args.valorH}"

    }


}