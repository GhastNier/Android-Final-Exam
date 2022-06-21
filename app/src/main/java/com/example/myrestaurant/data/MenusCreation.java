package com.example.myrestaurant.data;

import com.example.myrestaurant.R;

import java.util.ArrayList;

public class MenusCreation {
    private static ArrayList<Menus> allMenus = setMenus();

    private static ArrayList<Menus> setMenus() {
        ArrayList<Menus> menusArrayList = new ArrayList<>();

        Menus menu1 = new Menus();
        menu1.setImage(R.drawable.antepasto);
        menu1.setId(1);
        menu1.setName("Anti Pasto");
        menu1.setStringArray(4);
        menu1.setItemsList("Bruschetta",0);
        menu1.setItemsList("Melon and Prosciutto",1);
        menu1.setItemsList("Mozzarina di Bufala",2);
        menu1.setItemsList("Marinated Cheese and Olives",3);
        menusArrayList.add(menu1);

        Menus menu2 = new Menus();
        menu2.setImage(R.drawable.steak);
        menu2.setId(2);
        menu2.setStringArray(3);
        menu2.setName("Steak");
        menu2.setItemsList("Bistecca alla Fiorentina",0);
        menu2.setItemsList("Tagliata",1);
        menu2.setItemsList("Palermo Style",2);
        menusArrayList.add(menu2);

        Menus menu3 = new Menus();
        menu3.setImage(R.drawable.pasta);
        menu3.setId(3);
        menu3.setStringArray(3);
        menu3.setName("Fresh Pasta");
        menu3.setItemsList("Trofie",0);
        menu3.setItemsList("Chitarra",1);
        menu3.setItemsList("Raviolo al'Uovo",2);
        menusArrayList.add(menu3);

        Menus menu4 = new Menus();
        menu4.setImage(R.drawable.pizza);
        menu4.setId(4);
        menu4.setName("Pizza");
        menu4.setStringArray(6);
        menu4.setItemsList("Napoletana",0);
        menu4.setItemsList("Alla Pala",1);
        menu4.setItemsList("Al Taglio",2);
        menu4.setItemsList("Fritta",3);
        menu4.setItemsList("Al Padellino",4);
        menu4.setItemsList("Siciliana",5);
        menusArrayList.add(menu4);

        Menus menu5 = new Menus();
        menu5.setImage(R.drawable.tiramisu);
        menu5.setId(5);
        menu5.setName("Tiramisu");
        menu5.setStringArray(4);
        menu5.setItemsList("Classic Tiramisu",0);
        menu5.setItemsList("Deconstructed Tiramisu",1);
        menu5.setItemsList("Cheese Cake Tiramisu",2);
        menu5.setItemsList("Tiramisu Gelato",3);
        menusArrayList.add(menu5);
        return menusArrayList;
    }

    public static ArrayList<Menus> getMenus() {
        return allMenus;
    }
}