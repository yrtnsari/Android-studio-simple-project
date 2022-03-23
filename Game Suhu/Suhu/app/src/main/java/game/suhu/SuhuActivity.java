package game.suhu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SuhuActivity extends AppCompatActivity {
    EditText celcius, kelvin, farenheit, reamur; //Deklarasi variable
    Button btn_konversi; //deklarasi varaibel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);
        celcius = (EditText) findViewById(R.id.txtcelcius);
        kelvin = (EditText) findViewById(R.id.txtkelvin);
        farenheit = (EditText) findViewById(R.id.txtfarenheit);
        reamur = (EditText) findViewById(R.id.txtreamur);
        btn_konversi = (Button) findViewById(R.id.button2);
    }

    public void konversisuhu(View view) {
        if(celcius.getText().length()==0){
            Toast.makeText(this, "Kolom tidak boleh kosong!", Toast.LENGTH_LONG).show();
            return;
        }
        try {
            int ncelcius = Integer.parseInt(celcius.getText().toString());
            double nkelvin = ncelcius + 273.15;
            double nfarenheit = ncelcius * 1.8 + 32;
            double nreamur = ncelcius * 0.8;
            kelvin.setText(String.valueOf(nkelvin));
            farenheit.setText(String.valueOf(nfarenheit));
            reamur.setText(String.valueOf(nreamur));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void keluar(View view) {
        finish();
    }
}
