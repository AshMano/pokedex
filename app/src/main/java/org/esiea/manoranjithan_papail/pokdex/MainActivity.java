package org.esiea.manoranjithan_papail.pokdex;

import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView pokedexCard, listeCard, infoCard, aideCard, quitterCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pokedexCard = (CardView) findViewById(R.id.pokedex);
        listeCard = (CardView) findViewById(R.id.liste);
        infoCard = (CardView) findViewById(R.id.info);
        aideCard = (CardView) findViewById(R.id.aide);
        quitterCard = (CardView) findViewById(R.id.quitter);

        pokedexCard.setOnClickListener(this);
        listeCard.setOnClickListener(this);
        infoCard.setOnClickListener(this);
        aideCard.setOnClickListener(this);
        quitterCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.pokedex:
                i = new Intent(this, Pokedex.class);
                startActivity(i);
                break;
            case R.id.liste:
                i = new Intent(this, Liste.class);
                startActivity(i);
                break;
            case R.id.info:
                i = new Intent(this, Info.class);
                startActivity(i);
                break;
            case R.id.aide:
                i = new Intent(this, Aide.class);
                startActivity(i);
                break;
            case R.id.quitter:
                i = new Intent(this, Quitter.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }
}