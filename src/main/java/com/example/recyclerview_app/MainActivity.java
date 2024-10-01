package com.example.recyclerview_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button dodajPrzycisk;
    ArrayList<Produkt> listaProduktow = new ArrayList<>();
    EditText nazwaProd;
    RecyclerView listaRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaProduktow.add(new Produkt("Jabłko",0.5,"owoce"));
        listaProduktow.add(new Produkt("Gruszka",0.7,"owoce"));
        listaProduktow.add(new Produkt("Pomidor",0.9,"warzywa"));
        listaProduktow.add(new Produkt("Woda",2.5,"napoje"));
        listaProduktow.add(new Produkt("Krewetki",35,"napoje"));
        listaProduktow.add(new Produkt("Pstrąg",67,"ryby"));

        dodajPrzycisk = findViewById(R.id.dodajBut);
        nazwaProd = findViewById(R.id.editTextNazwaProd);
        listaRecycler = findViewById(R.id.recyclerViewLista);

    }
}