package com.example.lab02_ngotruonvu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cau1(View view){
        Toast.makeText(getApplicationContext(), "Câu 1", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, GiaiPTBAC2.class);
        startActivity(intent);
    }
    public void cau7(View view){
        Toast.makeText(getApplicationContext(), "Câu 7", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,Connetmenu.class);
        startActivity(intent);
    }
    public void cau6(View view){
        Toast.makeText(getApplicationContext(), "Câu 6", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,TabSelectorActivity.class);
        startActivity(intent);
    }
}
