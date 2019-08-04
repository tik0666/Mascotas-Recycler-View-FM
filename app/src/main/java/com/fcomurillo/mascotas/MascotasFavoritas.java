package com.fcomurillo.mascotas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> contactos;
    private RecyclerView listaContactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaContactos = findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager glm = new GridLayoutManager(this, 2);


        listaContactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();
    }

    public void inicializarAdaptador() {
        MascotaAdapter adaptador = new MascotaAdapter(contactos, this);
        listaContactos.setAdapter(adaptador);
    }

    public void inicializarListaContactos() {
        contactos = new ArrayList<Mascota>();

        /*contactos.add(new Mascota(R.drawable.pet1, "Pelusa", Mascota.count1));
        contactos.add(new Mascota(R.drawable.pet2, "Pirrurris", Mascota.count2));
        contactos.add(new Mascota(R.drawable.pet3, "Minino", Mascota.count3));
        contactos.add(new Mascota(R.drawable.pet4, "Rayas", Mascota.count4));
        contactos.add(new Mascota(R.drawable.pet5, "Huesos", Mascota.count5));
        contactos.add(new Mascota(R.drawable.pet6, "Manotas", Mascota.count6));
        contactos.add(new Mascota(R.drawable.pet7, "Gatito", Mascota.count7));
        contactos.add(new Mascota(R.drawable.pet8, "Dumbo", Mascota.count8));
        contactos.add(new Mascota(R.drawable.pet9, "Ghost", Mascota.count9));
        contactos.add(new Mascota(R.drawable.pet10, "Rulo", Mascota.count10));
        contactos.add(new Mascota(R.drawable.pet11, "Currito", Mascota.count11));
        contactos.add(new Mascota(R.drawable.pet12, "Blue", Mascota.count12));
        contactos.add(new Mascota(R.drawable.pet13, "Guacamayo", Mascota.count13));
        contactos.add(new Mascota(R.drawable.pet14, "Tone", Mascota.count14));
        contactos.add(new Mascota(R.drawable.pet15, "Bola", Mascota.count15));
        contactos.add(new Mascota(R.drawable.pet16, "Erizo", Mascota.count16));*/

        int m11 = 0;
        int m12 = 0;
        int m13 = 0;
        int m14 = 0;
        int m15 = 0;
        int m16 = 0;
        int m17 = 0;
        int m18 = 0;
        int m19 = 0;
        int m110 = 0;
        int m111 = 0;
        int m112 = 0;
        int m113 = 0;
        int m114 = 0;
        int m115 = 0;
        int m116 = 0;

        for (int i = 0; i < 5; i++) {
            if ((Mascota.count1 > Mascota.count2) && (Mascota.count1 > Mascota.count3) && (Mascota.count1 > Mascota.count4) && (Mascota.count1 > Mascota.count5) && (Mascota.count1 > Mascota.count6) && (Mascota.count1 > Mascota.count7) && (Mascota.count1 > Mascota.count8) && (Mascota.count1 > Mascota.count9) && (Mascota.count1 > Mascota.count10) && (Mascota.count1 > Mascota.count11) && (Mascota.count1 > Mascota.count12) && (Mascota.count1 > Mascota.count13) && (Mascota.count1 > Mascota.count14) && (Mascota.count1 > Mascota.count15)&& (Mascota.count1 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet1, "Pelusa", Mascota.count1));
                m11 = Mascota.count1;
                Mascota.count1 = 0;
            } else if ((Mascota.count2 > Mascota.count1) && (Mascota.count2 > Mascota.count3) && (Mascota.count2 > Mascota.count4) && (Mascota.count2 > Mascota.count5) && (Mascota.count2 > Mascota.count6) && (Mascota.count2 > Mascota.count7) && (Mascota.count2 > Mascota.count8) && (Mascota.count2 > Mascota.count9) && (Mascota.count2 > Mascota.count10) && (Mascota.count2 > Mascota.count11) && (Mascota.count2 > Mascota.count12) && (Mascota.count2 > Mascota.count13) && (Mascota.count2 > Mascota.count14) && (Mascota.count2 > Mascota.count15)&& (Mascota.count2 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet2, "Pirrurris", Mascota.count2));
                m12 = Mascota.count2;
                Mascota.count2 = 0;
            } else if ((Mascota.count3 > Mascota.count1) && (Mascota.count3 > Mascota.count2) && (Mascota.count3 > Mascota.count4) && (Mascota.count3 > Mascota.count5) && (Mascota.count3 > Mascota.count6) && (Mascota.count3 > Mascota.count7) && (Mascota.count3 > Mascota.count8) && (Mascota.count3 > Mascota.count9) && (Mascota.count3 > Mascota.count10) && (Mascota.count3 > Mascota.count11) && (Mascota.count3 > Mascota.count12) && (Mascota.count3 > Mascota.count13) && (Mascota.count3 > Mascota.count14) && (Mascota.count3 > Mascota.count15)&& (Mascota.count3 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet3, "Minino", Mascota.count3));
                m13 = Mascota.count3;
                Mascota.count3 = 0;
            } else if ((Mascota.count4 > Mascota.count1) && (Mascota.count4 > Mascota.count2) && (Mascota.count4 > Mascota.count3) && (Mascota.count4 > Mascota.count5) && (Mascota.count4 > Mascota.count6) && (Mascota.count4 > Mascota.count7) && (Mascota.count4 > Mascota.count8) && (Mascota.count4 > Mascota.count9) && (Mascota.count4 > Mascota.count10) && (Mascota.count4 > Mascota.count11) && (Mascota.count4 > Mascota.count12) && (Mascota.count4 > Mascota.count13) && (Mascota.count4 > Mascota.count14) && (Mascota.count4 > Mascota.count15)&& (Mascota.count4 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet4, "Rayas", Mascota.count4));
                m14 = Mascota.count4;
                Mascota.count4 = 0;
            } else if ((Mascota.count5 > Mascota.count1) && (Mascota.count5 > Mascota.count2) && (Mascota.count5 > Mascota.count3) && (Mascota.count5 > Mascota.count4) && (Mascota.count5 > Mascota.count6) && (Mascota.count5 > Mascota.count7) && (Mascota.count5 > Mascota.count8) && (Mascota.count5 > Mascota.count9) && (Mascota.count5 > Mascota.count10) && (Mascota.count5 > Mascota.count11) && (Mascota.count5 > Mascota.count12) && (Mascota.count5 > Mascota.count13) && (Mascota.count5 > Mascota.count14) && (Mascota.count5 > Mascota.count15)&& (Mascota.count5 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet5, "Huesos", Mascota.count5));
                m15 = Mascota.count5;
                Mascota.count5 = 0;
            } else if ((Mascota.count6 > Mascota.count1) && (Mascota.count6 > Mascota.count2) && (Mascota.count6 > Mascota.count3) && (Mascota.count6 > Mascota.count4) && (Mascota.count6 > Mascota.count5) && (Mascota.count6 > Mascota.count7) && (Mascota.count6 > Mascota.count8) && (Mascota.count6 > Mascota.count9) && (Mascota.count6 > Mascota.count10) && (Mascota.count6 > Mascota.count11) && (Mascota.count6 > Mascota.count12) && (Mascota.count6 > Mascota.count13) && (Mascota.count6 > Mascota.count14) && (Mascota.count6 > Mascota.count15)&& (Mascota.count6 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet6, "Manotas", Mascota.count6));
                m16 = Mascota.count6;
                Mascota.count6 = 0;
            } else if ((Mascota.count7 > Mascota.count1) && (Mascota.count7 > Mascota.count2) && (Mascota.count7 > Mascota.count3) && (Mascota.count7 > Mascota.count4) && (Mascota.count7 > Mascota.count5) && (Mascota.count7 > Mascota.count6) && (Mascota.count7 > Mascota.count8) && (Mascota.count7 > Mascota.count9) && (Mascota.count7 > Mascota.count10) && (Mascota.count7 > Mascota.count11) && (Mascota.count7 > Mascota.count12) && (Mascota.count7 > Mascota.count13) && (Mascota.count7 > Mascota.count14) && (Mascota.count7 > Mascota.count15)&& (Mascota.count7 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet7, "Gatito", Mascota.count7));
                m17 = Mascota.count7;
                Mascota.count7 = 0;
            } else if ((Mascota.count8 > Mascota.count1) && (Mascota.count8 > Mascota.count2) && (Mascota.count8 > Mascota.count3) && (Mascota.count8 > Mascota.count4) && (Mascota.count8 > Mascota.count5) && (Mascota.count8 > Mascota.count6) && (Mascota.count8 > Mascota.count7) && (Mascota.count8 > Mascota.count9) && (Mascota.count8 > Mascota.count10) && (Mascota.count8 > Mascota.count11) && (Mascota.count8 > Mascota.count12) && (Mascota.count8 > Mascota.count13) && (Mascota.count8 > Mascota.count14) && (Mascota.count8 > Mascota.count15)&& (Mascota.count8 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet8, "Dumbo", Mascota.count8));
                m18 = Mascota.count8;
                Mascota.count8 = 0;
            } else if ((Mascota.count9 > Mascota.count1) && (Mascota.count9 > Mascota.count2) && (Mascota.count9 > Mascota.count3) && (Mascota.count9 > Mascota.count4) && (Mascota.count9 > Mascota.count5) && (Mascota.count9 > Mascota.count6) && (Mascota.count9 > Mascota.count7) && (Mascota.count9 > Mascota.count8) && (Mascota.count9 > Mascota.count10) && (Mascota.count9 > Mascota.count11) && (Mascota.count9 > Mascota.count12) && (Mascota.count9 > Mascota.count13) && (Mascota.count9 > Mascota.count14) && (Mascota.count9 > Mascota.count15)&& (Mascota.count9 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet9, "Ghost", Mascota.count9));
                m19 = Mascota.count9;
                Mascota.count9 = 0;
            } else if ((Mascota.count10 > Mascota.count1) && (Mascota.count10 > Mascota.count2) && (Mascota.count10 > Mascota.count3) && (Mascota.count10 > Mascota.count4) && (Mascota.count10 > Mascota.count5) && (Mascota.count10 > Mascota.count6) && (Mascota.count10 > Mascota.count7) && (Mascota.count10 > Mascota.count8) && (Mascota.count10 > Mascota.count9) && (Mascota.count10 > Mascota.count11) && (Mascota.count10 > Mascota.count12) && (Mascota.count10 > Mascota.count13) && (Mascota.count10 > Mascota.count14) && (Mascota.count10 > Mascota.count15)&& (Mascota.count10 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet10, "Rulo", Mascota.count10));
                m110 = Mascota.count10;
                Mascota.count10 = 0;
            } else if ((Mascota.count11 > Mascota.count1) && (Mascota.count11 > Mascota.count2) && (Mascota.count11 > Mascota.count3) && (Mascota.count11 > Mascota.count4) && (Mascota.count11 > Mascota.count5) && (Mascota.count11 > Mascota.count6) && (Mascota.count11 > Mascota.count7) && (Mascota.count11 > Mascota.count8) && (Mascota.count11 > Mascota.count9) && (Mascota.count11 > Mascota.count10) && (Mascota.count11 > Mascota.count12) && (Mascota.count11 > Mascota.count13) && (Mascota.count11 > Mascota.count14) && (Mascota.count11 > Mascota.count15)&& (Mascota.count11 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet11, "Currito", Mascota.count11));
                m111 = Mascota.count11;
                Mascota.count11 = 0;
            } else if ((Mascota.count12 > Mascota.count1) && (Mascota.count12 > Mascota.count2) && (Mascota.count12 > Mascota.count3) && (Mascota.count12 > Mascota.count4) && (Mascota.count12 > Mascota.count5) && (Mascota.count12 > Mascota.count6) && (Mascota.count12 > Mascota.count7) && (Mascota.count12 > Mascota.count8) && (Mascota.count12 > Mascota.count9) && (Mascota.count12 > Mascota.count10) && (Mascota.count12 > Mascota.count11) && (Mascota.count12 > Mascota.count13) && (Mascota.count12 > Mascota.count14) && (Mascota.count12 > Mascota.count15)&& (Mascota.count12 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet12, "Blue", Mascota.count12));
                m112 = Mascota.count12;
                Mascota.count12 = 0;
            } else if ((Mascota.count13 > Mascota.count1) && (Mascota.count13 > Mascota.count2) && (Mascota.count13 > Mascota.count3) && (Mascota.count13 > Mascota.count4) && (Mascota.count13 > Mascota.count5) && (Mascota.count13 > Mascota.count6) && (Mascota.count13 > Mascota.count7) && (Mascota.count13 > Mascota.count8) && (Mascota.count13 > Mascota.count9) && (Mascota.count13 > Mascota.count10) && (Mascota.count13 > Mascota.count11) && (Mascota.count13 > Mascota.count12) && (Mascota.count13 > Mascota.count14) && (Mascota.count13 > Mascota.count15)&& (Mascota.count13 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet13, "Guacamayo", Mascota.count13));
                m113 = Mascota.count13;
                Mascota.count13 = 0;
            } else if ((Mascota.count14 > Mascota.count1) && (Mascota.count14 > Mascota.count2) && (Mascota.count14 > Mascota.count3) && (Mascota.count14 > Mascota.count4) && (Mascota.count14 > Mascota.count5) && (Mascota.count14 > Mascota.count6) && (Mascota.count14 > Mascota.count7) && (Mascota.count14 > Mascota.count8) && (Mascota.count14 > Mascota.count9) && (Mascota.count14 > Mascota.count10) && (Mascota.count14 > Mascota.count11) && (Mascota.count14 > Mascota.count12) && (Mascota.count14 > Mascota.count13) && (Mascota.count14 > Mascota.count15)&& (Mascota.count14 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet14, "Tone", Mascota.count14));
                m114 = Mascota.count14;
                Mascota.count14 = 0;
            } else if ((Mascota.count15 > Mascota.count1) && (Mascota.count15 > Mascota.count2) && (Mascota.count15 > Mascota.count3) && (Mascota.count15 > Mascota.count4) && (Mascota.count15 > Mascota.count5) && (Mascota.count15 > Mascota.count6) && (Mascota.count15 > Mascota.count7) && (Mascota.count15 > Mascota.count8) && (Mascota.count15 > Mascota.count9) && (Mascota.count15 > Mascota.count10) && (Mascota.count15 > Mascota.count11) && (Mascota.count15 > Mascota.count12) && (Mascota.count15 > Mascota.count13) && (Mascota.count15 > Mascota.count14)&& (Mascota.count15 > Mascota.count16)){
                contactos.add(new Mascota(R.drawable.pet15, "Bola", Mascota.count15));
                m115 = Mascota.count15;
                Mascota.count15 = 0;
            } else if ((Mascota.count16 > Mascota.count1) && (Mascota.count16 > Mascota.count2) && (Mascota.count16 > Mascota.count3) && (Mascota.count16 > Mascota.count4) && (Mascota.count16 > Mascota.count5) && (Mascota.count16 > Mascota.count6) && (Mascota.count16 > Mascota.count7) && (Mascota.count16 > Mascota.count8) && (Mascota.count16 > Mascota.count9) && (Mascota.count16 > Mascota.count10) && (Mascota.count16 > Mascota.count11) && (Mascota.count16 > Mascota.count12) && (Mascota.count16 > Mascota.count13) && (Mascota.count16 > Mascota.count14)&& (Mascota.count16 > Mascota.count15)){
                contactos.add(new Mascota(R.drawable.pet16, "Erizo", Mascota.count16));
                m116 = Mascota.count16;
                Mascota.count16 = 0;
            }
        }

        if (m11 > 0){
            Mascota.count1 = m11;
        }
        if (m12 > 0){
            Mascota.count2 = m12;
        }
        if (m13 > 0){
            Mascota.count3 = m13;
        }
        if (m14 > 0){
            Mascota.count4 = m14;
        }
        if (m15 > 0){
            Mascota.count5 = m15;
        }
        if (m16 > 0){
            Mascota.count6 = m16;
        }
        if (m17 > 0){
            Mascota.count7 = m17;
        }
        if (m18 > 0){
            Mascota.count8 = m18;
        }
        if (m19 > 0){
            Mascota.count9 = m19;
        }
        if (m110 > 0){
            Mascota.count10 = m110;
        }
        if (m111 > 0){
            Mascota.count11 = m111;
        }
        if (m112 > 0){
            Mascota.count12 = m112;
        }
        if (m113 > 0){
            Mascota.count13 = m113;
        }
        if (m114 > 0){
            Mascota.count14 = m114;
        }
        if (m115 > 0){
            Mascota.count15 = m115;
        }
        if (m116 > 0){
            Mascota.count16 = m116;
        }

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return super.onKeyDown(keyCode, event);
    }
}
