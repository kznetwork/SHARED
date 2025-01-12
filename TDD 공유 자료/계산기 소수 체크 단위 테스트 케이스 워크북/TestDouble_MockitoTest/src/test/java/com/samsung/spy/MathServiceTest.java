package com.samsung.spy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;

class MathServiceTest {

    @Mock
    private Calculator2 calculatorMock;

    @InjectMocks
    private MathService2 mathServiceWithMock;

    @Spy
    private Calculator calculatorSpy = new Calculator();

    @InjectMocks
    private MathService mathServiceWithSpy;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Mock 객체 초기화
    }

    @Test
    void testAddNumbersUsingMock() {
        // Mock 동작 설정
        when(calculatorMock.add(2, 3)).thenReturn(5);

        // MathService 호출
        int result = mathServiceWithMock.addNumbers(2, 3);

        // 결과 검증
        assertEquals(5, result, "Mock should return the configured value");
        verify(calculatorMock, times(1)).add(2, 3);
    }

    @Test
    void testAddNumbersUsingSpy() {
        // Spy 객체로 MathService 생성
        Calculator calculatorSpy = spy(new Calculator());
        MathService mathServiceWithSpy = new MathService(calculatorSpy);

        // 실제 메서드 호출
        int result = mathServiceWithSpy.addNumbers(2, 3);

        // 결과 검증
        assertEquals(5, result, "Spy should call the real method");
        verify(calculatorSpy, times(1)).add(2, 3);
    }

    @Test
    void testSubtractNumbersUsingSpyWithStubbing() {
        // Spy에서 일부 메서드만 Stubbing
        doReturn(20).when(calculatorSpy).subtract(10, 5);

        int result = mathServiceWithSpy.subtractNumbers(10, 5);

        assertEquals(20, result, "Spy should return the stubbed value");
        verify(calculatorSpy, times(1)).subtract(10, 5);
    }
}
