public class Brownie extends CafeItems {

    private String name;
    private int size;

    public Brownie(String name, int size, double sellingPrice){
        super(sellingPrice);
        this.name = name;
        this.size = size;
    }

//    GETTERS AND SETTERS

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

//    end getters and setters

    public String addChocFilling(String chocolate){
        return "Please add " + chocolate + " chocolate filling.";
    }

}
