package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Intent pindah;
    ImageButton btnKucing,btnAnjing,btnSapi;
    Button btnBiodata;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnKucing = findViewById(R.id.btn_buka_ras_kucing);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnSapi = findViewById(R.id.btn_buka_ras_Sapi);
        btnBiodata = (Button) findViewById(R.id.btn_biodata);
        btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
        btnSapi.setOnClickListener(view -> bukaGaleri("Sapi"));
        btnBiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,BiodataActivity.class);
                startActivity(pindah);
            }
        });

    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }

}