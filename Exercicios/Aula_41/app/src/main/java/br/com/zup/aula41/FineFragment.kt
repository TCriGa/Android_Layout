package br.com.zup.aula41

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import br.com.zup.aula41.databinding.FragmentFineBinding

class FineFragment : Fragment() {
    private lateinit var binding: FragmentFineBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFineBinding.inflate(inflater, container, false)

        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = FineFragmentArgs.fromBundle(requireArguments())

        binding.buttonFrase3.setOnClickListener {
            view.findNavController()
                .navigate(FineFragmentDirections.actionFineFragmentToHelloFragment())
            Toast.makeText(context, "Frase ${args.argsInt}", Toast.LENGTH_LONG).show()

        }
        binding.buttonFrase4.setOnClickListener {
            Toast.makeText(context, "Frase${args.argsBoolean}", Toast.LENGTH_LONG).show()
        }
    }

}