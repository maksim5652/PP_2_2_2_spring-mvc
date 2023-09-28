package web.model;

public class Car {

    private String model;
    private int prise;
    private int year;

    public Car (String model, int prise, int year) {
        this.model = model;
        this.prise = prise;
        this.year = year;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
