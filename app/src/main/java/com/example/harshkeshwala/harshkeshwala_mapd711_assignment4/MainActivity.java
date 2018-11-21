package com.example.harshkeshwala.harshkeshwala_mapd711_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView collegeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.colleges, android.R.layout.simple_list_item_1);

        collegeList = (ListView) findViewById(R.id.college_list);
        collegeList.setAdapter(adapter);

        collegeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem = (String) parent.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity.this, CampusActivity.class);
                intent.putExtra("college",selectedItem);
                startActivity(intent);
            }
        });
    }
}
