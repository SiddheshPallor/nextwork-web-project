package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {
    @Test
    void greet_returnsExpectedMessage() {
        GreetingService svc = new GreetingService();
        assertEquals("Hello, NextWork!", svc.greet("NextWork"));
    }
}
