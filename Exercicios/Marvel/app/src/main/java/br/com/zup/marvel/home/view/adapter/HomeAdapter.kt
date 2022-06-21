package br.com.zup.marvel.home.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.marvel.home.model.Personagens
import br.com.zup.marvel.databinding.FilmeItemBinding

class HomeAdapter(private var listaPersonagens: MutableList<Personagens>,
                  private  val clickPersonagens : (heroi : Personagens) -> Unit):
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FilmeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val personagens = listaPersonagens[position]
        holder.exibirInformacaoFilme(personagens)
        holder.binding.cvItemLista.setOnClickListener {
            clickPersonagens(personagens)
        }
        holder.exibirInformacaoFilme(personagens)
    }

    override fun getItemCount() = listaPersonagens.size

        fun atualizarListaFilme(novaLista:List<Personagens>){
            if (listaPersonagens.size == 0){
                listaPersonagens = novaLista as MutableList<Personagens>
            }else{
                listaPersonagens.addAll(novaLista)
            }
            notifyDataSetChanged()
        }



    class ViewHolder(val binding: FilmeItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun exibirInformacaoFilme(personagens: Personagens){
            binding.tvNomeHeroi.text = personagens.getNome()
            binding.ivHeroi.setImageResource(personagens.getImagem())
        }
    }
}