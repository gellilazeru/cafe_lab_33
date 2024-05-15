public class Cupcake extends CafeItems {

    private String name;
    private String flavour;
    private boolean vegan;

    public Cupcake (String name, String flavour, boolean vegan, double sellingPrice){
        super(sellingPrice);
        this.name = name;
        this.flavour = flavour;
        this.vegan = vegan;
    }

//    GETTERS AND SETTERS

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFlavour(){
        return flavour;
    }

    public void setFlavour(String flavour){
        this.flavour = flavour;
    }

// end of getters and setters



    public String addToppings(String topping){
        return "Add " + topping + " sprinkles.";
    }

    public void setVegan(boolean vegan){
        this.vegan = vegan;
    }


    public String isVegan(boolean vegan){
        return vegan ? "This cupcake contains dairy" : "This cupcake does not contain dairy";
    }


}
