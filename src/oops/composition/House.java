package oops.composition;

public class House {
    Room room;
    BathRoom bathRoom;
    Furnitures furnitures;

    public House (Room room, BathRoom bathRoom, Furnitures furnitures){
        this.room = room;
        this.bathRoom = bathRoom;
        this.furnitures = furnitures;
    }

    public Room getRoom() {
        return room;
    }

    public BathRoom getBathRoom() {
        return bathRoom;
    }

    public Furnitures getFurnitures() {
        return furnitures;
    }

    public void getRoomSpec(){
        System.out.println("The configuration of the Room, Bathroom and Furniture...");
        System.out.println("Room Details:");
        room.getRoomSpec();
        System.out.println("Bath Room Details:");
        bathRoom.getBathroomSpec();
        System.out.println("Furniture Details:");
        furnitures.getFurnitureSepc();

    }
}
