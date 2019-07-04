package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands (String color){
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("1");
            brands.add("2");
        }else{
            brands.add("else3");
            brands.add("else4");
        }
        return brands;
    }
}
