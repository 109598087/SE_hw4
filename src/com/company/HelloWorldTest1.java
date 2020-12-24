package com.company;

import static com.company.HelloWorld.letterGrade;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class HelloWorldTest1 {
    @Test
    public void TestEquivalencePartitioning() {
        char grade = letterGrade(-1);
        assertEquals('X', grade);
        grade = letterGrade(101);
        assertEquals('X', grade);
        grade = letterGrade(0);
        assertEquals('F', grade);
        grade = letterGrade(10);
        assertEquals('F', grade);
        grade = letterGrade(20);
        assertEquals('F', grade);
        grade = letterGrade(30);
        assertEquals('F', grade);
        grade = letterGrade(40);
        assertEquals('F', grade);
        grade = letterGrade(50);
        assertEquals('F', grade);
        grade = letterGrade(60);
        assertEquals('D', grade);
        grade = letterGrade(70);
        assertEquals('C', grade);
        grade = letterGrade(80);
        assertEquals('B', grade);
        grade = letterGrade(90);
        assertEquals('A', grade);
        grade = letterGrade(100);
        assertEquals('A', grade);
    }

}
