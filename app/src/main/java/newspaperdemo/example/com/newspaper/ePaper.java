package newspaperdemo.example.com.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ePaper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_paper);

       Button buttonEprothomAlo= (Button) findViewById(R.id.buttonEprothomAlo);
        buttonEprothomAlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(ePaper.this,EprothomAlo.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button buttonEkalerKontho= (Button) findViewById(R.id.buttonEkalerKontho);
        buttonEkalerKontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(ePaper.this,EkalerKontho.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button buttonEshamakal= (Button) findViewById(R.id.button3);
        buttonEshamakal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(ePaper.this,Eshamakal.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button buttonEbonikBarta= (Button) findViewById(R.id.button4);
        buttonEbonikBarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(ePaper.this,EbonikBarta.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });
    }
}
