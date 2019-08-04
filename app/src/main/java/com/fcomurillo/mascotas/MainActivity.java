package com.fcomurillo.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> contactos;
    private RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        miActionBar.setLogo(R.drawable.pata);

        listaContactos = findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        //GridLayoutManager glm = new GridLayoutManager(this, 2);


        listaContactos.setLayoutManager(llm);
        inicializarListaContactos();
        inicializarAdaptador();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.itmRaking:
                //Toast.makeText(this, "Item 1 selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MascotasFavoritas.class);
                this.startActivity(intent);
                return true;
            case R.id.itmCerrar:
                //Toast.makeText(this, "Item 2 selected", Toast.LENGTH_SHORT).show();
                finish();
                System.exit(0);
                return true;
            /*case R.id.item3:
                Toast.makeText(this, "Item 3 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this, "Sub Item 1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this, "Sub Item 2 selected", Toast.LENGTH_SHORT).show();
                return true;*/
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void inicializarAdaptador() {
        MascotaAdapter adaptador = new MascotaAdapter(contactos, this);
        listaContactos.setAdapter(adaptador);
    }

    public void inicializarListaContactos() {
        contactos = new ArrayList<Mascota>();

        contactos.add(new Mascota(R.drawable.pet1, "Pelusa", Mascota.count1));
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
        contactos.add(new Mascota(R.drawable.pet16, "Erizo", Mascota.count16));
    }
}
