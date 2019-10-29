package newspaperdemo.example.com.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button banglaNews,englishNews,buttonForLiveCricket;
    ImageButton buttonGoogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banglaNews= (Button) findViewById(R.id.buttonForBanglaNews);
        englishNews= (Button) findViewById(R.id.buttonForEnglishNews);
        buttonForLiveCricket= (Button) findViewById(R.id.buttonForLiveCricket);
        buttonGoogle= (ImageButton) findViewById(R.id.imageButtonForSearch);

        banglaNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(MainActivity.this,banglaNewspapertype.class);
                startActivity(bangla);

            }
        });

        englishNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent english=new Intent(MainActivity.this,englishNews.class);
                startActivity(english);
            }
        });


        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent buttonGoogle=new Intent(MainActivity.this,Google.class);
                startActivity(buttonGoogle);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        buttonForLiveCricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent buttonForLiveCricket=new Intent(MainActivity.this,ForLiveCricket.class);
                startActivity(buttonForLiveCricket);

            }
        });



    }
}
