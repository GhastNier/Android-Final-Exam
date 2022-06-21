package com.example.myrestaurant.dialog;

import static com.example.myrestaurant.CartLists.TabContent.ITEMS;
import static com.example.myrestaurant.GetterAndSetter.getPosition;
import static com.example.myrestaurant.GetterAndSetter.getTotalValue;
import static com.example.myrestaurant.GetterAndSetter.setTotalValue;

import android.icu.text.DecimalFormat;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myrestaurant.R;
import com.example.myrestaurant.databinding.RemoveItemDialogBinding;

public class RemoveItemDialog extends DialogFragment {
    public RemoveItemDialogBinding binding;
    public static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = RemoveItemDialogBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        StringBuilder title = new StringBuilder();
        StringBuilder text = new StringBuilder();
        StringBuilder price = new StringBuilder();
        title.append(getString(R.string.item_removal_dialog))
                .append(" ")
                .append(ITEMS.get(getPosition()).name);
        price.append(getString(R.string.item_removal_total))
                .append(" ")
                .append(ITEMS.get(getPosition()).total)
                .append(getString(R.string.dollar));
        text.append(getString(R.string.item_removal_text))
                .append("\n")
                .append(ITEMS.get(getPosition()).qty)
                .append(" × ")
                .append(ITEMS.get(getPosition()).name)
                .append("\n")
                .append(getString(R.string.item_removal_costing))
                .append(ITEMS.get(getPosition()).price)
                .append(" ")
                .append(getString(R.string.each));
        binding.itemRemovalTitle.setText(title.toString());
        binding.itemText.setText(text.toString());
        binding.itemCost.setText(price.toString());
        binding.removeItem.setOnClickListener(view0 -> {

        });
        binding.cancelAction.setOnClickListener(view1 -> {
     //       closeDialog();
        });
    }

    public void closeDialog() {
       //todo navigateTo(R.id.action_itemDescription_pop);
    }

    private void navigateTo(int frag) {
        NavHostFragment.findNavController(RemoveItemDialog.this)
                .navigate(frag);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void cartUpdate(double sum) {
        setTotalValue(getTotalValue() + sum);
        TextView text1 = getActivity().findViewById(R.id.cart_amount);
        StringBuilder builder = new StringBuilder();
        builder.append(getString(R.string.cart_val_void))
                .append(" ")
                .append(df.format(getTotalValue()))
                .append(getString(R.string.dollar));
        text1.setText(builder.toString());
    }
}