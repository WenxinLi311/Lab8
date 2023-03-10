package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    @Before
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City city = new City("Jinan", "Shandong");
        list.addCity(city);
        //City city1 = new City("Shenyang","Liaoning");
        //City city2 = new City("Shanghai","Zhejiang");
        //list.add(city1);
        assertTrue(list.hasCity(city));
        //assertFalse(list.hasCity(city2));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        assertEquals(listSize, 0);
        City city = new City("Jinan", "Shandong");
        list.addCity(city);
        assertEquals(list.getCount(), listSize+1);
        list.deleteCity(city);
        assertEquals(list.getCount(), 0);
    }

    @Test
    public void countCitiesTest(){
        list = MockCityList();
        int count = list.countCities();
        assertEquals(count, 0);
        City city = new City("Jinan", "Shandong");
        list.addCity(city);
        assertEquals(list.getCount(), count+1);
    }


}
