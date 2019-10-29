package newspaperdemo.example.com.newspaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class JobsExamsResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_exams_result);


        WebView myWebView = (WebView) findViewById(R.id.webJobsExamsResult);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setSupportZoom(true);
        myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.getSettings().setDisplayZoomControls(true);
        myWebView.loadUrl("http://www.jobsexamresult.com/bd-job-circular-today/");
    }
}
