package com.minhthien.tmt.tabmenu;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPage;
    private TabLayout tabLayout;
    private MainMenuAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPage = (ViewPager) findViewById(R.id.main_tabs_viewpage);
        adapter = new MainMenuAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPage.setAdapter(adapter);

        tabLayout = (TabLayout) findViewById(R.id.myTablayout);
        tabLayout.setupWithViewPager(viewPage);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_share);
    }
}
