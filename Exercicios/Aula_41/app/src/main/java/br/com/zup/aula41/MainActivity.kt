package br.com.zup.aula41

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import br.com.zup.aula41.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(R.string.welcome)

        supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as NavHostFragment
    }

    override fun onSupportNavigateUp(): Boolean {

        val navControler = findNavController(binding.fragmentContainerView.id)

        return navControler.navigateUp() || super.onSupportNavigateUp()
    }
}
