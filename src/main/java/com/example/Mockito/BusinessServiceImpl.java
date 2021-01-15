package com.example.Mockito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessServiceImpl {

//    @Autowired
    private DataService dataService;

    public BusinessServiceImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findGreatest() {
        int[] allData = dataService.getAllData();

        int greatest = Integer.MIN_VALUE;
        for (Integer value : allData) {
            if (value > greatest)
                greatest = value;
        }
        return greatest;
    }

} 
