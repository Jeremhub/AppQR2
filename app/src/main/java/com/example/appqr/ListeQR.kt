package com.example.appqr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import androidx.recyclerview.widget.RecyclerView

class ListeQR : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liste_q_r)

        //val QRList = ListSourcing(this).getQRList()

        //val recyclerView: RecyclerView = findViewById(R.id.Listecodescan)
        //recyclerView.adapter = ListAdapter(QRlist)
    }
}