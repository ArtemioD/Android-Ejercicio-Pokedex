package com.example.pokedex.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex.R
import com.example.pokedex.databinding.ItemListBinding
import com.example.pokedex.model.Pokemon
import com.example.pokedex.model.Type

class PokemonAdapter: ListAdapter<Pokemon, PokemonAdapter.ViewHolder>(DiffCallBack) {

    lateinit var onItemClickListener: (Pokemon) -> Unit


    // 2. ViewHolder
    inner class ViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

        private val binding = ItemListBinding.bind(view)

        private val idPokemon: TextView = binding.tvID
        private val namePokemon: TextView = binding.tvName
        private val imageType: ImageView = binding.imageView

        fun bind(pokemon: Pokemon) {
            idPokemon.text = pokemon.id.toString()
            namePokemon.text = pokemon.name

            val img = when(pokemon.type) {
                Type.AGUA -> R.drawable.water
                Type.PLANTA -> R.drawable.grass
                Type.FUEGO -> R.drawable.fire
                Type.ELECTRICO -> R.drawable.electric
                else -> R.drawable.fighting
            }
            imageType.setImageResource(img)

            view.setOnClickListener {
                onItemClickListener(pokemon)
            }
        }

    }

    //3.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_list, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pokemon = getItem(position)
        holder.bind(pokemon)
    }

    // 1.
    companion object DiffCallBack: DiffUtil.ItemCallback<Pokemon>() {
        /*
        DiffUtil se usa para calcular las diferencias entre listas y
        enviar solo los cambios necesarios al adaptador. Si sus art??culos
        no tienen identificaci??n u otra forma de cumplir con el areItemsTheSamecontrato,
        la ejecuci??n DiffUtil no tiene sentido ya que no podr?? determinar
        adiciones/eliminaciones/movimientos.
         */

        // areItemsTheSame- se utiliza para determinar los cambios estructurales
        // entre la lista antigua y la nueva (adiciones/eliminaciones/cambios de posici??n)
        override fun areItemsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean {
            return oldItem.id == newItem.id
        }

        //areContentsTheSame- determina si se actualiz?? un elemento en particular
        override fun areContentsTheSame(oldItem: Pokemon, newItem: Pokemon): Boolean {
            return oldItem == newItem
        }

    }

}