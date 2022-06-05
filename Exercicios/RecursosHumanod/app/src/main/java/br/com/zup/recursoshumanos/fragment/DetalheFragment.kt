package br.com.zup.recursoshumanos.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.recursoshumanos.databinding.FragmentDetalheBinding


class DetalheFragment : Fragment() {

private lateinit var binding: FragmentDetalheBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
binding = FragmentDetalheBinding.inflate(inflater,container, false )
        calcularExbibirSalario()
        return (binding.root)

    }


private fun calcularExbibirSalario (){
    val args = DetalheFragmentArgs.fromBundle(requireArguments())
    binding.nome.text = args.nomeArguments
    binding.horasTrabalhadas.text = args.horasArquments.toString()
    binding.salarioTotal.text = (args.horasArquments * args.horasArquments).toString()

}

}