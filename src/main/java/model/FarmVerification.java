package model;

import java.awt.*;

public class FarmVerification {

    public static Error errorMessage;
    private static Farm farm = new Farm();

    public static boolean isAnimalInTheFarm(Point location) {
        if (farm.createDefaultFarm().contains(location)) {
            return true;
        } else {
            errorMessage = Error.valueOf("OUT_OF_FARM");
            return false;
        }
    }

    public static boolean isDogInTheSheepsArea(Point location) {
        if (farm.createDefaultSheepsArea().contains(location)) {
            errorMessage = Error.valueOf("DOG_IS_IN_SHEEPS_AREA");
            return true;
        } else {
            return false;
        }
    }
}
