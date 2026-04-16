package com.example;
import java.util.*;

public class App {
    private Map<String, List<String>> studentCourses = new HashMap<>();

    public void registerCourse(String studentId, String courseName) {
        studentCourses.computeIfAbsent(studentId, k -> new ArrayList<>()).add(courseName);
    }

    public List<String> getRegisteredCourses(String studentId) {
        return studentCourses.getOrDefault(studentId, Collections.emptyList());
    }

    public boolean isRegistered(String studentId, String courseName) {
        return getRegisteredCourses(studentId).contains(courseName);
    }

    public static void main(String[] args) {
        App app = new App();
        app.registerCourse("S101", "Java Programming");
        app.registerCourse("S101", "Cloud Computing");
        
        System.out.println("Registration Details for S101:");
        app.getRegisteredCourses("S101").forEach(System.out::println);
    }
}
