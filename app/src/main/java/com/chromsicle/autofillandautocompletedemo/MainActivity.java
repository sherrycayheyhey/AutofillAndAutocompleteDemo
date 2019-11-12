package com.chromsicle.autofillandautocompletedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*************AutoComplete*************
        //will show the array item which the user can click to auto complete
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        //array for the list of potential LEGO sets the user might want to look at
        String[] modulars = {"Cafe Corner", "Green Grocer", "Grand Emporium", "Garage", "Fire Station", "Town Hall"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, modulars);
        autoCompleteTextView.setAdapter(arrayAdapter);
        //default is that you need to type two letters so this changes it to the first letter
        //you probably want more letters if the list is huge
        autoCompleteTextView.setThreshold(1);
    }
}

//*************AutoFill*************
//mostly used as a password manager
//we can make our app work with it though
//fill in stuff like android:autofillHints="AUTOFIll_HINT_USERNAME" in the activity_main.xml
//other stuff like email, postal address, etc.