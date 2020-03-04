package com.company;

public class Computer {

    private String serialNumber;
    private Processor processor;
    private Cooler cooler;


    public Computer(String serialNumber, ProcessorFactory factory) {
        this.serialNumber = serialNumber;
        processor = factory.createProcessor();
        cooler = factory.createCooler();
        process();
    }


    private void process() {
        System.out.println("Assembling computer with serial number : " + serialNumber);
        processor.process();
        cooler.process();
        System.out.println("Assembly is completed ! Computer with serial number : " + serialNumber + " is ready to use.");
    }
}
