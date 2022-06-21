package com.example.myrestaurant;

import static com.example.myrestaurant.List.MenuList.getmRecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.myrestaurant.List.MenusRecyclerView;
import com.example.myrestaurant.List.TopViewPager;
import com.example.myrestaurant.data.Menus;
import com.example.myrestaurant.data.MenusCreation;
import com.example.myrestaurant.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
    @SuppressLint("NotifyDataSetChanged")
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<Menus> mResources = new ArrayList<>(MenusCreation.getMenus());
        Menus menus = new Menus();
        menus.setMenusQty(mResources.size());
        Log.println(Log.INFO, "Resources", mResources.toString());
        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.pager);
        TopViewPager viewPager = new TopViewPager(this.getContext(), mResources);
        mViewPager.setAdapter(viewPager);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                MenusRecyclerView ml;
                switch (position) {
                    case 0:
                        ml = new MenusRecyclerView(mResources.get(0).getItems());
                        getmRecyclerView().setAdapter(ml);
                        getmRecyclerView().getAdapter().notifyDataSetChanged();
                        break;
                    case 1:
                        ml = new MenusRecyclerView(mResources.get(1).getItems());
                        getmRecyclerView().setAdapter(ml);
                        getmRecyclerView().getAdapter().notifyDataSetChanged();
                        break;
                    case 2:
                        ml = new MenusRecyclerView(mResources.get(2).getItems());
                        getmRecyclerView().setAdapter(ml);
                        getmRecyclerView().getAdapter().notifyDataSetChanged();
                        break;
                    case 3:
                        ml = new MenusRecyclerView(mResources.get(3).getItems());
                        getmRecyclerView().setAdapter(ml);
                        getmRecyclerView().getAdapter().notifyDataSetChanged();
                        break;
                    case 4:
                        ml = new MenusRecyclerView(mResources.get(4).getItems());
                        getmRecyclerView().setAdapter(ml);
                        getmRecyclerView().getAdapter().notifyDataSetChanged();
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}