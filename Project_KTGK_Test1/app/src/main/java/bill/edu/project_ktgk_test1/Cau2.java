package bill.edu.project_ktgk_test1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Cau2 extends AppCompatActivity {
    ListView list;
    ImageButton Home;
    ArrayList<String> ds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Home = findViewById(R.id.btnHome);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(Cau2.this, MainActivity.class);
                startActivity(intentHome);
            }
        });

        list = findViewById(R.id.list);
        ds = new ArrayList<String>();
        ds.add("Bùi Lê Đăng Khoa");
        ds.add("Trần Thị Kim Lên");
        ds.add("Nguyễn Hữu Hoài");
        ds.add("Bùi Thanh Pháp");
        ds.add("Dương Ngọc Lệnh");
        ds.add("Nguyễn Khánh Như");
        ds.add("Trần Võ Đăng Nguyên");

        ArrayAdapter<String> adapterDs;
        adapterDs = new ArrayAdapter<String>(Cau2.this, android.R.layout.simple_list_item_1, ds);
        list.setAdapter(adapterDs);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String danhsach = ds.get(position);

                Toast.makeText(Cau2.this,danhsach,Toast.LENGTH_SHORT).show();
            }
        });
    }
}