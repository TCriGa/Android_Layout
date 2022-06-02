package br.com.zup.tabuada.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.tabuada.Tabuada
import br.com.zup.tabuada.`interface`.ClickFragments
import br.com.zup.tabuada.databinding.FragmentButtonBinding
import br.com.zup.tabuada.home.HomeActivity

class ButtonFragment : Fragment() {
    private lateinit var binding: FragmentButtonBinding
    private lateinit var interfaceClick : ClickFragments
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentButtonBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalcular.setOnClickListener {
            interfaceClick.clickFragments("")
        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            interfaceClick = context as HomeActivity //Cast, conversão
        }catch (ex: Exception){
            Log.i("Erros", "Erro na inicialização da interfaceClick ${ex.message}")
        }
    }

    fun calcular(n :  Int): Int {
       val tabuada =  n *  binding.editText.text.toString().toInt()

      return  tabuada
    }



}
