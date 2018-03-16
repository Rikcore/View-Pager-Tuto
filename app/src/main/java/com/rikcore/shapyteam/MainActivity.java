package com.rikcore.shapyteam;

import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Page.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Shaper Morgan = new Shaper("Morgan", "Charton", "Cofounder", "morgan@shapy.co");
        Shaper Olivier = new Shaper("Olivier", "Bellucci", "Cofounder", "olivier@shapy.co");
        Shaper Paul = new Shaper("Paul", "Bellucci", "Cofounder", "paul@qhapy.co");
        Shaper Camille = new Shaper("Camille", "Lecacheur", "UX/UI Designer", "camille@shapy.co");
        Shaper Cyprien = new Shaper("Cyprien", "Chamayou", "Android/iOS developer", "cyprien@shapy.co");
        Shaper Jules = new Shaper("Jules", "Gasc", "Business developer", "jules@shapy.co");
        Shaper Johan = new Shaper("Johan", "Maupetit", "Web/Backend developer", "johan@shapy.co");
        ArrayList<Shaper> shapersList = new ArrayList<>();
        shapersList.add(Morgan);
        shapersList.add(Olivier);
        shapersList.add(Paul);
        shapersList.add(Camille);
        shapersList.add(Cyprien);
        shapersList.add(Jules);
        shapersList.add(Johan);

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setOffscreenPageLimit(1);
        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager(), shapersList );
        viewPager.setAdapter(swipeAdapter);
        viewPager.setCurrentItem(0);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
