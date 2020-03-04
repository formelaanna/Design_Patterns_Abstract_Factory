package com.company;

public class Main {

    public static void main(String[] args) {
	Computer computer;
	computer = new Computer("PC0005", new XFactory());
	computer = new Computer("PC0006", new YFactory());
    }
}
