package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImp();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}