package com.samsung.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import java.util.List;

import static org.mockito.Mockito.*;

public class MockitoTest1 {

    @DisplayName("stubbing한 객체의 메서드 호출 횟수를 검증")
    @Test
    void stubbing_object_method_call_count_validate() {
        // given
        List<String> mockedList = mock(List.class);

        // when
        mockedList.add("a");
        mockedList.add("a");

        // then
        verify(mockedList, times(2)).add("a");
    }

    @DisplayName("stubbing한 객체의 메서드를 한 번도 호출하지 않았는지 검증")
    @Test
    void stubbing_object_method_never_call() {
        // given
        List<String> mockedList = mock(List.class);

        // when
        mockedList.add("a");
        mockedList.add("b");

        // then
        verify(mockedList, never()).get(1);
    }

    @DisplayName("stubbing한 객체의 메서드가 최소 한 번은 호출되었는지 검증")
    @Test
    void stubbing_object_method_call_count_at_least_once() {
        // given
        List<String> mockedList = mock(List.class);

        // when
        mockedList.add("a");
        mockedList.add("b");

        // then
        verify(mockedList, atLeastOnce()).add("a");
    }

    @DisplayName("stubbing한 객체의 메서드가 최소 n은 호출되었는지 검증")
    @Test
    void stubbing_object_method_call_at_least_n() {
        // given
        List<String> mockedList = mock(List.class);

        // when
        mockedList.add("a");
        mockedList.add("a");
        mockedList.add("a");

        // then
        verify(mockedList, atLeast(3)).add("a");
    }

    @DisplayName("stubbing한 객체의 메서드가 최대 1번 호출되었는지 검증")
    @Test
    void stubbing_object_method_call_at_most_once() {
        // given
        List<String> mockedList = mock(List.class);

        // when, then
        mockedList.add("a");
        verify(mockedList, atMostOnce()).add("a");
    }

    @DisplayName("stubbing한 객체의 메서드가 최대 n번 호출되었는지 검증")
    @Test
    void stubbing_object_method_call_at_most_n() {
        // given
        List<String> mockedList = mock(List.class);

        // when, then
        mockedList.add("a");
        mockedList.add("a");
        mockedList.add("a");
        verify(mockedList, atMost(3)).add("a");
    }

    @DisplayName("inOrder로 stubbing한 객체의 메서드 호출 순서 검증")
    @Test
    void stubbing_object_method_calls_sequence() {
        // given
        List<String> mockedList = mock(List.class);
        InOrder inOrder = inOrder(mockedList);

        // when, then
        mockedList.add("a");
        mockedList.add("b");
        mockedList.add("c");

        inOrder.verify(mockedList).add("a");
        inOrder.verify(mockedList).add("b");
        inOrder.verify(mockedList).add("c");
    }

    @DisplayName("inOrder로 stubbing한 객체의 메서드 호출 횟수 검증")
    @Test
    void stubbing_object_method_calls_n() {
        // given
        List<String> mockedList = mock(List.class);
        InOrder inOrder = inOrder(mockedList);

        // when, then
        mockedList.add("a");
        mockedList.add("b");
        mockedList.add("c");

        inOrder.verify(mockedList, calls(1)).add("a");
        inOrder.verify(mockedList, calls(1)).add("b");
        inOrder.verify(mockedList, calls(1)).add("c");
    }

    @DisplayName("해당 검증 메소드만 실행됐는지 검증")
    @Test
    void stubbing_object_method_call_only() {
        // given
        List<String> mockedList = mock(List.class);

        // when, then
        mockedList.add("a");
      //   mockedList.add("a"); //다른 메서드가 있다면 fail
      //     mockedList.add("b");
      //     mockedList.add("c");

        verify(mockedList, only()).add("a");
    }

    @DisplayName("해당 검증 메서드 실행시간 검증")
    @Test
    void stubbing_object_method_call_time_out() {
        // given
        List<String> mockedList = mock(List.class);

        // when, then
        mockedList.add("a");

        verify(mockedList, timeout(1)).add("a");
    }

}
