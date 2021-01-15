package com.example.Mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoAnnotationApplicationTests {


    @Mock
    DataService dataService;

    @InjectMocks
   BusinessServiceImpl businessService;

    @Test
    public void findGreatestTest() {

        when(dataService.getAllData()).thenReturn(new int[]{2,4,6});
        int result = businessService.findGreatest();
        assertEquals(6, result);
    }

    @Test
    public void findGreatestTestForNoValue() {

        when(dataService.getAllData()).thenReturn(new int[]{});
        int result = businessService.findGreatest();
        assertEquals(Integer.MIN_VALUE, result);
    }

}
