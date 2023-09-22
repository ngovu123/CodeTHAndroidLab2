package com.example.lab02_ngotruonvu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

public class TabSelectorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_selector);

        TabHost tab = findViewById(android.R.id.tabhost);
        tab.setup();

        // Tạo các tab
        TabHost.TabSpec spec1 = tab.newTabSpec("t1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("1-Login");
        tab.addTab(spec1);

        TabHost.TabSpec spec2 = tab.newTabSpec("t2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("2-Help");
        tab.addTab(spec2);

        tab.setCurrentTab(0);

        tab.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                String message = "Tab tag = " + tabId + "; index = " + tab.getCurrentTab();
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
