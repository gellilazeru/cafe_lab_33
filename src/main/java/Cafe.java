import java.util.ArrayList;

public class Cafe {

    private String name;
    private ArrayList<CafeItems> cafeItems;
    private double till;

    public Cafe(String name,ArrayList<CafeItems> cafeItems, double till ){
        this.name = name;
        this.cafeItems = cafeItems;
        this.till = till;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<CafeItems> getCafeItems(){
        return this.cafeItems;
    }

    public void setCafeItems(ArrayList<CafeItems> cafeItems){
        this.cafeItems = cafeItems;
    }

    public double getTill(){
        return this.till;
    }

    public void setTill(double till){
        this.till = till;
    }


}
