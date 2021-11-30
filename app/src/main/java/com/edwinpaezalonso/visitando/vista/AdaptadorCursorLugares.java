package com.edwinpaezalonso.visitando.vista;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.edwinpaezalonso.visitando.R;

public class AdaptadorCursorLugares extends CursorAdapter {
    private LayoutInflater inflador;
    TextView nombre, direccion;
    ImageView foto;

    public AdaptadorCursorLugares(Context contexto, Cursor c){
        super(contexto, c, false);
    }

    @Override
    public View newView(Context contexto, Cursor c, ViewGroup padre){
        inflador=(LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vista=inflador.inflate(R.layout.elemento_lista, padre, false);
        return vista;
    }
    @Override
    public void bindView(View vista, Context contexto, Cursor c){
        nombre=(TextView) vista.findViewById(R.id.nombre);
        direccion=(TextView) vista.findViewById(R.id.direccion);
        foto=(ImageView) vista.findViewById(R.id.foto);

        nombre.setText(c.getString(c.getColumnIndex("nombre")));
        direccion.setText(c.getString(c.getColumnIndex("direccion")));
        foto.setImageResource(R.drawable.bienvgirardot);
        foto.setScaleType(ImageView.ScaleType.FIT_END);

    }

}
