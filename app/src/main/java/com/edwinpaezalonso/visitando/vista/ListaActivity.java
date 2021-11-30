package com.edwinpaezalonso.visitando.vista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.edwinpaezalonso.visitando.R;
import com.edwinpaezalonso.visitando.model.Lugares;

public class ListaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public AdaptadorCursorLugares adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_activity);
        //adaptador = new AdaptadorLugares(this);
        Lugares.inicializaBD(this);
        adaptador=new AdaptadorCursorLugares(this, Lugares.listado());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adaptador);
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View vista, int posicion, long id){
        Intent m=new Intent(this,FichaLugar.class);
        m.putExtra("id", id);
        startActivity(m);
    }
}
