package web.model;


public class Car {
    private String model;
    private String series;
    private int yearsRelease;

    public Car(String model, String series, int yearsRelease) {
        this.model = model;
        this.series = series;
        this.yearsRelease = yearsRelease;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearsRelease() {
        return yearsRelease;
    }

    public void setYearsRelease(int yearsRelease) {
        this.yearsRelease = yearsRelease;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", yearsRelease=" + yearsRelease +
                '}';
    }
}
