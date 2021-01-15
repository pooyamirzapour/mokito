package com.example.Mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoApplicationTests {

//    @Autowired
//    private BusinessServiceImpl businessService;

    @Test
    public void findGreatestTest() {
        DataService dataService=mock(DataService.class);
        when(dataService.getAllData()).thenReturn(new int[]{2,4,6}).thenReturn(new int[]{2,4,8});
        BusinessServiceImpl businessService= new BusinessServiceImpl(dataService);
        int result = businessService.findGreatest();
        assertEquals(6, result);
         result = businessService.findGreatest();
        assertEquals(8, result);
    }



}
