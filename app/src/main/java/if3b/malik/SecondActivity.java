package if3b.malik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvNama;
    TextView tvNomorPendaftaran;
    TextView tvJalurPendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().setTitle("LAYOUT B");

        tvNama = findViewById(R.id.tv_nama);
        tvNomorPendaftaran = findViewById(R.id.tv_no_pendaftaran);
        tvJalurPendaftaran = findViewById(R.id.tv_jalur_pendaftaran);

        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        String yNoPendaftaran = terima.getStringExtra("xNoPendaftaran");
        String yJalurPendaftaran = terima.getStringExtra("xJalurPendaftaran");

        tvNama.setText(yNama);
        tvNomorPendaftaran.setText(yNoPendaftaran);
        tvJalurPendaftaran.setText(yJalurPendaftaran);

    }
}