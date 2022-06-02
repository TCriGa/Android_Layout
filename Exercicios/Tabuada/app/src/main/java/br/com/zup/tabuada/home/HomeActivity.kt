package br.com.zup.tabuada.home
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.tabuada.TABUADA
import br.com.zup.tabuada.Tabuada
import br.com.zup.tabuada.`interface`.ClickFragments
import br.com.zup.tabuada.databinding.ActivityHomeBinding
import br.com.zup.tabuada.fragments.ButtonFragment
import br.com.zup.tabuada.fragments.InformacaoFragment

class HomeActivity : AppCompatActivity(), ClickFragments {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, ButtonFragment())
            .commit()

    }

    override fun clickFragments(n: Int) {
        val tabuada = Tabuada(n)
        val informacaoFragment = InformacaoFragment().apply {
            arguments = Bundle().apply {
                putParcelable(TABUADA, tabuada)
            }
        }

        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, informacaoFragment)
            .commit()

    }

}