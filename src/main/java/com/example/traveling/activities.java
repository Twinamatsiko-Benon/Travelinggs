package com.example.traveling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class activities extends AppCompatActivity {
    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);
        textView = findViewById(R.id.txt);
        btn=(Button)findViewById(R.id.bfiles);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text="";
                try{

                    InputStream input=getAssets().open("prog.c");
                    int size=input.available();
                    byte[] buffer=new byte[size];
                    input.read(buffer);
                    input.close();
                    text=new String(buffer);
                   /* AssetManager assetManager = getAssets();
                    String[] files = assetManager.list("");
                    InputStream input = assetManager.open("benon.txt");
*/

                }catch(IOException ex){
                    ex.printStackTrace();

                }
                textView.setText((CharSequence) text);

            }
        });
    }
}
