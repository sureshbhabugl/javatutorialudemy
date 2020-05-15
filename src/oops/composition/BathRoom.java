package oops.composition;

public class BathRoom {

    private String name;
    private int  numberOfWashBasin;
    private boolean hasTowelHanger;
    private boolean hasJacuzzi;


    public BathRoom (String name, int numberOfWashBasin, boolean hasTowelHanger, boolean hasJacuzzi){
        this.name = (name.isEmpty())? "NoName" : name;
        this.numberOfWashBasin = (numberOfWashBasin<=0) ? 1 : numberOfWashBasin;
        this.hasJacuzzi = hasJacuzzi;
        this.hasTowelHanger = hasTowelHanger;
    }

    public int getNumberOfWashBasin() {
        return numberOfWashBasin;
    }

    public boolean isHasTowelHanger() {
        return hasTowelHanger;
    }

    public boolean isHasJacuzzi() {
        return hasJacuzzi;
    }



    public void getBathroomSpec(){
        System.out.println("This is the " + name + " .");
        System.out.println("Number of Wash Basins: "+numberOfWashBasin);
        if(hasTowelHanger) {
            System.out.println("It does have a towel hanger");
        }
        if(hasJacuzzi){
            System.out.println("It has a beautiful Jacuzzi");
        }else{
            System.out.println("This bath room is equipped with a standing shower");
        }
    }
}
