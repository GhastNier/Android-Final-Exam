package com.example.myrestaurant.CartLists;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

import com.example.myrestaurant.CartLists.TabContent.TabItems;
import com.example.myrestaurant.GetterAndSetter;
import com.example.myrestaurant.databinding.ItemTabBinding;

import java.util.List;

public class ItemTabsRecycler extends androidx.recyclerview.widget.RecyclerView.Adapter<ItemTabsRecycler.ViewHolder> {

    private final List<TabItems> mValues;

    public ItemTabsRecycler(List<TabItems> items) {

        mValues = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(ItemTabBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mItemName.setText(mValues.get(position).name);
        GetterAndSetter.setPosition(holder.getBindingAdapterPosition());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public final TextView mItemName;
        public final CardView mCard;
        public ItemTabBinding mBinding;
        public TabItems mItem;

        public ViewHolder(ItemTabBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
            mCard = binding.itemCard;
            mItemName = binding.itemListName;
        }

        @NonNull
        @Override
        public String toString() {
            return super.toString() + " '" + mItemName.getText() + "'";
        }
    }

}