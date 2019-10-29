package newspaperdemo.example.com.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class englishNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_news);

       Button buttonBanglaNews24= (Button) findViewById(R.id.buttonBanglaNews24);
        buttonBanglaNews24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(englishNews.this,BanglaNews24.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button bdNews24= (Button) findViewById(R.id.bdNews24);
        bdNews24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(englishNews.this,BdNews24.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button dailyAsianAge= (Button) findViewById(R.id.dailyAsianAge);
        dailyAsianAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(englishNews.this,DailyAsianAge.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button dailyStar= (Button) findViewById(R.id.dailyStar);
        dailyStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(englishNews.this,DailyStar.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button newsToday= (Button) findViewById(R.id.newsToday);
        newsToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(englishNews.this,NewsToday.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button bdToday= (Button) findViewById(R.id.bdToday);
        bdToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(englishNews.this,BdToday.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });
    }
}
