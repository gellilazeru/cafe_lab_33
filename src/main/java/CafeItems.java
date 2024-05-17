public abstract class CafeItems {

    protected double sellingPrice;

    public CafeItems (double sellingPrice){
        this.sellingPrice = sellingPrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }

    public void setSellingPrice(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }


}
