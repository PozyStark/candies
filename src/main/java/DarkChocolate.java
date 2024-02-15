public class DarkChocolate extends BaseCandy {

    private float cocoaPercent;

    public DarkChocolate(String name, float weight, float price) {
        super(name, weight, price);
    }

    public DarkChocolate(String name, float weight, float price, float cocoaPercent) {
        super(name, weight, price);
        this.cocoaPercent = cocoaPercent;
    }

    public float getCocoaPercent() {
        return cocoaPercent;
    }

    public void setCocoaPercent(float cocoaPercent) {
        this.cocoaPercent = cocoaPercent;
    }
}
