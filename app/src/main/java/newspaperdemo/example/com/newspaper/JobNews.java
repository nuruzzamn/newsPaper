package newspaperdemo.example.com.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class JobNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_news);

        Button buttonBdJobs= (Button) findViewById(R.id.buttonBdJobs);
        buttonBdJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(JobNews.this,BdJobs.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button buttonChakri= (Button) findViewById(R.id.buttonChakri);
        buttonChakri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(JobNews.this,Chakri.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        Button buttonJobCircular= (Button) findViewById(R.id.buttonJobCircular);
        buttonJobCircular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(JobNews.this,JobCircular.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

        Button buttonBdJobToday= (Button) findViewById(R.id.buttonBdJobToday);
        buttonBdJobToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(JobNews.this,BdJobToday.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

        Button buttonTotalJobBd= (Button) findViewById(R.id.buttonTotalJobBd);
        buttonTotalJobBd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(JobNews.this,TotalJobBd.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

        Button buttonJobsExamsResult= (Button) findViewById(R.id.buttonJobsExamsResult);
        buttonJobsExamsResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(JobNews.this,JobsExamsResult.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

        Button buttonLekhaPoraBd= (Button) findViewById(R.id.buttonLekhaPoraBd);
        buttonLekhaPoraBd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bangla=new Intent(JobNews.this,LekhaPoraBd.class);
                startActivity(bangla);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

    }
}
