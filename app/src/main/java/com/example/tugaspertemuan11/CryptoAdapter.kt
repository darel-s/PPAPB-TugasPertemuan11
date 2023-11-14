package com.example.tugaspertemuan11

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.tugaspertemuan11.R
import com.example.tugaspertemuan11.model.CryptoModel

class CryptoAdapter(private val context: Context, private val cryptoList: List<CryptoModel>) : BaseAdapter() {

    override fun getCount(): Int {
        return cryptoList.size
    }

    override fun getItem(position: Int): Any {
        return cryptoList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        val holder: ViewHolder

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item_crypto, parent, false)
            holder = ViewHolder()
            holder.symbolTextView = view.findViewById(R.id.symbolTextView)
            holder.nameTextView = view.findViewById(R.id.nameTextView)
            holder.priceTextView = view.findViewById(R.id.priceTextView)
            view.tag = holder
        } else {
            holder = view.tag as ViewHolder
        }

        val crypto = getItem(position) as CryptoModel
        holder.symbolTextView.text = crypto.symbol
        holder.nameTextView.text = crypto.name
        holder.priceTextView.text = crypto.priceUsd

        return view!!
    }

    private class ViewHolder {
        lateinit var symbolTextView: TextView
        lateinit var nameTextView: TextView
        lateinit var priceTextView: TextView
    }
}
