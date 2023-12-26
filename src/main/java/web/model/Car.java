package web.model;

public class Car {
    private String model;
    private int serial;
    private String number;

    public Car() {}

    public Car(String model, int serial, String number) {
        this.model = model;
        this.serial = serial;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial=" + serial +
                ", number='" + number + '\'' +
                '}';
    }
}
