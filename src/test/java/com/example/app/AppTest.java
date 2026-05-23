package com.example.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest{
@Test
public void testGreet(){
String result=App.greet("Student");
assertEquals("helloStudent!welcome to maven ci/cd pipeline",result);
}
}

