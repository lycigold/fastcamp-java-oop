package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @DisplayName("Java sort showing sorted List")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList() {
        // Given
        BubbleSort<Integer> javaSort = new BubbleSort<>();

        //When
        List<Integer> actual = javaSort.sort(List.of(3,2,4,5,1));

        //Then
        assertEquals(List.of(1,2,3,4,5), actual);
    }
}