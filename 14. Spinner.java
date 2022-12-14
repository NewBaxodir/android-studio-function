
package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerExample extends AppCompatActivity {
    Spinner spinner;
    String[] bankNames={"SBI","BOI","PNB","HDFC","OBC"};

    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
    super.onCreate(savedInstanceState); 
    setContentView(R.layout.activity_spinner_example); 
    
      spinner=(Spinner)findViewById(R.id.spinner1); 
    
    ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item,bankNames);
    arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(arrayAdapter);
    
      spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
      public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), bankNames[position], Toast.LENGTH_LONG).show()
        } 
   
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
    });
    }
}
