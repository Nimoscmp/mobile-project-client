package com.edwinpaezalonso.visitando.vista;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.edwinpaezalonso.visitando.R;
import com.edwinpaezalonso.visitando.model.Lugar;
import com.edwinpaezalonso.visitando.model.Lugares;

public class FichaLugar extends AppCompatActivity {
    private long id;
    private Lugar lugar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_lugar);
        Bundle extras=getIntent().getExtras();
        id=extras.getLong("id",-1);
        lugar= Lugares.elemento((int)id);
        TextView nombre= (TextView) findViewById(R.id.nombre);
        nombre.setText(lugar.getNombre());
        ImageView foto=(ImageView) findViewById(R.id.foto);
        foto.setImageResource(R.drawable.bienvgirardot);
        TextView descripcion=(TextView) findViewById(R.id.descripcion);
        descripcion.setText(lugar.getDescripcion());
        TextView direccion=(TextView) findViewById(R.id.direccion);
        direccion.setText(lugar.getDireccion());
        TextView informacion=(TextView) findViewById(R.id.informacion);
        informacion.setText(lugar.getInformacion());
        TextView precio=(TextView) findViewById(R.id.precio);
        precio.setText(lugar.getPrecio());
        TextView horario=(TextView) findViewById(R.id.horario);
        horario.setText(lugar.getHorario());
    }
}
