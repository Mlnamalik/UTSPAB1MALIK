  package if3b.malik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

  public class MainActivity extends AppCompatActivity {

    Button btnPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = findViewById(R.id.btn_daftar);




    }

      public void Daftar(View view) {
          Intent intent = new Intent(MainActivity.this, SecondActivity.class);
          startActivity(intent);
      }
  }