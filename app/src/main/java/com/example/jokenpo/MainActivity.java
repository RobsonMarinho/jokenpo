package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("Pedra");
    }
    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("Papel");
    }
    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada){
        ImageView imagemResultado = findViewById(R.id.imageResultado); //captura o componente da tela e retorna
        int numero = new Random().nextInt(3); //Gera números "0, 1 e 2"
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opcaoApp = opcoes[ numero ];

        switch ( opcaoApp){
            case "Pedra" :
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel" :
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "Tesoura" :
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        System.out.println("Item clicado: " + opcaoApp);

    }
}