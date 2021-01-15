package com.example.Mockito;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl  implements DataService{

    @Override
    public int[] getAllData() {
        int[] list = new int[]{4,5,6,7,8,9,10};
        return list;
    }
}

