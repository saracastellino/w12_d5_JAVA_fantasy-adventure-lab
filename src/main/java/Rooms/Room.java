package Rooms;

import ItemsAndCreatures.Behaviours.ITreasure;

import java.util.ArrayList;

public class Room {

    public ArrayList<ITreasure> roomTreasures;

    public Room() {
        this.roomTreasures = new ArrayList<ITreasure>();
    }

    public ArrayList<ITreasure> getTreasures() {
        return roomTreasures;
    }

    public void add(ITreasure treasure) {
        this.roomTreasures.add(treasure);
    }

    public ITreasure remove(ITreasure treasure) {
       return this.roomTreasures.remove(0);
    }
}
