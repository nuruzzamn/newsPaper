package newspaperdemo.example.com.newspaper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ForLiveCricket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_live_cricket);

        Button buttonForLiveScore= (Button) findViewById(R.id.buttonForLiveScore);
        Button buttonTv= (Button) findViewById(R.id.buttonTv);
        Button buttonFm= (Button) findViewById(R.id.buttonFm);


        buttonForLiveScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent button=new Intent(ForLiveCricket.this,ForLiveScore.class);
                startActivity(button);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

        buttonTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent button=new Intent(ForLiveCricket.this,ForTv.class);
                startActivity(button);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });


        buttonFm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent button=new Intent(ForLiveCricket.this,ForFm.class);
                startActivity(button);
                Toast.makeText(getApplicationContext(),"Make sure you have Wi-Fi or data connection", Toast.LENGTH_LONG).show();
            }
        });

    }
}
