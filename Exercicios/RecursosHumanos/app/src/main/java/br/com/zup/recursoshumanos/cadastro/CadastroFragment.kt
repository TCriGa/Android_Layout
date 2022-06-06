package br.com.zup.recursoshumanos.cadastro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import br.com.zup.recursoshumanos.HORAS_TRABALHADAS
import br.com.zup.recursoshumanos.NOME
import br.com.zup.recursoshumanos.VALOR_HORA
import br.com.zup.recursoshumanos.databinding.FragmentCadastroBinding

class CadastroFragment : Fragment() {

    private lateinit var binding: FragmentCadastroBinding
    private lateinit var nome: String
    private var horasT: Float = 0.0f
    private var valorH: Float = 0.0f
    private var salarioTotal: Float = 0.0f


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCadastroBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonCalcular.setOnClickListener {

            exibirInformacoes()
            limparCampos()

            view.findNavController().navigate(
                CadastroFragmentDirections.actionCadastroFragmentToResultadoFragment(
                    nome,
                    valorH,
                    horasT,
                    salarioTotal
                )

            )


        }

    }

    private fun calcularSalario(): Float {
        return valorH * horasT

    }

    private fun exibirInformacoes() {

        nome = binding.editNome.text.toString()
        valorH = binding.editValorH.text.toString().toFloat()
        horasT = binding.editHorasT.text.toString().toFloat()
        salarioTotal = calcularSalario()

    }

    private fun limparCampos() {
        binding.editNome.text.clear()
        binding.editHorasT.text.clear()
        binding.editValorH.text.clear()
    }

    private fun verificarCamposEdicao() {
        binding.editNome.error = NOME
        binding.editValorH.error = VALOR_HORA
        binding.editHorasT.error = HORAS_TRABALHADAS
    }
}





