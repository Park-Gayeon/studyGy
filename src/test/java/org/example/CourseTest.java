package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

public class CourseTest {
    @Test
    @DisplayName("과목(코스)을 생성한다.")
    void createTest() {
        assertThatCode(() -> new Course("OOP", 3, "A+"))
                .doesNotThrowAnyException();//assertThatCode()가 발생하면 어떤 예외처리도 하지 않는다.
    }
}
