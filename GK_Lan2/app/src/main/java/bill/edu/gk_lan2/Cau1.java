package bill.edu.gk_lan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau1 extends AppCompatActivity {
    ImageButton Home;
    Button Tong;
    EditText soA, soB, KQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Home = findViewById(R.id.btnHome);
        soA = findViewById(R.id.edtA);
        soB = findViewById(R.id.edtB);
        KQ = findViewById(R.id.edtKQ);
        Tong = findViewById(R.id.btnTinh);

        Tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLiCong();
            }
        });

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(Cau1.this, MainActivity.class);
                startActivity(intentHome);
            }
        });
    }
    void XuLiCong(){
        float so1  =Float.parseFloat(soA.getText().toString());
        float so2  =Float.parseFloat(soB.getText().toString());
        float Tong = so1 + so2;
        KQ.setText(String.valueOf(Tong));
    }

}