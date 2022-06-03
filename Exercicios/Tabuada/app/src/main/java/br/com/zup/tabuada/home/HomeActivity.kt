package br.com.zup.tabuada.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.tabuada.TABUADA
import br.com.zup.tabuada.`interface`.ClickFragments
import br.com.zup.tabuada.databinding.ActivityHomeBinding
import br.com.zup.tabuada.fragments.ResultadoFragment
import br.com.zup.tabuada.fragments.TabuadaFragment

class HomeActivity : AppCompatActivity(), ClickFragments {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .add(binding.container.id, TabuadaFragment())
            .commit()

    }

    override fun clickFragments(numero: Int) {
        val fragmentsTabuada = ResultadoFragment().apply {
            arguments = Bundle().apply {
                putInt(TABUADA, numero)
            }
        }
        supportFragmentManager
            .beginTransaction()
            .replace(binding.container.id, fragmentsTabuada)
            .addToBackStack("Detail")
            .commit()

    }


}