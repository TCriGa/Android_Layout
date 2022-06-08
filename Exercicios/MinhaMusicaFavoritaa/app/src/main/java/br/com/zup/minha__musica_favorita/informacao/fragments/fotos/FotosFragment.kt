package br.com.zup.minha__musica_favorita.informacao.fragments.fotos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.zup.minha__musica_favorita.*
import br.com.zup.minha__musica_favorita.databinding.FragmentFotosBinding
import br.com.zup.minha__musica_favorita.informacao.fragments.fotos.adapter.AlbumMusicaAdapter
import br.com.zup.minha__musica_favorita.model.Musica

class FotosFragment : Fragment() {

    private lateinit var binding: FragmentFotosBinding

    private val albumAdapter: AlbumMusicaAdapter by lazy {
        AlbumMusicaAdapter(arrayListOf())
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
        binding.rvListaMusica.layoutManager = LinearLayoutManager(context)

    }


    private fun adicionarItemListaAlbum() {
        val listaAlbum = mutableListOf<Musica>()

        listaAlbum.add(
            Musica(
                R.drawable.bita_e_o_circo,
                BITA_E_O_CIRCO, ANO_BITA_E_O_CIRCO
            ),
        )

        listaAlbum.add(
            Musica(
                R.drawable.bita_e_o_nosso_mundo,
                BITA_E_O_NOSSO_MUNDO,
                ANO_NOSSO_MUNDO
            )
        )

    }


}