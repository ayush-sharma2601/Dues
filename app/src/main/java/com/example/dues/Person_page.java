package com.example.dues;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class Person_page extends FragmentActivity {

    TextView name,lent_amount,borrowed_amount,lent_button,borrowed_button;
    ImageView back_button,person_image;
    FrameLayout frameLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    int num_page = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_page);
        attachID();

        pagerAdapter= new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
//        lent_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                lent_bar.setBackgroundColor(Color.parseColor("#ffe400"));
//                borrowed_bar.setBackgroundColor(Color.parseColor("#990033"));
//                LoadFragment(new Lent_Fragment());
//            }
//        });

//        borrowed_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                borrowed_bar.setBackgroundColor(Color.parseColor("#ffe400"));
//                lent_bar.setBackgroundColor(Color.parseColor("#990033"));
//                LoadFragment(new Borrowed_Fragment());
//            }
//        });

    }
    public class PagerAdapter extends FragmentPagerAdapter {
        public PagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Lent_Fragment();
                case 1:
                    return new Borrowed_Fragment();
                default:
                    return new Lent_Fragment();
            }
        }

        @Override
        public int getCount() {
            return num_page;
        }
    }


    public void attachID()
    {
        name = findViewById(R.id.person_page_name);
        lent_amount = findViewById(R.id.lent_person_amount);
        borrowed_amount = findViewById(R.id.borrowed_person_amount);
        person_image = findViewById(R.id.person_page_person_icon);
        back_button = findViewById(R.id.back_button_person_page);
        frameLayout = findViewById(R.id.frame_layout);
        lent_button = findViewById(R.id.lent);
        borrowed_button = findViewById(R.id.borrowed);
        viewPager = findViewById(R.id.view_pager);
    }

//    public void LoadFragment(Fragment fragment){
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.frame_layout,fragment);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }


}
