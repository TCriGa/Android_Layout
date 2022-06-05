package br.com.zup.aula41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import br.com.zup.aula41.databinding.FragmentHelloBinding

class HelloFragment : Fragment() {

    private lateinit var binding: FragmentHelloBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHelloBinding.inflate(inflater,container, false )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = HelloFragmentArgs.fromBundle(requireArguments())


        binding.buttonFrase3.setOnClickListener {
            view.findNavController().navigate(HelloFragmentDirections.actionHelloFragmentToFineFragment())
            Toast.makeText(context, "Frase ${args.argsFloat}", Toast.LENGTH_LONG).show()

        }
        binding.buttonFrase4.setOnClickListener {
            Toast.makeText(context, "Frase ${args.argsFloat}", Toast.LENGTH_LONG).show()
        }
    }
}