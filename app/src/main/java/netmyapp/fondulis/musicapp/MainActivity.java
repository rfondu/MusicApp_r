package netmyapp.fondulis.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchRadio(View view) {
        Intent gotoRadio = new Intent(this, RadioActivity.class);
        startActivity(gotoRadio);
    }

    public void launchAlarm(View view) {
        Intent gotoAlarm = new Intent(this, AlarmActivity.class);
        startActivity(gotoAlarm);
    }

    public void launchNews(View view) {
        Intent gotoNews = new Intent(this, NewsActivity.class);
        startActivity(gotoNews);
    }
}
