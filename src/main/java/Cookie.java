public class Cookie extends BaseCandy{

    private String form = null;

    public Cookie(String name, float weight, float price) {
        super(name, weight, price);
    }

    public Cookie(String name, String form, float weight, float price) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
