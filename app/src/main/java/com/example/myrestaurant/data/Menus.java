package com.example.myrestaurant.data;

public class Menus {
    private int id;
    private String name;
    private int image;
    private int menusQty;

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public void setItemsList(String item, int position) {
        items[position] = item;
    }

    public void setStringArray(int item) {
        items = new String[item];
    }

    private String[] items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getMenusQty() {
        return menusQty;
    }

    public void setMenusQty(int i) {
        this.menusQty = i;
    }
}

