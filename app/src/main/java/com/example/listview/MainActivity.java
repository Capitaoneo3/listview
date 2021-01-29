package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listLocais;
    private String[] itens = {
            "Angra dos Reis", "Caldas Novas",
            "Campos do Jordão", "Costa do Sauípe",
            "Ilheús", "Porto seguro", "Tiradentes",
            "Buenos Aires", "Budapeste", "Cancún",
            "Aruba"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Cria adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
            getApplicationContext(),
            android.R.layout.simple_list_item_1,
            android.R.id.text1,
                itens

        );

        //Adiciona adaptador para a lista
        listLocais.setAdapter( adaptador );


    }
}