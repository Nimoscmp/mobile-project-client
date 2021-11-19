package com.edwinpaezalonso.visitando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng parque_girardot = new LatLng(4.2971318, -74.8071356);
        LatLng catedral_gir = new LatLng(4.2974731, -74.8071189);
        LatLng hotel_union = new LatLng(4.297104, -74.8076996);
        LatLng monumento_jeg = new LatLng(4.2969904, -74.8084774);
        LatLng locomotora = new LatLng(4.296853, -74.8087798);
        LatLng puente_ferreo = new LatLng(4.2943337, -74.8105536);
        LatLng estacion_tren = new LatLng(4.2961206, -74.8091166);
        LatLng gran_hotel = new LatLng(4.296136, -74.8093258);
        LatLng camellon = new LatLng(4.2962333, -74.8086238);

        mMap.addMarker(new MarkerOptions()
                .position(parque_girardot)
                .title("Parque Bolívar Girardot"));
        mMap.addMarker(new MarkerOptions()
                .position(catedral_gir)
                .title("Iglesia Inmaculado Corazón de María"));
        mMap.addMarker(new MarkerOptions()
                .position(hotel_union)
                .title("Hotel Unión"));
        mMap.addMarker(new MarkerOptions()
                .position(monumento_jeg)
                .title("Monumento a Jorge Eliécer Gaitán"));
        mMap.addMarker(new MarkerOptions()
                .position(locomotora)
                .title("Parque La Locomotora"));
        mMap.addMarker(new MarkerOptions()
                .position(puente_ferreo)
                .title("Puente Férreo"));
        mMap.addMarker(new MarkerOptions()
                .position(estacion_tren)
                .title("Estación del Tren"));
        mMap.addMarker(new MarkerOptions()
                .position(gran_hotel)
                .title("El Gran Hotel"));
        mMap.addMarker(new MarkerOptions()
                .position(camellon)
                .title("Camellón del Comercio"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(parque_girardot));
    }
}
