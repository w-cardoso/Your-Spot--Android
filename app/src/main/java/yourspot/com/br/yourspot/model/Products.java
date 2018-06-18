package yourspot.com.br.yourspot.model;

public class Products {
    private int id;
    private String image;
    private String description;
    private String valueInstallment;
    private String valueInCash;

    public Products(int id, String image, String description, String valueInstallment, String valueInCash) {
        this.id = id;
        this.image = image;
        this.description = description;
        this.valueInstallment = valueInstallment;
        this.valueInCash = valueInCash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValueInstallment() {
        return valueInstallment;
    }

    public void setValueInstallment(String valueInstallment) {
        this.valueInstallment = valueInstallment;
    }

    public String getValueInCash() {
        return valueInCash;
    }

    public void setValueInCash(String valueInCash) {
        this.valueInCash = valueInCash;
    }
}


