package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class AppTest {
    @Test
    public void testRegistration() {
        App app = new App();
        app.registerCourse("S101", "DevOps");
        assertTrue(app.isRegistered("S101", "DevOps"));
    }

    @Test
    public void testEmptyRegistration() {
        App app = new App();
        List<String> courses = app.getRegisteredCourses("S999");
        assertTrue(courses.isEmpty());
    }
}
