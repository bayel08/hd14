package com.company;

public class Main {


    public static void main(String[] args) {
Printable[]printables = {createObject("CarNumber"),createObject("CarBody"),createObject("Chair")};

for (Printable print:printables){
    print.print();
}


    }

    public static Car  createObject(String className) {
        switch (className) {
            case "CarNumber":
                CarNumber carNumber = new CarNumber("Мers", 2020, 4.0, "USA",
                        9, 'a', 1);

                return carNumber;
            case "CarBody":
                CarBody carBody = new CarBody("Nissan", 2018, 3.0, BodyMaterial.ULTRA_HIGH_STRENGTH_HOT_FORMING_STEEL);

                return carBody;
            case "Chair":
                Chair chair = new Chair("Lexus", 2019, 2.5, "Skin", 80);

                return chair;

        }
        return null;
    }
}
