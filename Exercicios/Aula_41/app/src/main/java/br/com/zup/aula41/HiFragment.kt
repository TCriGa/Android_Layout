package br.com.zup.aula41

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController

import br.com.zup.aula41.databinding.FragmentHiBinding

class HiFragment : Fragment() {

    private lateinit var text1:String
    private lateinit var text2:String
    private lateinit var binding: FragmentHiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHiBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         text1 = binding.editHow.text.toString()
        text2 = binding.editWhat.text.toString()

        binding.button1Frag.setOnClickListener {

            Toast.makeText(context, "$text2, $text1", Toast.LENGTH_SHORT).show()
            view.findNavController().navigate(HiFragmentDirections.actionHiFragmentToFineFragment())
        }
        binding.button2Frag.setOnClickListener {
            view.findNavController().navigate(HiFragmentDirections.actionHiFragmentToHelloFragment())

        }

    }
}