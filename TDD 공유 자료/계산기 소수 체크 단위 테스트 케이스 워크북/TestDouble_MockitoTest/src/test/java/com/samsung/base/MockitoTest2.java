package com.samsung.base;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoTest2 {

   List<String> mockedList = mock(List.class);


    @DisplayName("목 객체를 스터빙하여 테스트한다. ( @Mock 사용 )")
    @Test
    public void useMockAnnotation() {
        //given
        when(mockedList.add("one")).thenReturn(false);

        //when
        final boolean result = mockedList.add("one");

        //then
        verify(mockedList).add("one");
        Assertions.assertThat(result).isFalse();
    }
}
