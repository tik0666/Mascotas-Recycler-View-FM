package com.fcomurillo.mascotas;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.ContactoViewHolder> {
    ArrayList<Mascota> contactos;
    Activity activity;

    public MascotaAdapter(ArrayList<Mascota> contactos, Activity activity){
        this.contactos = contactos;
        this.activity = activity;
    }

    @NonNull
    //Inflar el layout y lo pasara al viewholder para que el obtenga los views
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_mascota, viewGroup, false);
        return new ContactoViewHolder(v);
    }

    //int raking = 0;
    // valor = "";
    @Override
    //Asocia cada elemento de la lista a cada view
    public void onBindViewHolder(@NonNull final ContactoViewHolder contactoViewHolder, int i) {
        final Mascota contacto = contactos.get(i);
        contactoViewHolder.imagFoto.setImageResource(contacto.getFoto());
        contactoViewHolder.tvNombre.setText(contacto.getNombre());
        contactoViewHolder.tvTotalHuesos.setText(String.valueOf(contacto.getCalificacion()));

        /*contactoViewHolder.imagFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, contacto.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, DetalleMascota.class);
                intent.putExtra("nombre", contacto.getNombre());
                intent.putExtra("telefono", contacto.getTelefono());
                intent.putExtra("email", contacto.getEmail());
                activity.startActivity(intent);
            }
        });*/



        contactoViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactoViewHolder.tvTotalHuesos.setText(String.valueOf(contacto.getCalificacion() + 1));
                contacto.setCalificacion((contacto.getCalificacion() + 1));

                if (contacto.getNombre() == "Pelusa"){
                    Mascota.count1 += 1;
                } else if (contacto.getNombre() == "Pirrurris") {
                    Mascota.count2 += 1;
                }
                else if (contacto.getNombre() == "Minino") {
                    Mascota.count3 += 1;
                }
                else if (contacto.getNombre() == "Rayas") {
                    Mascota.count4 += 1;
                }
                else if (contacto.getNombre() == "Huesos") {
                    Mascota.count5 += 1;
                }
                else if (contacto.getNombre() == "Manotas") {
                    Mascota.count6 += 1;
                }
                else if (contacto.getNombre() == "Gatito") {
                    Mascota.count7 += 1;
                }
                else if (contacto.getNombre() == "Dumbo") {
                    Mascota.count8 += 1;
                }
                else if (contacto.getNombre() == "Ghost") {
                    Mascota.count9 += 1;
                }
                else if (contacto.getNombre() == "Rulo") {
                    Mascota.count10 += 1;
                }
                else if (contacto.getNombre() == "Currito") {
                    Mascota.count11 += 1;
                }
                else if (contacto.getNombre() == "Blue") {
                    Mascota.count12 += 1;
                }
                else if (contacto.getNombre() == "Guacamayo") {
                    Mascota.count13 += 1;
                }
                else if (contacto.getNombre() == "Tone") {
                    Mascota.count14 += 1;
                }
                else if (contacto.getNombre() == "Bola") {
                    Mascota.count15 += 1;
                }
                else if (contacto.getNombre() == "Erizo") {
                    Mascota.count16 += 1;
                }
            }
        });
    }

    @Override
    public int getItemCount() { //CANTIDAD DE ELEMENTOS QUE CONTIENE MI LISTA
        return contactos.size();
    }



    public static class ContactoViewHolder extends RecyclerView.ViewHolder{

        private ImageView imagFoto;
        private TextView tvNombre;
        private ImageButton btnLike;
        private TextView tvTotalHuesos;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imagFoto = itemView.findViewById(R.id.imgFoto);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            btnLike = itemView.findViewById(R.id.btnLike);
            tvTotalHuesos = itemView.findViewById(R.id.tvTotalHuesos);
        }
    }
}
