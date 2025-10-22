package io.github.chubbyhippo.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MyConfigTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    @DisplayName("test init configuration")
    void testInitConfiguration() {
        assertThat(applicationContext.getBean(MyConfig.class)).isNotNull();
    }
}