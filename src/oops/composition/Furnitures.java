package oops.composition;

public class Furnitures {

    private int numberOfTelevision;
    private String bedSize;
    private int numberOfTables;
    private int numberOfRecliners;

    public Furnitures (int numberOfTelevision, String bedSize, int numberOfTables, int numberOfRecliners){
        this.numberOfTelevision = (numberOfTelevision<0) ? 0 : numberOfTelevision;
        this.bedSize = (bedSize.isEmpty()) ? "": bedSize;
        this.numberOfTables = (numberOfTables<0) ? 0 : numberOfTables;
        this.numberOfRecliners = (numberOfRecliners < 0) ? 0 : numberOfRecliners;
    }

    public int getNumberOfTelevision() {
        return numberOfTelevision;
    }

    public String getBedSize() {
        return bedSize;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public int getNumberOfRecliners() {
        return numberOfRecliners;
    }

    public void getFurnitureSepc(){
        System.out.println("Furniture Specification:");
        System.out.println("Number of Televisions: "+ numberOfTelevision);
        System.out.println("Number of Tables: "+ numberOfTables);
        System.out.println("Number of Recliners: "+ numberOfRecliners);
        if(!bedSize.isEmpty()){
            System.out.println("And it has a bed of size "+ bedSize + " in it.");
        }

    }
}
