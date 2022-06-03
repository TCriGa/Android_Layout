package br.com.zup.tabuada.fragments
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.zup.tabuada.R
import br.com.zup.tabuada.TABUADA
import br.com.zup.tabuada.`interface`.ClickFragments
import br.com.zup.tabuada.databinding.FragmentResultadoBinding


class ResultadoFragment : Fragment() {

    private lateinit var binding: FragmentResultadoBinding
    private lateinit var interfaceClick: ClickFragments
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentResultadoBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabuadaRecebida = arguments?.getInt(TABUADA)

        if (tabuadaRecebida != null) {
            exibirResultado(tabuadaRecebida)
        }

        binding.buttonRecalcular.setOnClickListener {
            mudarFragment()
        }

    }

    private fun calcular(numero: Int) {
        (1..10).forEach {
            numero * it
        }

    }

    private fun exibirResultado(numero: Int) {
        calcular(numero)
        ("Tabuada do $numero\n\n" +
                "  $numero x 1 = " + (numero * 1) + " \n" +
                " $numero x 2 = " + (numero * 2) + "\n" +
                " $numero x 3 = " + (numero * 3) + "\n" +
                " $numero x 4 = " + (numero * 4) + "\n" +
                " $numero x 5 = " + (numero * 5) + "\n" +
                " $numero x 6 = " + (numero * 6) + "\n" +
                " $numero x 7 = " + (numero * 7) + "\n" +
                " $numero x 8 = " + (numero * 8) + "\n" +
                " $numero x 9 = " + (numero * 9) + "\n" +
                " $numero x 10 = " + (numero * 10) + "\n").also { binding.resultado.text = it }
    }

    private fun mudarFragment() {
        val newFragment = TabuadaFragment()
        val transaction = parentFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newFragment)
        transaction.commit()
    }

}