package com.example.lab02_ngotruonvu;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import android.widget.TextView;

public class Connetmenu extends AppCompatActivity {

    Button btn1, btn2;
    TextView selectedTextView; // Để theo dõi TextView đang được chọn

    private static final int MENU_BOLD = 1;
    private static final int MENU_ITALIC = 2;
    private static final int MENU_UNDERLINE = 3;
    private static final int BTN_1 = 4;
    private static final int BTN_2 = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connetmenu);

        btn1 = findViewById(R.id.btnctmnui);
        btn2 = findViewById(R.id.btnctmnu2);

        registerForContextMenu(btn1);
        registerForContextMenu(btn2);

        // Thiết lập sự kiện click cho nút 1 và nút 2 bằng lambda
        btn1.setOnClickListener(v -> {
            selectedTextView = btn1;
            openContextMenu(btn1);
        });

        btn2.setOnClickListener(v -> {
            selectedTextView = btn2;
            openContextMenu(btn2);
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v.getId() == R.id.btnctmnui || v.getId() == R.id.btnctmnu2) {
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.contextmenul, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Typeface type = Typeface.createFromAsset(getAssets(), "arial.ttf");

        switch (item.getItemId()) {
            case MENU_BOLD:
                selectedTextView.setTypeface(type, Typeface.BOLD);
                break;
            case MENU_ITALIC:
                selectedTextView.setTypeface(type, Typeface.ITALIC);
                break;
            case MENU_UNDERLINE:
                selectedTextView.setPaintFlags(selectedTextView.getPaintFlags() | android.graphics.Paint.UNDERLINE_TEXT_FLAG);
                break;
            case BTN_1:
                btn1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_dark));
                break;
            case BTN_2:
                btn2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_dark));
                break;
        }
        return true;
    }
}
