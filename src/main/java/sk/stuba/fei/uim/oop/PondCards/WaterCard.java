package sk.stuba.fei.uim.oop.PondCards;

import sk.stuba.fei.uim.oop.GameTable;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class WaterCard extends PondCard {
    private String name = "Water";

    @Override
    public String printPondCard() {
        return this.name;
    }

    @Override
    public void wasShot(GameTable table, int chosenPlace) {
        System.out.println("You hit water");
    }

    @Override
    public void turboDuckAction(GameTable table, int chosenSpot) {
        int newSpot = ZKlavesnice.readInt("Can't use turboduck on water choose again");
        newSpot = super.verifyTurboDuck(newSpot);
        table.getBoard().pondPlaces.get(newSpot - 1).turboDuckAction(table, newSpot);
    }

}
