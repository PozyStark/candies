public class WhiteChocolate extends BaseCandy {

    private boolean hasRaisin = false;

    public WhiteChocolate(String name, float weight, float price) {
        super(name, weight, price);
    }

    public WhiteChocolate(String name, float weight, float price, boolean hasRaisin) {
        super(name, weight, price);
        this.hasRaisin = hasRaisin;
    }

    public boolean isHasRaisin() {
        return hasRaisin;
    }

    public void setHasRaisin(boolean hasRaisin) {
        this.hasRaisin = hasRaisin;
    }
}
