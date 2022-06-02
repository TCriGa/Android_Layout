package br.com.zup.tabuada.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.tabuada.TABUADA
import br.com.zup.tabuada.Tabuada
import br.com.zup.tabuada.databinding.FragmentInformacaoBinding


class InformacaoFragment : Fragment() {

    private lateinit var binding: FragmentInformacaoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInformacaoBinding.inflate(inflater, container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabuada = arguments?.getParcelable<Tabuada>(TABUADA)

        if (tabuada != null){
            binding.resultado.text = tabuada.getN().toString()

        }

    }

}