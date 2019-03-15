package com.veegadiego.ejercicio2labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView mundo1;
    private ImageView google1;
    private ImageView lapiz1;

    private ImageView mundo2;
    private ImageView google2;
    private ImageView lapiz2;

    private ImageView mundo3;
    private ImageView google3;
    private ImageView lapiz3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mundo1=findViewById(R.id.mundo1);
        mundo2=findViewById(R.id.mundo2);
        mundo3=findViewById(R.id.mundo3);

        lapiz1=findViewById(R.id.lapiz1);
        lapiz2=findViewById(R.id.lapiz2);
        lapiz3=findViewById(R.id.lapiz3);

        google1=findViewById(R.id.goo1);
        google2=findViewById(R.id.goo2);
        google3=findViewById(R.id.goo3);

        mundo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        mundo1.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        mundo1.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        mundo1.setImageResource(R.drawable.google);
                        break;
                }
            }
        });

        mundo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        mundo2.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        mundo2.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        mundo2.setImageResource(R.drawable.google);
                        break;
                }
            }
        });

        mundo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        mundo3.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        mundo3.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        mundo3.setImageResource(R.drawable.google);
                        break;
                }
            }
        });

        lapiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        lapiz1.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        lapiz1.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        lapiz1.setImageResource(R.drawable.google);
                        break;
                }
            }
        });

        lapiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        lapiz2.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        lapiz2.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        lapiz2.setImageResource(R.drawable.google);
                        break;
                }
            }
        });
        lapiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        lapiz3.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        lapiz3.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        lapiz3.setImageResource(R.drawable.google);
                        break;
                }
            }
        });

        google1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        google1.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        google1.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        google1.setImageResource(R.drawable.google);
                        break;
                }
            }
        });

        google2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        google2.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        google2.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        google2.setImageResource(R.drawable.google);
                        break;
                }
            }
        });

        google3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nume=(int) ((Math.random()*3)+1);
                switch (nume){
                    case 1:
                        google3.setImageResource(R.drawable.mundo);
                        break;
                    case 2:
                        google3.setImageResource(R.drawable.lapiz);
                        break;
                    case 3:
                        google3.setImageResource(R.drawable.google);
                        break;
                }
            }
        });

    }
}
