package com.company;

public class XFactory implements ProcessorFactory {
    @Override
    public Processor createProcessor() {
        return new XProcessor();
    }

    @Override
    public Cooler createCooler() {
        return new XCooler();
    }
}
