package com.spring.react.gori.stylah.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class TextUtilsTest {

    @Test
    void test_toSentenceCase() {
        assertThat(TextUtils.getInstance().getSentenceCase("cetaphil45"), is("Cetaphil45"));
    }
}