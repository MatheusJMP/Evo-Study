package com.example.study_evo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycler.view.*

class RecyclerViewAdapter(val list: MutableList<CardListPurchases>) :
    RecyclerView.Adapter<RecyclerViewAdapter.CardListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler, parent, false)

        return CardListViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardListViewHolder, position: Int) {
        holder.bindCard(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class CardListViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindCard(cardResponse: CardListPurchases) {

            with(itemView) {

                name_purchase.text = cardResponse.title
                date_purchase.text = cardResponse.date
                value_purchase.text = cardResponse.value

            }
        }
    }
}