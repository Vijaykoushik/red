package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move=findViewById(R.id.button3);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,third.class);
                startActivity(intent);
            }
        });
    }
    public void max(View V){
        EditText a=(EditText)findViewById(R.id.editText);
        TextView t=(TextView)findViewById(R.id.textView2);
        TextView t2=(TextView)findViewById(R.id.textView3);
        Button btn =(Button)findViewById(R.id.button2);
        int num1=Integer.parseInt(a.getText().toString());
        float num2=5;
        Float max=(num1*num2);
        Float min=(num1/num2);
        t.setText(Float.toString(max));
        t2.setText(Float.toString(min));





    }
}