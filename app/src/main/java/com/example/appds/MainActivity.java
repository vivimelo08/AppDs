package com.example.appds;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter adapter;
    List<ItemModel> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        itemList = new ArrayList<>();

        // Exemplos para cada grupo
        itemList.add(new ItemModel("Filme: Matrix", "Sinopse: Um hacker descobre a verdade sobre sua realidade.", R.drawable.filme));
        itemList.add(new ItemModel("Material Escolar", "Lápis HB - R$ 2,50", R.drawable.materialescolar));
        itemList.add(new ItemModel("Série: Stranger Things", "Mistérios sobrenaturais em Hawkins.", R.drawable.series));
        itemList.add(new ItemModel("Loja de Roupa", "Camiseta Azul - Tamanho M - R$ 49,90", R.drawable.lojaroupa));
        itemList.add(new ItemModel("Notas", "Matemática - Nota: 8.5", R.drawable.notas));
        itemList.add(new ItemModel("Agenda de Provas", "História - Data: 15/08", R.drawable.agendaprovas));
        itemList.add(new ItemModel("Música: Imagine", "Artista: John Lennon", R.drawable.musica));
        itemList.add(new ItemModel("Esporte", "Futebol - Campeonato Brasileiro", R.drawable.esporte));

        adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }
}
