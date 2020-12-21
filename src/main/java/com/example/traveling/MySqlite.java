package com.example.traveling;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MySqlite extends AppCompatActivity {
    Help myDb;
    EditText edit1,edit2;
    Button buto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sqlite);
        myDb=new Help(this);
        edit1=findViewById(R.id.namee);
        edit2=findViewById(R.id.emi);
        buto=findViewById(R.id.button6);
        submitData();
    }
    public void submitData(){
        buto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              boolean IfInserted=  myDb.putData(edit1.getText().toString(),
                        edit2.getText().toString());
              if (IfInserted=true)
                  Toast.makeText(MySqlite.this,"Data inserted",Toast
                  .LENGTH_LONG).show();
              else
                  Toast.makeText(MySqlite.this,"Data not inserted",Toast
                          .LENGTH_LONG).show();

            }
        });
    }
}
