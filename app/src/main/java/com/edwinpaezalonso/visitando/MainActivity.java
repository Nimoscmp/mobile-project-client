package com.edwinpaezalonso.visitando;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.edwinpaezalonso.visitando.vista.ListaUnoActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView image=new ImageView(this);
        setContentView(image);
        TransitionDrawable transition=(TransitionDrawable)
                getResources().getDrawable(R.drawable.transicion);
        image.setImageDrawable(transition);
        transition.startTransition(5000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.config) {
            lanzarRegistroActivity(null);
            return true;

        }

        if (id == R.id.menu_mapa) {
            lanzarMapaActivity(null);
            return true;
        }


        //  if (id == R.id.acercaDe) {
        //     lanzarAcercadeActivity(null);
        //   return true;
        // }
        return super.onOptionsItemSelected(item);


    }


    public void lanzarRegistroActivity(View view) {

        Intent i = new Intent(MainActivity.this, RegistroActivity.class);
        startActivity(i);

        Toast toasti =
                Toast.makeText(MainActivity.this, "Registrarse en VistAndo", Toast.LENGTH_LONG);
        toasti.show();
    }

    public void lanzarMapaActivity(View view) {

        Intent j = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(j);

        Toast toastj =
                Toast.makeText(MainActivity.this, "Ver la Ruta en el Mapa", Toast.LENGTH_LONG);
        toastj.show();
    }


    // public void lanzarAcercadeActivity(View view) {

    //     Intent l = new Intent(MainActivity.this, AcercadeActivity.class);
    //     startActivity(l);
    // }

}

