package br.com.zup.minha__musica_favorita.detalhe.Album

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import br.com.zup.minha__musica_favorita.R
import br.com.zup.minha__musica_favorita.databinding.FragmentDetalheClickBinding
import br.com.zup.minha__musica_favorita.detalhe.Album.adapter.AlbumMusicaAdapter

class DetalheClickFragment : Fragment() {

private lateinit var binding: FragmentDetalheClickBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetalheClickBinding.inflate(inflater,container, false)
        return binding.root

        }


}


