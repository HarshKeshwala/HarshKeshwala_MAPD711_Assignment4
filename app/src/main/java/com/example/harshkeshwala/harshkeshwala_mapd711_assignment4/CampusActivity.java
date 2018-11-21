package com.example.harshkeshwala.harshkeshwala_mapd711_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CampusActivity extends AppCompatActivity {

    private TextView col;
    private ListView campusList;
    private String college;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);

        Intent i = getIntent();
        college = i.getStringExtra("college");

        col = (TextView)findViewById(R.id.col);
        col.setText(college);

        campusList = (ListView)findViewById(R.id.campus_list);

        switch(college) {

            case "Cambrian College":

                ArrayAdapter<CharSequence> adapterCambrian = ArrayAdapter.createFromResource(this, R.array.CambrianCampus, android.R.layout.simple_list_item_1);
                campusList.setAdapter(adapterCambrian);
                break;

            case "Centennial College":

                ArrayAdapter<CharSequence> adapterCentennial = ArrayAdapter.createFromResource(this, R.array.CentennialCampus, android.R.layout.simple_list_item_1);
                campusList.setAdapter(adapterCentennial);
                break;

            case "Conestoga College":

                ArrayAdapter<CharSequence> adapterConestoga = ArrayAdapter.createFromResource(this, R.array.ConestogaCampus, android.R.layout.simple_list_item_1);
                campusList.setAdapter(adapterConestoga);
                break;

            case "George Brown College":

                ArrayAdapter<CharSequence> adapterGeorgebrown = ArrayAdapter.createFromResource(this, R.array.GeorgebrownCampus, android.R.layout.simple_list_item_1);
                campusList.setAdapter(adapterGeorgebrown);
                break;

            case "Seneca College":

                ArrayAdapter<CharSequence> adapterSeneca = ArrayAdapter.createFromResource(this, R.array.SenecaCampus, android.R.layout.simple_list_item_1);
                campusList.setAdapter(adapterSeneca);
                break;

            default:
        }

        campusList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem = (String) parent.getItemAtPosition(position);

                Intent intent = new Intent(CampusActivity.this, MapActivity.class);
                intent.putExtra("campus",selectedItem);
                intent.putExtra("college", college);
                startActivity(intent);
            }
        });
    }
}
