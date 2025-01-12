package com.samsung.base;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoTest3 {

    @Test
    @DisplayName("Spy한 객체를 테스트한다. ( @Spy 사용 )")
    public void useMockAnnotation() {
        List<String> spyList = Mockito.spy(List.class);

        //given
        when(spyList.add("one")).thenReturn(false);
        when(spyList.add("two")).thenReturn(false);

        //when
        final boolean stubResult = spyList.add("one");
        final boolean originalResult = spyList.add("two");

        //then
        //메서드 호출을 검증한다.
        verify(spyList).add("one");
        verify(spyList).add("two");

        Assertions.assertThat(stubResult).isFalse();
        Assertions.assertThat(originalResult).isTrue();
    }

    @Test
    @DisplayName("using Mock Method 호출 OK_Result 반영No인 경우")
    public void useMock_SAMPLE_TEST(){
        List<Integer> mockList = Mockito.mock(ArrayList.class);

        mockList.add(100);
        assertEquals(mockList.size(),0); //PASS

//        doReturn(5).when(mockList).size(); //Stubbing
        when(mockList.size()).thenReturn(5);
        assertEquals(mockList.size(),5); //PASS

        mockList.add(200);
        assertEquals(mockList.size(),5); //PASS

        verify(mockList,times(2)).add(anyInt());//PASS
    }

    @Test
    @DisplayName("using Spy Method 호출 OK_Result 반영 Ok인 경우")
    public void useSpy_SAMPLE_TEST(){
        List<Integer> mockList = Mockito.spy(ArrayList.class);

        mockList.add(100);
        assertEquals(mockList.size(),1); //PASS

//        doReturn(5).when(mockList).size(); //Stubbing
        when(mockList.size()).thenReturn(5);
        assertEquals(mockList.size(),5); //PASS

        mockList.add(200);
        assertEquals(mockList.size(),5); //PASS

        verify(mockList,times(2)).add(anyInt());
    }
}
