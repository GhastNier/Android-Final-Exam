package com.example.myrestaurant.menus;

import static com.example.myrestaurant.GetterAndSetter.setItem;
import static com.example.myrestaurant.GetterAndSetter.setSubItem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myrestaurant.databinding.AntiPastoBinding;

public class AntiPasto extends Fragment {

    private AntiPastoBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = AntiPastoBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setItem("anti");
            binding.firstItemAnti.setOnClickListener(view0 -> {
            setSubItem(10);
        //todo    navigateTo(R.id.action_SecondFragment_to_itemDescription);
        });
        binding.secondItemAnti.setOnClickListener(view1 -> {
            setSubItem(11);
//todo            navigateTo(R.id.action_SecondFragment_to_itemDescription);
        });
        binding.thirdItemAnti.setOnClickListener(view2 -> {
            setSubItem(12);
//todo            navigateTo(R.id.action_SecondFragment_to_itemDescription);

        });
        binding.fourthItemAnti.setOnClickListener(view3 -> {
            setSubItem(13);
//todo            navigateTo(R.id.action_SecondFragment_to_itemDescription);
        });
    }
    private void navigateTo(int frag) {
        NavHostFragment.findNavController(this)
                .navigate(frag);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}