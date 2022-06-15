package com.example.helloworld.composition;

public class Hello {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "7200U", 7, 8, 16,
                "32MB", "3.2GHZ", "3.2GHZ", "4.5GHZ");
        GraphicsCard graphicsCard = new GraphicsCard("Nvidia", 3080, "10GB");

        Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "1TB", graphicsCard, null, "Razer");

        System.out.println(gamingLaptop);
        System.out.println(gamingLaptop.gamingMode());
        System.out.println(gamingLaptop.getProcessor().getFrequency());
    }
}
