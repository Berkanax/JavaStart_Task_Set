package org.example.MethodsAndConstructors;

public class Computer {
    String processor;
    int memory;

    void printInfo (){
        System.out.println(processor + " " + memory);
    }
    String getInfo(){
    //    String description = processor + " " + memory
           return processor + " " + memory;

    }
}
