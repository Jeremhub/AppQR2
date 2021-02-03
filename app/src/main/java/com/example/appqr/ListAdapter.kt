package com.example.appqr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val qrlist: Array<String>) :
    RecyclerView.Adapter<ListAdapter.QRViewHolder>() {

        class QRViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val QRTextView: TextView = itemView.findViewById(R.id.codeqr)

            fun bind(word: String) {
                QRTextView.text = word
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QRViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.listeqr_ligne, parent, false)

            return QRViewHolder(view)
        }

        override fun getItemCount(): Int {
            return qrlist.size
        }

        override fun onBindViewHolder(holder: QRViewHolder, position: Int) {
            holder.bind(qrlist[position])
        }
    }