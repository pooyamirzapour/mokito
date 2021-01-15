package com.example.Mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ListMockitoTests {


    @Test
    public void listTest() {
       List listMock = mock(List.class);
       when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10,listMock.size());
        assertEquals(20,listMock.size());
    }

    @Test
    public void getTest() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Index 0");
        assertEquals("Index 0",listMock.get(0));
        assertEquals(null,listMock.get(1));

    }

    @Test
    public void getGenericTest() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Index");
        assertEquals("Index",listMock.get(0));
        assertEquals("Index",listMock.get(1));
        assertEquals("Index",listMock.get(2));
        assertEquals("Index",listMock.get(3));


    }


}
