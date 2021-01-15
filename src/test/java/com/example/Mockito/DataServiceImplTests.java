package com.example.Mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataServiceImplTests {

//    @Autowired
//    private BusinessServiceImpl businessService;

    @Test
    public void findGreatestTest() {
        BusinessServiceImpl businessService = new BusinessServiceImpl(new DataServiceImpl());
        int result = businessService.findGreatest();
        assertEquals(10, result);
    }
} 
