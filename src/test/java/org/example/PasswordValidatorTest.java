package org.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegaalArgumentException 예외를 발생시킨다.
 * 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {
    //generate 단축키 : Alt + Insert
    //테스트 메소드에 대한 의도를 작성 : DisplayName
    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        //assertThatCode가 발생하면 () ->PasswordValidator.validate("samplecode")을 실행할거고, 예외가 발생하지 않은 상황을 확인하고 싶다
        assertThatCode(() ->PasswordValidator.validate("samplecode"))
                .doesNotThrowAnyException();//어떤 Exception도 발생하지 않음
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentExcepetion 예외가 발생한다.")
    @ParameterizedTest//valueSource등 여러가지 테스트용 파라미터를 통해 테스트를 도와주는 어노테이션
    @ValueSource(strings = {"aabbcce", "aabbccddeeffg"})//최대 7자, 13자에 대한 예외 발생여부를 확인한다
    void validatePasswordTest2(String password) {

        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
