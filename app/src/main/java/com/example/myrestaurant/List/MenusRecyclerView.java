package com.example.myrestaurant.List;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrestaurant.GetterAndSetter;
import com.example.myrestaurant.databinding.MenuTabBinding;

public class MenusRecyclerView extends RecyclerView.Adapter<MenusRecyclerView.ViewHolder> {
    public int getCurrentView() {
        return currentView;
    }

    public static void setCurrentView(int cv) {
        currentView = cv;
    }

    public static int currentView;
    private final String[] mValues;

    public MenusRecyclerView(String[] items) {
        mValues = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(MenuTabBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }
    private String selectedMenu(int i){
        switch (i){
            case 1:
                GetterAndSetter.setItem("first");
                return "first";
            case 2:
                GetterAndSetter.setItem("second");
                return "second";
            case 3:
                GetterAndSetter.setItem("third");
                return "third";
            case 4:
                GetterAndSetter.setItem("four");
                return "four";
            case 5:
                GetterAndSetter.setItem("five");
                return "five";
            default: return "";
        }
    }
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mCard.setClickable(true);
        holder.mCard.setId(position);
        holder.mCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (selectedMenu(getCurrentView())) {
                    case "first":
                        switch (v.getId()) {
                            case 0:
                                GetterAndSetter.setSubItem(10);
                                break;
                            case 1:
                                GetterAndSetter.setSubItem(11);
                                break;
                            case 2:
                                GetterAndSetter.setSubItem(12);
                                break;
                            case 3:
                                GetterAndSetter.setSubItem(13);
                                break;
                            default:
                                break;
                        }
                    case "second":
                        switch (v.getId()) {
                            case 0:
                                GetterAndSetter.setSubItem(20);

                                break;
                            case 1:
                                GetterAndSetter.setSubItem(21);
                                
                                break;
                            case 2:
                                GetterAndSetter.setSubItem(22);

                                break;
                            default:break;
                        }
                    case "third":
                        switch (v.getId()) {
                            case 0:
                                GetterAndSetter.setSubItem(30);

                                break;
                            case 1:
                                GetterAndSetter.setSubItem(31);
                                
                                break;
                            case 2:
                                GetterAndSetter.setSubItem(32);
                                
                                break;
                            default:break;
                        }
                    case "four":
                        switch (v.getId()) {
                            case 0:
                                GetterAndSetter.setSubItem(40);
                                break;
                            case 1:
                                GetterAndSetter.setSubItem(41);
                                break;
                            case 2:
                                GetterAndSetter.setSubItem(42);
                                break;
                            case 3:
                                GetterAndSetter.setSubItem(43);
                                break;
                            case 4:
                                GetterAndSetter.setSubItem(44);
                                break;
                            case 5:
                                GetterAndSetter.setSubItem(45);
                                break;
                            default:break;
                        }
                    case "five":
                        switch (v.getId()) {
                            case 0:
                                GetterAndSetter.setSubItem(50);
                                break;
                            case 1:
                                GetterAndSetter.setSubItem(51);
                                break;
                            case 2:
                                GetterAndSetter.setSubItem(52);
                                break;
                            case 3:
                                GetterAndSetter.setSubItem(53);
                                break;
                            default:break;

                    }
                }
            }
        });
        holder.mItemName.setText(mValues[position]);
    }
    @Override
    public int getItemCount() {
        return mValues.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mItemName;
        public MenuTabBinding mBinding;
        public final CardView mCard;

        public ViewHolder(@NonNull MenuTabBinding binding) {
            super(binding.getRoot());
            mCard = binding.cardMenu;
            mItemName = binding.nameItem;
            mBinding = binding;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mItemName.getText() + "'";
        }
    }
}