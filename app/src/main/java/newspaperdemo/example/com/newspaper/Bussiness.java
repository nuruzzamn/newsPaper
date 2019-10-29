package newspaperdemo.example.com.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bussiness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bussiness);

        Button ctgStock= (Button) findViewById(R.id.ctgStock);
        ctgStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(Bussiness.this,BctgStock.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button dhakaStock= (Button) findViewById(R.id.dhakaStock);
        dhakaStock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(Bussiness.this,BdhakaStock.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button shareMarket= (Button) findViewById(R.id.shareMarket);
        shareMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(Bussiness.this,BshareMarket.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button stockBangladesh= (Button) findViewById(R.id.stockBangladesh);
        stockBangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(Bussiness.this,BstockBangladesh.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });
    }
}
