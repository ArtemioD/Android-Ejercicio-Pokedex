package com.example.pokedex.fragments

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.pokedex.R
import com.example.pokedex.databinding.FragmentDetailBinding
import com.example.pokedex.model.Pokemon
import com.facebook.shimmer.Shimmer
import com.facebook.shimmer.ShimmerFrameLayout


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    private lateinit var tvHp: TextView
    private lateinit var tvAttack: TextView
    private lateinit var tvDefend: TextView
    private lateinit var tvSpeed: TextView
    private lateinit var ivPokemon: ImageView
    private lateinit var shimmer: ShimmerFrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        tvHp = binding.tvHP
        tvAttack = binding.tvAttack
        tvDefend = binding.tvDefend
        tvSpeed = binding.tvSpeed
        ivPokemon = binding.ivPokemon
        shimmer = binding.shimmer

        return binding.root
    }

    fun setDatos(pokemon: Pokemon) {
        // cambiamos los valores de los campos (hp, defensa, ataque, velocidad)
        viewImg(pokemon)
        ("${getString(R.string.text_hp_change)} ${pokemon.hp}").also { tvHp.text = it }
        ("${getString(R.string.text_def_change)} ${pokemon.defend}").also { tvDefend.text = it }
        ("${getText(R.string.text_atq_change)} ${pokemon.attack}").also { tvAttack.text = it }
        ("${getText(R.string.text_vel_change)} ${pokemon.speed}").also { tvSpeed.text = it }
    }

    private fun viewImg(pokemon: Pokemon) {
        // cundo cargamos el imagen
        shimmer.visibility = View.VISIBLE

        Glide.with(this).load(pokemon.url).listener(object : RequestListener<Drawable> {
            override fun onLoadFailed(
                e: GlideException?,
                model: Any?,
                target: Target<Drawable>?,
                isFirstResource: Boolean
            ): Boolean {
                // el imagen no esta disponible
                ivPokemon.setImageResource(R.drawable.interrogacin_signo)
                return false
            }

            override fun onResourceReady(
                resource: Drawable?,
                model: Any?,
                target: Target<Drawable>?,
                dataSource: DataSource?,
                isFirstResource: Boolean
            ): Boolean {
                // cuando el emagen ya esta disponible
                shimmer.visibility = View.GONE
                return false
            }
        }).into(ivPokemon)
    }
}