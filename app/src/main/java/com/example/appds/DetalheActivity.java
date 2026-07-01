package com.example.appds;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetalheActivity extends AppCompatActivity {

    ImageView detailImage;
    TextView txtTituloDetail, txtDescricaoDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        detailImage = findViewById(R.id.detailImage);
        txtTituloDetail = findViewById(R.id.txtTituloDetail);
        txtDescricaoDetail = findViewById(R.id.txtDescricaoDetail);

        // Recebe dados do card
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        int imageResId = intent.getIntExtra("imageResId", R.drawable.filme);

        // Exibe os dados recebidos
        txtTituloDetail.setText(title);
        txtDescricaoDetail.setText(description);
        detailImage.setImageResource(imageResId);
    }
}
