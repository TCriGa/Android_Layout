package br.com.zup.minha__musica_favorita.detalhe.album.adapter

import android.graphics.drawable.Icon
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minha__musica_favorita.databinding.ListaMusicaItemBinding
import br.com.zup.minha__musica_favorita.model.Musica
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import org.w3c.dom.Text

class AlbumMusicaAdapter(
    private var listaAlbum: MutableList<Musica>,
    private var cliclAlbum: (album : Musica) -> Unit
) : RecyclerView.Adapter<AlbumMusicaAdapter.ViewHolder>()
{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val binding = ListaMusicaItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val albumMusica = listaAlbum[position]
        holder.adicionarInformacoesView(albumMusica as Musica)
        holder.binding.cvItemLista.setOnClickListener {
            cliclAlbum(albumMusica)
        }

    }

    override fun getItemCount(): Int = listaAlbum.size

    fun atualizarListaAlbum(novaLista : MutableList<Musica>){
        if (listaAlbum.size == 0){
            listaAlbum = novaLista
        }else{
            listaAlbum.addAll(novaLista)
        }
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: ListaMusicaItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun adicionarInformacoesView(musica:Musica){
            binding.ivHeroi.setImageResource(musica.getImagem())

        }
    }

    private fun iconeFavorito(){


    }
}
