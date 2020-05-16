package Collections.ArrayList;

import org.junit.Test;

import java.util.ArrayList;

public class BasicArrayList {

    private ArrayList<String> groceryItem = new ArrayList<>();

    public void printGroceryItem(){

        System.out.println("You have "+groceryItem.size()+" items in your shopping list.");
        for(int i=0; i<groceryItem.size();i++){
            System.out.println((i+1)+". "+groceryItem.get(i));
        }
    }

    public void addGroceryItem(String item){
        if(!item.isEmpty()){
            groceryItem.add(item);
        }
    }

    public void removeGroceryItem(String item){
        int index = findItem(item);
        if(index>=0){
            removeGroceryItem(index);
        }
    }

    private void removeGroceryItem(int position){
        if(position!=0){
            groceryItem.remove(position-1);
        }
    }

    public void modifyGroceryItem(String item){
        int index = findItem(item);
        if(index>=0){
            modifyGroceryItem(index, item);
        }
    }
    private void modifyGroceryItem(int position, String item){
        groceryItem.set(position-1,item);
        System.out.println("Item in "+position+" has been modified to "+item);
    }

    //Initial Implementation
    @Deprecated
    /*private String findItem(String searchItem){
        int position = groceryItem.indexOf(searchItem);
        if(position>=0){
            return groceryItem.get(position);
        }
        return null;
    }*/

    public int findItem(String searchItem){
        return groceryItem.indexOf(searchItem);
    }


    @Test
    public void addItemTest(){
        addGroceryItem("Sabena");
        addGroceryItem("Dial");
        addGroceryItem("Eggs");
        addGroceryItem("Milk");
        addGroceryItem("Bread");
        addGroceryItem("Sabudhana");
        addGroceryItem("God is (NOT) dead movie");
        addGroceryItem("Crackers");
        printGroceryItem();
    }

    @Test
    public void modifyItemTest(){
        addItemTest();
        modifyGroceryItem(1, "Kumudham");
        printGroceryItem();
    }

    @Test
    public void deleteItemTest(){
        addItemTest();
        removeGroceryItem(1);
        printGroceryItem();
    }

    @Test
    public void searchItem(){
        addItemTest();
        System.out.println(findItem("Milk"));
    }

    @Test
    public void newSearchItemTest(){
        addItemTest();
        System.out.println(findItem("God is (NOT) dead movie"));
    }
}
