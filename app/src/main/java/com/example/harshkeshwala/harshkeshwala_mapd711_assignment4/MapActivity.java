package com.example.harshkeshwala.harshkeshwala_mapd711_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MapActivity extends AppCompatActivity {

    private TextView collegeName;
    private Button mapView;
    private TextView campusAddress;
    private TextView campusName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Intent i = getIntent();
        final String campus =  i.getStringExtra("campus");
        final String college = i.getStringExtra("college");

        collegeName = (TextView) findViewById(R.id.textView);
        collegeName.setText(college);

        campusName = (TextView) findViewById(R.id.campusName);
        campusName.setText(campus);

        campusAddress = (TextView) findViewById(R.id.campusAddress);

        switch(campus)
        {
            case "Progress Campus":
                campusAddress.setText("941 Progress Ave, \n Scarborough, ON M1G 3T8");
                break;

            case "Morningside Campus":
                campusAddress.setText("755 Morningside Ave, \n Scarborough, ON M1C 4Z4");
                break;

            case "Main Campus":
                campusAddress.setText("1400 Barry Downe Rd, \n Sudbury, ON P3A 3V8");
                break;

            case "Espanola Campus":
                campusAddress.setText("91 Tudhope St, \n Espanola, ON P5E 1S6");
                break;

            case "Manitoulin Campus":
                campusAddress.setText("7 Water St, \n Little Current, ON P0P 1K0");
                break;

            case "Doon Campus":
                campusAddress.setText("299 Doon Valley Dr, \n Kitchener, ON N2G 4M4");
                break;

            case "Waterloo Campus":
                campusAddress.setText("108 University Ave, \n Waterloo, ON N2J 2W2");
                break;

            case "York Campus":
                campusAddress.setText("70 The Pond Rd, \n North York, ON M3J 3M6");
                break;

            case "Newnham Campus":
                campusAddress.setText("1750 Finch Ave E, \n North York, ON M2J 2X5");
                break;

            case "Casa Loma Campus":
                campusAddress.setText("160 Kendal Ave, \n Toronto, ON M5R 1M3");
                break;

            case "St. James Campus":
                campusAddress.setText("200 King St E, \n Toronto, ON M5A 3W8");
                break;

            default:
        }

        mapView = (Button)findViewById(R.id.mapView);
        mapView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MapActivity.this, MapsActivity.class);
                intent.putExtra("campus", campus);
                startActivity(intent);
            }
        });
    }
}
