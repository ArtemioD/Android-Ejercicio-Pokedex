package com.example.pokedex.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.databinding.FragmentListBinding
import com.example.pokedex.model.PokemonProvider
import com.example.pokedex.model.SelectedListener
import com.example.pokedex.ui.PokemonAdapter


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var pokemonAdapter: PokemonAdapter
    private lateinit var listener: SelectedListener

    // En onAttach ponemos los listener, es cuando el fragment es atachado
    override fun onAttach(context: Context) {
        super.onAttach(context)
        // el operador as, que se considera un operador de conversión,
        // de manera que lo que trata de hacer es transformar un dato en un tipo concreto
        listener = context as SelectedListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(inflater, container, false)
        recyclerView = binding.recyclerView
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pokemonAdapter = PokemonAdapter()
        pokemonAdapter.submitList(PokemonProvider.pokemonList)
        pokemonAdapter.onItemClickListener = { pokemon ->
            listener.onSelected(pokemon)
        }

        recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        recyclerView.adapter = pokemonAdapter
    }
}