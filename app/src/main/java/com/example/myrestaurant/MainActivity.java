package com.example.myrestaurant;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myrestaurant.databinding.ActivityMainBinding;
import com.google.common.collect.ListMultimap;

public class MainActivity extends AppCompatActivity {
    private NavController navController;
    public NavController navController2;
    public static AppBarConfiguration appBarConfiguration;
    public static ListMultimap<String, String> items;
    private ActivityMainBinding binding;

    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createBinding();

    }

    private void createBinding() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupWithNavController(findViewById(R.id.toolbar), navController, appBarConfiguration);
        /*setItem("");
        binding.antepastoConst.setOnClickListener(view0 -> {
            setItem("anti");
            navigateTo(R.id.action_FirstFragment_to_AntiPasto);
        });
        binding.pizzaConst.setOnClickListener(view1 -> {
            setItem("pizza");
            navigateTo(R.id.action_FirstFragment_to_pizza);
        });
        binding.pastaConst.setOnClickListener(view2 -> {
            setItem("pasta");
            navigateTo(R.id.action_FirstFragment_to_freshPasta);
        });
        binding.tiramisuConst.setOnClickListener(view3 -> {
            setItem("dessert");
            navigateTo(R.id.action_FirstFragment_to_tiramisu);
        });
        binding.steakConst.setOnClickListener(view4 -> {
            setItem("steak");
            navigateTo(R.id.action_FirstFragment_to_steak);
        });
    }
    private void navigateTo(int frag) {
        NavHostFragment.findNavController(FirstFragment.this)
                .navigate(frag);
    }*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*switch (item.getItemId()) {
            case R.id.min_prince:
                //MenuList.orderList(0);
                return true;
            case R.id.max_price:
                //MenuList.orderList(1);
                return true;
            case R.id.rating:
                //MenuList.orderList(2);
                return true;
            case R.id.rating_l:
                //MenuList.orderList(3);
                return true;
            case R.id.small_delivery_fees:
                //MenuList.orderList(4);
                return true;
            case R.id.high_delivery_fees:
                MenuList.orderList(5);
                return true;
            case R.id.vege:
                MenuList.orderList(6);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/
        return false;
    }

    public void onDestroy() {
        super.onDestroy();
    }
}