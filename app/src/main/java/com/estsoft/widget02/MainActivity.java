package com.estsoft.widget02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton_Female:
                        ((TextView)findViewById(R.id.textView)).setText("Female");
                        break;
                    case R.id.radioButton_Male:
                        ((TextView)findViewById(R.id.textView)).setText("Male");
                        break;
                    default:
                        break;
                }
            }
        });

        findViewById(R.id.checkBox).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb = ((CheckBox)v);
                cb.setText( (cb).isChecked() ? "checked" : "unchecked" );


            }
        });

        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toggleButton.isChecked()) ((TextView)findViewById(R.id.textView)).setText("켜짐");
                else ((TextView)findViewById(R.id.textView)).setText("꺼짐");
            }
        });
    }
}