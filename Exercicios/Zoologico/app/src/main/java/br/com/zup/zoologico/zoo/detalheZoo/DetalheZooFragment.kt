package br.com.zup.zoologico.zoo.detalheZoo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import br.com.zup.zoologico.databinding.FragmentDetalheZooBinding

class DetalheZooFragment : Fragment() {
   val args : DetalheZooFragmentArgs by navArgs()
    private lateinit var binding: FragmentDetalheZooBinding
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

            binding = FragmentDetalheZooBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recuperarExibirArguments()
    }

    private fun recuperarExibirArguments(){
        binding.textNomeAnimal.text = args.nomeArgs.getNomeAnimal()
        binding.texDescricao.text = args.nomeArgs.getDescricaoAnimal()

    }
}