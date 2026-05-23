package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

public class App{
private static final Logger logger=LoggerFactory.getLogger(App.class);
public static void main(String args[]){
String name="CI/CD pipeline";
if(StringUtils.isNotBlank(name)){
String message=greet(name);
logger.info(message);
System.out.println(message);
}else{
logger.error("message Not Found");
}
}
public static String greet(String name){
return "hello"+name+"!welcome to maven ci/cd pipeline";
}
}

