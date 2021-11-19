package com.edwinpaezalonso.visitando.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

public class Lugares {
    protected static List<Lugar> vectorLugares=ejemploLugares();

    public Lugares() {
        vectorLugares=ejemploLugares();
    }

    static Lugar elemento(int id){
        return vectorLugares.get(id);
    }

    static void anyade(Lugar lugar){
        vectorLugares.add(lugar);
    }

    static int nuevo(){
        Lugar lugar=new Lugar("Parque La Locomotora","ruta foto", "Ubicado en la antigua estación del tren",
                "Cra 18 N° 22-10","Es un monumento de gran importancia para Girardot por que se encuentra la antigua locomotora Skoda  identificada con el número 89.",
                "Libre Entrada","Abierta las 24 horas");
        vectorLugares.add(lugar);
        return vectorLugares.size()-1;
    }

    static void borrar(int id){
        vectorLugares.remove(id);
    }

    public static int size(){
        return vectorLugares.size();
    }

    //Se agregan para conexión con base de datos SQLite
    private static LugaresBD lugaresBD;

    //Llama al constructor de la clase Lugares BD para inicializar la conexión
    public static void inicializaBD(Context contexto){
        lugaresBD=new LugaresBD(contexto);
    }

    //public static Cursor listado(){
        //SQLiteDatabase bd=LugaresBD.getReadableDatabase();
        //return bd.rawQuery("SELECT * FROM lugares", null);
   // }


    public static ArrayList<Lugar> ejemploLugares(){
        ArrayList<Lugar> lugares=new ArrayList<Lugar>();
        lugares.add(new Lugar("Parque La Locomotora","ruta foto", "Ubicado en la antigua estación del tren",
                "Cra 18 N° 22-10","Es un monumento de gran importancia para Girardot por que se encuentra la antigua locomotora Skoda  identificada con el número 89.",
                "Libre Entrada","Abierta las 24 horas"));
        return lugares;
    }
}
