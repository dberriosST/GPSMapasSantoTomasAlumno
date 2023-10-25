package com.example.gpsmapas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener{

    EditText txtLatitud, txtLongitud;

    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLatitud=findViewById(R.id.txt_Latitud);
        txtLongitud=findViewById(R.id.txt_Longitud);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap){
        nMap=googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng Arica = new LatLng(-18.4835949, -70.3104124);
        nMap.addMarker(new MarkerOptions().position(Arica).title("Sede Arica"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Arica));

        LatLng Iquique = new LatLng(-20.2396782, -70.1451126);
        nMap.addMarker(new MarkerOptions().position(Iquique).title("Sede Iquique"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Iquique));

        LatLng Antofagasta = new LatLng(-23.6346738, -70.3941433);
        nMap.addMarker(new MarkerOptions().position(Antofagasta).title("Sede Antofagasta"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Antofagasta));

        LatLng LaSerena = new LatLng(-29.9086195, -71.2572741);
        nMap.addMarker(new MarkerOptions().position(LaSerena).title("Sede La Serena"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(LaSerena));

        LatLng Vina = new LatLng(-33.0376385, -71.5221503);
        nMap.addMarker(new MarkerOptions().position(Vina).title("Sede Viña del Mar"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Vina));

        LatLng Santiago = new LatLng(-33.4489374, -70.6609053);
        nMap.addMarker(new MarkerOptions().position(Santiago).title("Sede Santiago"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Santiago));

        LatLng Talca = new LatLng(-35.4286648, -71.6730936);
        nMap.addMarker(new MarkerOptions().position(Talca).title("Sede Talca"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));


        LatLng Concepcion = new LatLng(-36.8263864, -73.0615921);
        nMap.addMarker(new MarkerOptions().position(Concepcion).title("Sede Concepcion"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Concepcion));

        LatLng LosAngeles = new LatLng(-37.472014, -72.3540966);
        nMap.addMarker(new MarkerOptions().position(LosAngeles).title("Sede Los Angeles"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(LosAngeles));

        LatLng Temuco = new LatLng(-38.7346549, -72.6020613);
        nMap.addMarker(new MarkerOptions().position(Temuco).title("Sede Temuco"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));

        LatLng Valdivia = new LatLng(-39.8175085, -73.2333529);
        nMap.addMarker(new MarkerOptions().position(Valdivia).title("Sede Valdivia"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Valdivia));

        LatLng Osorno = new LatLng(-40.5717846, -73.1377713);
        nMap.addMarker(new MarkerOptions().position(Osorno).title("Sede Osorno"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(Osorno));

        LatLng PuertoMontt = new LatLng(-41.4727705, -72.928931);
        nMap.addMarker(new MarkerOptions().position(PuertoMontt).title("Sede Puerto Montt"));
        nMap.moveCamera(CameraUpdateFactory.newLatLng(PuertoMontt));
    }
}