public class MilkChocolate extends BaseCandy {

    private float numberOfRects;

    public MilkChocolate(String name, float weight, float price) {
        super(name, weight, price);
    }

    public MilkChocolate(String name, float weight, float price, float numberOfRects) {
        super(name, weight, price);
        this.numberOfRects = numberOfRects;
    }

    public float getNumberOfRects() {
        return numberOfRects;
    }

    @Override
    public String toString() {
        return super.toString() + " NumberOfRects:" + this.numberOfRects;
    }

    public void setNumberOfRects(float numberOfRects) {
        this.numberOfRects = numberOfRects;
    }
}
