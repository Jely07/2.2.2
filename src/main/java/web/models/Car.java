package web.models;

public class Car {
    int id;
    String modelName;
    String color;

    public Car(int id, String modelName, String color) {
        this.id = id;
        this.modelName = modelName;
        this.color = color;
    }

    public Car() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
