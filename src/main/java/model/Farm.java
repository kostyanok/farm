package model;

import java.awt.Rectangle;

public class Farm {

    private Rectangle farmArea;
    private Rectangle sheepsArea;

    public Rectangle createDefaultFarm() {
        farmArea = new Rectangle(0, 0, 0, 0);
        farmArea.add(0, 80);
        farmArea.add(80, 80);
        farmArea.add(80, 0);
        return farmArea;
    }

    public Rectangle createDefaultSheepsArea(){
        sheepsArea = new Rectangle(20, 20, 0, 0);
        sheepsArea.add(20, 40);
        sheepsArea.add(40, 40);
        sheepsArea.add(40, 20);
        return sheepsArea;
    }
}
