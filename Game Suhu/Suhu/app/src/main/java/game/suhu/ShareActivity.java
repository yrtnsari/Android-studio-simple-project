package game.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void instagram (View v){
        Intent in =new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
        startActivity(in);
    }

    public void twitter (View v){
        Intent in =new Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.twitter.com"));
        startActivity(in);
    }
}
