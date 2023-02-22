package com.example.myhealthv0.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myhealthv0.R
import com.example.myhealthv0.databinding.CardviewBinding
import com.example.myhealthv0.db.DataMedicament

class AdapterRecycler(private val clickListener: (DataMedicament) -> Unit) : RecyclerView.Adapter<AdapterRecycler.MyViewHolder>(){

    private val datauserlist = ArrayList<DataMedicament>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: CardviewBinding = DataBindingUtil.inflate(layoutInflater, R.layout.cardview, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int){
        holder.bind(datauserlist[position], clickListener)
    }

    fun setList(daousers: List<DataMedicament>){
        datauserlist.clear()
        datauserlist. addAll(daousers)
    }

    class MyViewHolder(val binding: CardviewBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(dataMedicament: DataMedicament, clickListener: (DataMedicament) -> Unit){
            binding.text1.text = dataMedicament.text1
            binding.itemLayout.setOnClickListener{
                clickListener(dataMedicament)
            }
        }
    }

    override fun getItemCount(): Int {
        return datauserlist.size
    }
}