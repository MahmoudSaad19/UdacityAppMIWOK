package com.example.udacityapplicationmiwok;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_main_activity);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryFragmentPagerAdapter adapter = new CategoryFragmentPagerAdapter(this ,getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }




    public void openNumbers_Activity(View view) {
        startActivity(new Intent(this ,NumbersActivity.class));
    }

    public void openFamily_Activity(View view) {
        startActivity(new Intent(this, FamilyActivity.class));
    }

    public void openPhrases_Activity (View view){
        startActivity(new Intent(this, PhrasesActivity.class));
    }

    public void openColors_Activity (View view){
        startActivity(new Intent(this, ColorsActivity.class));
    }

}
