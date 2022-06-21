package com.example.myrestaurant.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrestaurant.R;
import com.example.myrestaurant.data.Menus;
import com.example.myrestaurant.data.MenusCreation;

import java.util.ArrayList;
@SuppressLint("NotifyDataSetChanged")
public class MenuList extends Fragment {
    private static final String ARG_COLUMN_COUNT = "column-count";
    private int mColumnCount = 1;

    public static RecyclerView getmRecyclerView() {
        return mRecyclerView;
    }

    private static RecyclerView mRecyclerView;
    private static ArrayList<Menus> list = new ArrayList<>(MenusCreation.getMenus());

    public MenuList() {
    }

    public static MenuList newInstance(int columnCount) {
        MenuList fragment = new MenuList();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);

        }
    }


    @Override
    public void onResume() {
        super.onResume();
        mRecyclerView.getAdapter().notifyDataSetChanged();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menus_list, container, false);
        Context context = view.getContext();
        mRecyclerView = (RecyclerView) view;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        MenuList rl = MenuList.newInstance(1);
        mRecyclerView.setAdapter(new MenusRecyclerView(list.get(0).getItems()));
        mRecyclerView.getAdapter().notifyDataSetChanged();

        return view;
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        mRecyclerView.getAdapter().notifyDataSetChanged();
    }
}