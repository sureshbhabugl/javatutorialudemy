package oops.composition;
public class Room {

    private String name;
    private int numberOfDoors;
    private int numberOfWindows;
    private boolean hasCloset;

    public Room(String name, int numberOfDoors, int numberOfWindows, boolean hasCloset){
        this.name = (name.isEmpty()) ? "Master Bed Room" : name;
        this.numberOfDoors = (numberOfDoors<=0) ? 1: numberOfDoors;
        this.numberOfWindows = (numberOfWindows<=0) ? 1 : numberOfWindows;
        this.hasCloset = hasCloset;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }


    public boolean isHasCloset() {
        return hasCloset;
    }

    public void getRoomSpec(){
        System.out.println("This is a "+ name + " room");
        System.out.println("It has "+ numberOfDoors + " doors in it.");
        System.out.println("And it has "+ numberOfWindows + " windows in it.");
        if(isHasCloset()) {
            System.out.println("And wait.. we have more...");
            System.out.println("It has its own closet too. Isn't that amazing?");
        }else{
            System.out.println("The only bummer is that this room doesn't have it's own closet.");
        }
    }
}
