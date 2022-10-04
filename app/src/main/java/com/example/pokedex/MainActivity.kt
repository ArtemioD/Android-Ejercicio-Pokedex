package com.example.pokedex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pokedex.databinding.ActivityMainBinding
import com.example.pokedex.fragments.DetailFragment
import com.example.pokedex.model.Pokemon
import com.example.pokedex.model.SelectedListener

class MainActivity : AppCompatActivity(), SelectedListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var detailFragment: DetailFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        detailFragment = supportFragmentManager.findFragmentById(binding.fragmentContainerDetail.id) as DetailFragment
    }

    override fun onSelected(pokemon: Pokemon) {
        detailFragment.setDatos(pokemon)
    }
}