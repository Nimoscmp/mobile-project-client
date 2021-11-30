package com.edwinpaezalonso.visitando.model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class Lugares {

    //Se agrega para conexión con base de datos SQLite
    public static LugaresBD lugaresBD;

    //Llama al constructor de la clase Lugares BD para inicializar la conexión
    public static void inicializaBD(Context contexto){
       lugaresBD=new LugaresBD(contexto);
    }

    public static Cursor listado(){
        SQLiteDatabase bd=lugaresBD.getReadableDatabase();
        return bd.rawQuery("SELECT * FROM lugares", null);
    }


    public static Lugar elemento(int id){
        Lugar lugar=null;
        SQLiteDatabase bd=lugaresBD.getReadableDatabase();
        Cursor cursor=bd.rawQuery("SELECT * FROM lugares WHERE _id = "+id,null);
        if(cursor.moveToNext()){
            lugar=new Lugar("", "", "", "", "", "", "");
            lugar.setNombre(cursor.getString(1));
            lugar.setFoto(cursor.getString(2));
            lugar.setDescripcion(cursor.getString(3));
            lugar.setDireccion(cursor.getString(4));
            lugar.setInformacion(cursor.getString(5));
            lugar.setPrecio(cursor.getString(6));
            lugar.setHorario(cursor.getString(7));

        }
        cursor.close();
        bd.close();
        return lugar;
    }

    public static int size() {
        return Lugares.size();
    }

}



