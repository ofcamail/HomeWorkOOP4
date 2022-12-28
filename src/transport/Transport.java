package transport;

public abstract class Transport<T> implements Competing {
    private T driver;
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Vedro";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public final void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Vedernoe";
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public final void setEngineVolume(int engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public abstract void printType();

    @Override
    public void getPitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость");
    }

    public void outPutInformationForTheRace(T driver) {
        System.out.println("Водитель " + driver + " управляет автомобилем " + brand + " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return "Марка: " + brand +
                " Модель: " + model +
                " Объем двигателя: " + engineVolume;
    }
}