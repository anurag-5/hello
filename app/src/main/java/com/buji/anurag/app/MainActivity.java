package com.buji.anurag.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3;
    Button b1;
    String a,b,Result;
    int c,d,x;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.e);
        et2=(EditText)findViewById(R.id.e1);
        et3=(EditText)findViewById(R.id.e3);
        b1=(Button)findViewById(R.id.b);
        t1=(TextView)findViewById(R.id.t);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=et1.getText().toString();
                b=et2.getText().toString();
                c=Integer.parseInt(a);
                d=Integer.parseInt(b);

                x=c+d;
                Result=String.valueOf(x);
                t1.setVisibility(View.VISIBLE);
                et3.setVisibility(View.VISIBLE);
                et3.setText(Result);



            }
        });
    }
}
