package br.com.zup.zoologico.zoo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.zoologico.zoo.model.Animal
import br.com.zup.zoologico.databinding.ZooItemBinding

class ZooAdapter(
    private var listaAnimal: MutableList<Animal>,
    private val cliclAnimal: (animal: Animal) -> Unit
) : RecyclerView.Adapter<ZooAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ZooItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = listaAnimal[position]
        holder.adicionarInformacoesView(animal)
        holder.binding.cvListaAnimal.setOnClickListener {
            cliclAnimal(animal)
        }
    }

    override fun getItemCount(): Int = listaAnimal.size

    fun atualizarListaProdutos(novaListaProduto: MutableList<Animal>) {
        if (listaAnimal.size == 0) {
            listaAnimal.addAll(novaListaProduto)
        }

        notifyDataSetChanged()
    }

    class ViewHolder(val binding: ZooItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun adicionarInformacoesView(animal: Animal) {
            binding.textNomeAnimal.text = animal.getNomeAnimal()
        }
    }

}

