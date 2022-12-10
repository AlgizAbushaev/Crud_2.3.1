package web.model;

public class Car {
    private int id;
    private String brend;
    private String model;

    public Car(int id, String brend, String model) {
        this.id = id;
        this.brend = brend;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
