package br.com.zup.minha__musica_favorita.detalhe.Album

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import br.com.zup.minha__musica_favorita.R
import br.com.zup.minha__musica_favorita.databinding.ActivityAlbumBinding

class AlbumActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAlbumBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportFragmentManager.findFragmentById(binding.fragmentContainerView2.id) as NavHostFragment
    }
}