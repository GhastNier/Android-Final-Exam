package com.example.myrestaurant.CartLists;

import static com.example.myrestaurant.MainActivity.items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TabContent {


    public static final List<TabItems> ITEMS = new ArrayList<TabItems>();
    public static final Map<String, TabItems> CART_MAP = new HashMap<String, TabItems>();



    private static void addItem(TabItems item) {
        ITEMS.add(item);
        CART_MAP.put(item.name, item);
    }

    private static TabItems createItem(int i, String s, String s2, String s3, String s4) {
        return new TabItems(i, s, s2, s3, s4);
    }

    public static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Do you wish to remove: \n")
                .append(ITEMS.get(position).qty)
                .append(" × ")
                .append(ITEMS.get(position).name)
                .append("\n \nFor a total of ")
                .append(ITEMS.get(position).total)
                .append("$");
        return builder.toString();
    }

    public static class TabItems {
        public final int id;
        public final String name;
        public final String qty;
        public final String price;
        public final String total;

        public TabItems(int id, String name, String qty, String price, String total) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.total = total;
            this.qty = qty;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void initData() {
        for (String key : items.keySet()) {
            addItem(createItem(Integer.parseInt(items.get(key).get(0)), items.get(key).get(1), items.get(key).get(2), items.get(key).get(3), items.get(key).get(4)));
        }
    }

    public static void resetCartItemMap() {
        ITEMS.clear();
        CART_MAP.clear();
        for (String key : items.keySet()) {
            addItem(createItem(Integer.parseInt(items.get(key).get(0)), items.get(key).get(1), items.get(key).get(2), items.get(key).get(3), items.get(key).get(4)));
        }
    }
}