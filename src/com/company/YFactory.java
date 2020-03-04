package com.company;

public class YFactory implements ProcessorFactory {
    @Override
    public Processor createProcessor() {
        return new YProcessor();
    }

    @Override
    public Cooler createCooler() {
        return new YCooler();
    }
}
