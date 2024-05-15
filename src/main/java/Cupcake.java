public class Cupcake extends CafeItems {

    private String name;
    private String flavour;
    private boolean vegan;

    public Cupcake (String name, String flavour, boolean vegan){
        this.name = name;
        this.flavour = flavour;
        this.vegan = vegan;
    }

    public String addToppings(){
        return "Added chocolote sprinkles";
    }
}
