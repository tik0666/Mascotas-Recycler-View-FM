package com.fcomurillo.mascotas;

public class Mascota {
    private String nombre;
    private int foto;
    public int calificacion = 0;

    public static int count1 = 0;
    public static int count2 = 0;
    public static int count3 = 0;
    public static int count4 = 0;
    public static int count5 = 0;
    public static int count6 = 0;
    public static int count7 = 0;
    public static int count8 = 0;
    public static int count9 = 0;
    public static int count10 = 0;
    public static int count11 = 0;
    public static int count12 = 0;
    public static int count13 = 0;
    public static int count14 = 0;
    public static int count15 = 0;
    public static int count16 = 0;

    public Mascota(int foto,String nombre, int calificacion) {
        this.foto = foto;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public int getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
