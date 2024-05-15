public class Drink extends CafeItems {

    private String name;
    private String drinkType;
    private boolean milk;

    public Drink(String name, String drinkType, boolean milk, double sellingPrice){
        super(sellingPrice);
        this.name = name;
        this.drinkType = drinkType;
        this.milk = milk;

    }

    // GETTERS AND SETTERS

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDrinkType(){
        return drinkType;
    }

    public void setDrinkType(String drinkType){
        this.drinkType = drinkType;
    }

//    end of getters and setters

    public int addSpoonsOfSugar(int amount){
        return amount;
    }
}
