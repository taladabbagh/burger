package com.example.burger.model;

import java.util.ArrayList;
import java.util.List;

public class ItemsData implements IItemsData{

    private List<FoodItem> items;
    public ItemsData(){
        items = new ArrayList<>();
        items.add( new FoodItem("Classic Burger", "Burgers", 40));
        items.add( new FoodItem("Cheese Burger", "Burgers", 45));
        items.add( new FoodItem("Double Burger", "Burgers", 50));
        items.add( new FoodItem("Chicken Burger", "Burgers", 40));
        items.add( new FoodItem("BBQ Burger", "Burgers", 45));
        items.add( new FoodItem("Coffee", "Hot Drinks", 12));
        items.add( new FoodItem("Mojito", "Drinks", 14));
        items.add( new FoodItem("Tea", "Hot Drinks", 8));
        items.add( new FoodItem("Hazelnut", "Hot Drinks", 13));
        items.add( new FoodItem("Ice Coffee", "Drinks", 13));
        items.add( new FoodItem("Diet Coke", "Drinks", 10));

    }
//mockup l2no msh 7aqiqi
    @Override
    public List<String> getCategories() {

        List<String> cats = new ArrayList<>();
        cats.add("Burgers");
        cats.add("Drinks");
        cats.add("Hot Drinks");

        return cats;
    }

    @Override
    public List<FoodItem> getItemsByCat(String cat) {

        List<FoodItem> result = new ArrayList<>();
        for(FoodItem it : items){
            if(it.getCategory().equals(cat)){
                result.add(it);

            }
        }
        return result;
    }
}
