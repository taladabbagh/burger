package com.example.burger.model;

import java.util.List;

public interface IItemsData {

    List<String> getCategories();

    List<FoodItem> getItemsByCat(String cat);


}
