package org.example.MethodsAndConstructors;

public class ComputerFactory {
    Computer creat(String procesor, int memory){
        Computer computer = new Computer();
        computer.processor = procesor;
        computer.memory = memory;
        return computer;
    }
}
