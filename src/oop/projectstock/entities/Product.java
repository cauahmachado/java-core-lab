package oop.projectstock.entities;

public class Product {
    private int code;
    private String description;
    private int quantity;
    private String manufacturer;

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public boolean removeProduct(int quantity){
        if (this.quantity >= quantity){
            this.quantity -= quantity;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
