package com.example.harshkeshwala.harshkeshwala_mapd711_assignment4;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private String campus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Intent i = getIntent();
        campus = i.getStringExtra("campus");


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.getUiSettings().setZoomControlsEnabled(true);
        //mMap.getUiSettings().setCompassEnabled(true);
        //mMap.getUiSettings().setMyLocationButtonEnabled(true);
        //mMap.getUiSettings().setMapToolbarEnabled(true);
        // Add a marker in campus locations and move the camera
        //mMap.setMapStyle(GoogleMap.MAP_TYPE_SATELLITE);

        switch(campus)
        {
            case "Progress Campus":
                LatLng progress = new LatLng(43.7854, -79.2265);
                mMap.addMarker(new MarkerOptions().position(progress).title("CENTENNIAL COLLEGE - Progress Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(progress));
                break;

            case "Morningside Campus":
                LatLng morningside = new LatLng(43.7863, -79.1931);
                mMap.addMarker(new MarkerOptions().position(morningside).title("CENTENNIAL COLLEGE - Morningside Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(morningside));
                break;

            case "Main Campus":
                LatLng m = new LatLng(46.5289, -80.9408);
                mMap.addMarker(new MarkerOptions().position(m).title("CAMBRIAN COLLEGE - Main Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(m));
                break;

            case "Espanola Campus":
                LatLng e = new LatLng(46.2657, -81.7708);
                mMap.addMarker(new MarkerOptions().position(e).title("CAMBRIAN COLLEGE - Espanola Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(e));
                break;

            case "Manitoulin Campus":
                LatLng mt = new LatLng(45.9811, -81.9267);
                mMap.addMarker(new MarkerOptions().position(mt).title("CAMBRIAN COLLEGE - Manitoulin Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(mt));
                break;

            case "Doon Campus":
                LatLng dn = new LatLng(43.3907, -80.4060);
                mMap.addMarker(new MarkerOptions().position(dn).title("CONESTOGA COLLEGE - Doon Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(dn));
                break;

            case "Waterloo Campus":
                LatLng wc = new LatLng(43.4790, -80.5179);
                mMap.addMarker(new MarkerOptions().position(wc).title("CONESTOGA COLLEGE - Waterloo Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(wc));
                break;

            case "York Campus":
                LatLng yc = new LatLng(43.7714, -79.4988);
                mMap.addMarker(new MarkerOptions().position(yc).title("SENECA COLLEGE - York Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(yc));
                break;

            case "Newnham Campus":
                LatLng nc = new LatLng(43.7957, -79.3500);
                mMap.addMarker(new MarkerOptions().position(nc).title("SENECA COLLEGE - Newnham Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(nc));
                break;

            case "Casa Loma Campus":
                LatLng clc = new LatLng(43.6510, -79.3702);
                mMap.addMarker(new MarkerOptions().position(clc).title("GEORGE BROWN COLLEGE - Casa Loma Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(clc));
                break;

            case "St. James Campus":
                LatLng sjc = new LatLng(43.6761, -79.4105);
                mMap.addMarker(new MarkerOptions().position(sjc).title("GEORGE BROWN COLLEGE - St. James Campus"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sjc));
                break;
            default:
        }

    }
}
