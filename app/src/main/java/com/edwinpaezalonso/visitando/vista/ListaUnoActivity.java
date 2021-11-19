package com.edwinpaezalonso.visitando.vista;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.edwinpaezalonso.visitando.R;
import java.util.ArrayList;
import java.util.List;

public class ListaUnoActivity extends Activity {

    private ListView listView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_uno);

        this.listView1 = (ListView) findViewById(R.id.listView1);


        List items = new ArrayList();
        items.add(new ListaUno(R.drawable.bienvgirardot, "Iglesia Inmaculado Corazón de María",
                ""));
        items.add(new ListaUno(R.drawable.bienvgirardot, "Hotel Unión",
                ""));
        items.add(new ListaUno(R.drawable.bienvgirardot, "Monumento Jorge Eliécer Gaitán",
                ""));
        items.add(new ListaUno(R.drawable.bienvgirardot, "La Locomotora",
                ""));
        items.add(new ListaUno(R.drawable.bienvgirardot, "Puente Férreo",
                ""));
        items.add(new ListaUno(R.drawable.bienvgirardot, "Estación del Tren",
                ""));
        items.add(new ListaUno(R.drawable.bienvgirardot, "Gran Hotel", ""));

        items.add(new ListaUno(R.drawable.bienvgirardot, "Camellón del Comercio", ""));

        items.add(new ListaUno(R.drawable.bienvgirardot, "Parque Bolívar", ""));


        //
        this.listView1.setAdapter(new ListaUnoAdapter(this, items));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String s = listView1.getItemAtPosition(position).toString();


                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(ListaUnoActivity.this, CatedralActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(ListaUnoActivity.this, ClubUnionActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(ListaUnoActivity.this, ParqueJegActivity.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(ListaUnoActivity.this, LocomotoraActivity.class);
                        startActivity(intent4);
                        break;

                    case 4:
                        Intent intent5 = new Intent(ListaUnoActivity.this, PuenteFerreoActivity.class);
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(ListaUnoActivity.this, EstacionActivity.class);
                        startActivity(intent6);
                        break;
                    case 6:
                        Intent intent7 = new Intent(ListaUnoActivity.this, GranHotelActivity.class);
                        startActivity(intent7);
                        break;
                    case 7:
                        Intent intent8 = new Intent(ListaUnoActivity.this, CamellonActivity.class);
                        startActivity(intent8);
                        break;
                    case 8:
                        Intent intent9 = new Intent(ListaUnoActivity.this, ParqueBolivarActivity.class);
                        startActivity(intent9);
                        break;

                }

            }
        });


    }
}