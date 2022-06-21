package com.example.myrestaurant.CartLists;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrestaurant.CartLists.TabContent.TabItems;
import com.example.myrestaurant.databinding.CartTabBinding;

import java.util.List;

public class CartTabRecycler extends RecyclerView.Adapter<CartTabRecycler.ViewHolder> {

    private final List<TabItems> mValues;

    public CartTabRecycler(List<TabItems> items) {
        mValues = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(CartTabBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mItemName.setText(mValues.get(position).name);
        holder.mItemQty.setText(mValues.get(position).qty);
        holder.mItemPrice.setText(mValues.get(position).price);
        holder.mItemTotal.setText(mValues.get(position).total);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mItemName, mItemPrice, mItemQty, mItemTotal;
        public TabItems mItem;
        public CartTabBinding mBinding;
        public final CardView mCard;

        public ViewHolder(CartTabBinding binding) {
            super(binding.getRoot());
            mCard = binding.cartCardView;
            mItemName = binding.itemName;
            mItemQty = binding.itemQty;
            mItemPrice = binding.itemPrice;
            mItemTotal = binding.itemTotal;
            mBinding = binding;

        }

        @Override
        public String toString() {
            return super.toString() + " '" + mItemName.getText() + "'";
        }
    }

}

