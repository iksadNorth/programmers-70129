package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(String s, int[] answer) {
        // when
        int[] result = solution.solution(s);

        // then
        Assertions.assertArrayEquals(result, answer);
    }

    @Test @DisplayName("1")
    void testcase1() {
        // given
        String s = "110010101001";
        int[] answer = new int[]{3,8};

        // when & then
        assertAnswer(s, answer);
    }
    @Test @DisplayName("2")
    void testcase2() {
        // given
        String s = "01110";
        int[] answer = new int[]{3,3};

        // when & then
        assertAnswer(s, answer);
    }
    @Test @DisplayName("3")
    void testcase3() {
        // given
        String s = "1111111";
        int[] answer = new int[]{4,1};

        // when & then
        assertAnswer(s, answer);
    }
}