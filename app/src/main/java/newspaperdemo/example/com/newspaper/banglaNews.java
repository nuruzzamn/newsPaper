package newspaperdemo.example.com.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class banglaNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_news);

        Button prothomAlo= (Button) findViewById(R.id.prothomAlo);
        prothomAlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,NprothomAlo.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button shamakal= (Button) findViewById(R.id.shamakal);
        shamakal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,Nshamakal.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button Amadershomoy= (Button) findViewById(R.id.Amadershomoy);
        Amadershomoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,NAmadershomoy.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button amardesh= (Button) findViewById(R.id.amardesh);
        amardesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,Namardesh.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button kalerkontho= (Button) findViewById(R.id.kalerkontho);
        kalerkontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,Nkalerkontho.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button ittefaq= (Button) findViewById(R.id.ittefaq);
        ittefaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,Nittefaq.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

        Button NayaDiganta= (Button) findViewById(R.id.NayaDiganta);
        NayaDiganta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,NNayaDiganta.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

        Button JaiJaiDin= (Button) findViewById(R.id.JaiJaiDin);
        JaiJaiDin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,NJaiJaiDin.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button BangladeshPratidin= (Button) findViewById(R.id.BangladeshPratidin);
        BangladeshPratidin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,NBangladeshratidin.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button DailyInqilab= (Button) findViewById(R.id.DailyInqilab);
        DailyInqilab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,NDailyInqilab.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

        Button ManabZamin= (Button) findViewById(R.id.ManabZamin);
        ManabZamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,NManabZamin.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button DailySangram= (Button) findViewById(R.id.DailySangram);
        DailySangram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNews.this,NDailySangram.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

    }
}
