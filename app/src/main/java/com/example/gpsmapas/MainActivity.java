package com.example.gpsmapas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public abstract class MainActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
        mapFragment.getMapAsync(this);

        Button btnGoToVideo = findViewById(R.id.btnVideo);
        btnGoToVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Video.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);

        LatLng Arica = new LatLng(-18.4835949, -70.3104124);
        mMap.addMarker(new MarkerOptions().position(Arica).title("Sede Arica"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arica));

        LatLng Iquique = new LatLng(-20.2396782, -70.1451126);
        mMap.addMarker(new MarkerOptions().position(Iquique).title("Sede Iquique"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Iquique));

        LatLng Antofagasta = new LatLng(-23.6346738, -70.3941433);
        mMap.addMarker(new MarkerOptions().position(Antofagasta).title("Sede Antofagasta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Antofagasta));

        LatLng LaSerena = new LatLng(-29.9086195, -71.2572741);
        mMap.addMarker(new MarkerOptions().position(LaSerena).title("Sede La Serena"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LaSerena));

        LatLng Vina = new LatLng(-33.0376385, -71.5221503);
        mMap.addMarker(new MarkerOptions().position(Vina).title("Sede Viña del Mar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Vina));

        LatLng Santiago = new LatLng(-33.4489374, -70.6609053);
        mMap.addMarker(new MarkerOptions().position(Santiago).title("Sede Santiago"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Santiago));

        LatLng Talca = new LatLng(-35.4286648, -71.6730936);
        mMap.addMarker(new MarkerOptions().position(Talca).title("Sede Talca"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Talca));

        LatLng Concepcion = new LatLng(-36.8263864, -73.0615921);
        mMap.addMarker(new MarkerOptions().position(Concepcion).title("Sede Concepcion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Concepcion));

        LatLng LosAngeles = new LatLng(-37.472014, -72.3540966);
        mMap.addMarker(new MarkerOptions().position(LosAngeles).title("Sede Los Angeles"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LosAngeles));

        LatLng Temuco = new LatLng(-38.7346549, -72.6020613);
        mMap.addMarker(new MarkerOptions().position(Temuco).title("Sede Temuco"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Temuco));

        LatLng Valdivia = new LatLng(-39.8175085, -73.2333529);
        mMap.addMarker(new MarkerOptions().position(Valdivia).title("Sede Valdivia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Valdivia));

        LatLng Osorno = new LatLng(-40.5717846, -73.1377713);
        mMap.addMarker(new MarkerOptions().position(Osorno).title("Sede Osorno"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Osorno));

        LatLng PuertoMontt = new LatLng(-41.4727705, -72.928931);
        mMap.addMarker(new MarkerOptions().position(PuertoMontt).title("Sede Puerto Montt"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PuertoMontt));
    }

}
