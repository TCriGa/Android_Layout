package br.com.zup.zoologico.zoo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import br.com.zup.zoologico.MENSAGEM_ERRO_DESCRICAO
import br.com.zup.zoologico.MENSAGEM_ERRO_NOME
import br.com.zup.zoologico.databinding.FragmentZooHomeBinding
import br.com.zup.zoologico.zoo.adapter.ZooAdapter
import br.com.zup.zoologico.zoo.model.Animal

class ZooHomeFragment : Fragment() {
    private lateinit var binding: FragmentZooHomeBinding

    private val zooAdapter: ZooAdapter by lazy {
        ZooAdapter(arrayListOf(), ::irParaDetalheZoo)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentZooHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonAdicionar.setOnClickListener {
            adicionarDados()
        }
    }

    private fun exibirRecycleView() {
        binding.rvListaAnimais.adapter = zooAdapter
    }

    private fun adicionarDados() {
        val listaAnimais = mutableListOf<Animal>()
        val animal = recuperarDados()
        if (animal != null) {
            listaAnimais.add(animal)
            zooAdapter.atualizarListaProdutos(listaAnimais)
            exibirRecycleView()
        } else {
            exibirMensagemErro()
        }
    }

    private fun recuperarDados(): Animal? {
        val nomeAnimal = binding.editName.text.toString()
        val descricao = binding.editDescricao.text.toString()
        if (nomeAnimal.isNotEmpty() && descricao.isNotEmpty()) {
            limparCampoEdicao()
            return Animal(nomeAnimal, descricao)
        }
        return null
    }

    private fun exibirMensagemErro() {
        binding.editName.error = MENSAGEM_ERRO_NOME
        binding.editDescricao.error = MENSAGEM_ERRO_DESCRICAO
    }

    private fun irParaDetalheZoo(animal: Animal) {
        NavHostFragment.findNavController(this).navigate(
            ZooHomeFragmentDirections.actionZooHomeFragmentToDetalheZooFragment(
                animal
            )
        )
    }

    private fun limparCampoEdicao() {
        binding.editName.text.clear()
        binding.editDescricao.text.clear()
    }
}