package oop.projectcomputer.entities;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Representa um computador com marca, cor, modelo, número de série e preço.
 */
public class Computer {
    private String brand;
    private String color;
    private String model;
    private long serialNumber;
    private BigDecimal price;

    /**
     * Cria um novo computador com os dados informados.
     *
     * @param brand marca do computador
     * @param color cor do computador
     * @param model modelo do computador
     * @param serialNumber número de série (deve ser positivo)
     * @param price preço do computador (deve ser positivo)
     */
    public Computer(String brand, String color, String model, long serialNumber, BigDecimal price) {
        this.brand = brand;
        this.color = color;
        this.model = model;

        if (serialNumber < 0) {
            throw new IllegalArgumentException("Serial number não pode ser negativo: " + serialNumber);
        }
        this.serialNumber = serialNumber;

        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo: " + price);
        }
        this.price = price;
    }

    /**
     * Ajusta o preço do computador de acordo com a marca:
     * acrescenta 30% se for HP, 50% se for IBM, mantém o preço original caso contrário.
     */
    public void calculateValue(){
        if (brand.equalsIgnoreCase("HP")){
            price = price.multiply(BigDecimal.valueOf(1.30));
        } else if (brand.equalsIgnoreCase("IBM")){
            price = price.multiply(BigDecimal.valueOf(1.50));
        }
    }

    /**
     * Altera o preço do computador, caso o novo valor seja positivo.
     *
     * @param newPrice novo preço proposto
     * @return 1 se o valor foi alterado, 0 caso contrário
     */
    public int changeValue(BigDecimal newPrice){
        if (newPrice.compareTo(BigDecimal.ZERO) > 0){
            this.price = newPrice;
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", serialnumber=" + serialNumber +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return serialNumber == computer.serialNumber &&
                brand.equals(computer.brand) &&
                color.equals(computer.color) &&
                model.equals(computer.model) &&
                price.equals(computer.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, model, serialNumber, price);
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }
}