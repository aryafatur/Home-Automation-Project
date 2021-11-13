 package com.RuangCIptaTeknologi.homeautomation;

import androidx.appcompat.app.AppCompatActivity;ampl
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;


 public class MainActivity extends AppCompatActivity implements OnClickListener {

     ToggleButton mBTN;
     ImageView mIMG;
     Button mnBTN, mbBTN, msBTN;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         mBTN = findViewById(R.id.tBTN);
         mIMG = findViewById(R.id.imglamp);
         mnBTN = findViewById(R.id.nBTN);
         mbBTN = findViewById(R.id.bBTN);
         msBTN = findViewById(R.id.saBTN);

         mBTN.setOnClickListener(this);
     }

     @Override
     public void onClick(View view) {
         toggleLed();
     }
     void toggleLed() {
         if (mBTN.isChecked()) {
             turnOnLed();
         } else {
             turnOffLed();
         }
     }
     private void turnOnLed() {
         Toast.makeText(MainActivity.this, "LAMPU MENYALA", Toast.LENGTH_SHORT).show();
         mBTN.setChecked(true);
         mIMG.setImageResource(R.drawable.ic_lampunyala);
     }
     private void turnOffLed() {
         Toast.makeText(MainActivity.this, "LAMPU MATI", Toast.LENGTH_SHORT).show();
         mBTN.setChecked(false);
         mIMG.setImageResource(R.drawable.ic_lampumati);
     }
 }