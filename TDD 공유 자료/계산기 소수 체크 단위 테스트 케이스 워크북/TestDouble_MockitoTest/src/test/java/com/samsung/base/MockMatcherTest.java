package com.samsung.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MockMatcherTest {
    @Test
    void argument_matchers() throws Exception{
        List<String> mockedList = mock(ArrayList.class);

        when(mockedList.get(anyInt())).thenReturn("AnyInt");

        assertThat(mockedList.get(1010)).isEqualTo("AnyInt");

        verify(mockedList).get(anyInt()); // verify도 사용가능!
    }

    @Test
    void matcherSupport() throws Exception {
        final List<String> mockedList = mock(List.class);
        mockedList.add("Hong");
        mockedList.add("Gilding");
        mockedList.add("Dong");

        verify(mockedList, times(3))
                .add(   // add() 메서드에 들어간 파라미터 값의 길이가 3초과, 8미만임을 검증함
                        argThat(string -> (string.length() < 8) && (string.length() > 3))
                );
    }
}
