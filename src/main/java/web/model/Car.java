package web.model;

public class Car {
    private String brend;
    private int model;
    private String color;

    public Car() {
    }

    public Car(String brend, int model, String color) {
        this.brend = brend;
        this.model = model;
        this.color = color;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                '}';
    }
}