package com.edwinpaezalonso.visitando;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.edwinpaezalonso.visitando.view.CameraActivity;
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

    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.config) {
            lanzarVisitarActivity(null);
            return true;

        }

        if (id == R.id.menu_mapa) {
            lanzarMapaActivity(null);
            return true;
        }

        if (id == R.id.menu_camara) {
            launchCameraActivity(null);
            return true;
        }


        //  if (id == R.id.acercaDe) {
        //     lanzarAcercadeActivity(null);
        //   return true;
        // }
        return super.onOptionsItemSelected(item);


    }


    public void lanzarVisitarActivity(View view) {

        //Intent i = new Intent(MainActivity.this, ListaUnoActivity.class);
        //startActivity(i);

        Toast toasti =
                Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_LONG);
        toasti.show();
    }

    public void lanzarMapaActivity(View view) {

        //Intent j = new Intent(MainActivity.this, SolicitarActivity.class);
        //startActivity(j);

        Toast toastj =
                Toast.makeText(MainActivity.this, "Ver la Ruta en el Mapa", Toast.LENGTH_LONG);
        toastj.show();
    }

    public void launchCameraActivity (View view) {
        PackageManager packageManager = this.getPackageManager();

        if(packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            Intent cameraIntent = new Intent(this, CameraActivity.class);
            startActivity(cameraIntent);
        } else {
            Toast toastNoCamera =
                Toast.makeText(MainActivity.this, "No se detectó la cámara", Toast.LENGTH_LONG);
            toastNoCamera.show();
        }
    }

    // public void lanzarAcercadeActivity(View view) {

    //     Intent l = new Intent(MainActivity.this, AcercadeActivity.class);
    //     startActivity(l);
    // }

}

