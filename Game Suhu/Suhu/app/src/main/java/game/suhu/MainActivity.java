package game.suhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void play (View view) {
        startActivity(new Intent(MainActivity.this,SuhuActivity.class));
    }

    public void rumus (View view) {
        startActivity(new Intent(MainActivity.this, RumusActivity.class));
    }

    public void about (View view) {
        startActivity(new Intent(MainActivity.this,AboutActivity.class));
    }

    public void share (View view) {
        startActivity(new Intent(MainActivity.this,ShareActivity.class));
    }
}
