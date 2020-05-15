package oops.composition;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

import org.junit.Test;

public class MainRoom {
    // Declairing it globally
    Room room;
    Furnitures furniture;
    BathRoom bathRoom;
    House house;

    @Test
    public void roomTest(){
        room = new Room("Master Bedroom", 2, 2, false);
        room.getRoomSpec();
    }

    @Test
    public void furnitureTest(){
        furniture = new Furnitures(1, "Queen", 2, 1);
        furniture.getFurnitureSepc();
    }

    @Test
    public void bathroomTest(){
        bathRoom = new BathRoom("Master Bathroom", 2, true, false);
        bathRoom.getBathroomSpec();
    }

    @Test
    public void houseTest(){
        room = new Room("Master Bedroom", 2, 2, false);
        furniture = new Furnitures(1, "Queen", 2, 1);
        bathRoom = new BathRoom("Master Bathroom", 2, true, false);

        house = new House(room, bathRoom, furniture);
        house.getRoomSpec();

        room = new Room("Secondary Bedroom", 1, 1, true);
        furniture = new Furnitures(0, "Twin", 0, 1);
        bathRoom = new BathRoom("Attached Bathroom", 1, false, true);

        House house2 = new House(room, bathRoom, furniture);
        house2.getRoomSpec();
    }
}
