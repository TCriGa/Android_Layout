package br.com.zup.minha__musica_favorita.detalhe.Album

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.zup.minha__musica_favorita.R
import br.com.zup.minha__musica_favorita.databinding.FragmentFotosBinding
import br.com.zup.minha__musica_favorita.detalhe.Album.adapter.AlbumMusicaAdapter
import br.com.zup.minha__musica_favorita.model.Musica

class FotosFragment : Fragment() {

    private lateinit var binding: FragmentFotosBinding

    private val albumAdapter: AlbumMusicaAdapter by lazy {
        AlbumMusicaAdapter(arrayListOf(), this ::  irParaDetalheClickFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFotosBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exibirRecyclerView()


    }

    private fun exibirRecyclerView() {
        adicionarItemListaAlbum()
        binding.rvListaMusica.adapter = albumAdapter
        binding.rvListaMusica.layoutManager = StaggeredGridLayoutManager(2,
            StaggeredGridLayoutManager.VERTICAL)

    }


    private fun adicionarItemListaAlbum() {
        val listaAlbum = mutableListOf<Musica>()

        listaAlbum.add(
            Musica(
                R.drawable.bita_e_o_circo,

            ),
        )

        listaAlbum.add(
            Musica(
                R.drawable.bita_e_o_nosso_mundo,
            )
        )
        albumAdapter.atualizarListaAlbum(listaAlbum)

    }

    private fun irParaDetalheClickFragment(album : Musica){
val navControler = findNavController()
      navControler.navigate(R.id.action_fotosFragment_to_detalheClickFragment)
    }



}