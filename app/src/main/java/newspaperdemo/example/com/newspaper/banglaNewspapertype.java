package newspaperdemo.example.com.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class banglaNewspapertype extends AppCompatActivity {
    Button banglanews,ePaperNews,bussiness,jobnews;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_newspapertype);

      banglanews= (Button) findViewById(R.id.banglaNewspaper);
        ePaperNews= (Button) findViewById(R.id.ePaper);
        bussiness= (Button) findViewById(R.id.business);
        jobnews= (Button) findViewById(R.id.jobNewspaper);

        banglanews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(banglaNewspapertype.this,banglaNews.class);
                startActivity(bangla);

            }
        });

        ePaperNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent epaper=new Intent(banglaNewspapertype.this,ePaper.class);
                startActivity(epaper);

            }
        });

       bussiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bussiness=new Intent(banglaNewspapertype.this,Bussiness.class);
                startActivity(bussiness);

            }
        });

        jobnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent jobnews=new Intent(banglaNewspapertype.this,JobNews.class);
                startActivity(jobnews);

            }
        });





    }
}
