package yourspot.com.br.yourspot.model;

public class Cart {
    private String imgProduct;
    private String product;
    private String color;
    private String value;
    private String amount;

    public Cart(String imgProduct, String product, String color, String value, String amount) {
        this.imgProduct = imgProduct;
        this.product = product;
        this.color = color;
        this.value = value;
        this.amount = amount;
    }

    public String getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(String imgProduct) {
        this.imgProduct = imgProduct;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
