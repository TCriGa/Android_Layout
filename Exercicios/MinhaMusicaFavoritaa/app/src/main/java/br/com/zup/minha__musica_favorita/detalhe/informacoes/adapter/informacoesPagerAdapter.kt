package br.com.zup.minha__musica_favorita.detalhe.informacoes.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minha__musica_favorita.detalhe.Album.FotosFragment
import br.com.zup.minha__musica_favorita.detalhe.informacoes.informacoesFragment

class InformacoesPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private var listaTitulos: List<String>
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = listaTitulos.size

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return informacoesFragment()
            1 -> return FotosFragment()
        }

        return informacoesFragment()
    }
}