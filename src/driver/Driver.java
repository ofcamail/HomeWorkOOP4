package driver;

public abstract class Driver {
    private String fullName;
    private boolean haveDriverLicense;
    private final int experience;

    public Driver(String fullName, boolean haveDriverLicense, int experience) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "driver";
        } else {
            this.fullName = fullName;
        }
        this.haveDriverLicense = haveDriverLicense;
        this.experience = Math.abs(experience);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty() || fullName.isBlank()) {
            this.fullName = "Vodyatel";
        } else {
            this.fullName = fullName;
        }
    }

    public boolean isHaveDriverLicense() {
        return haveDriverLicense;
    }

    public void setHaveDriverLicense(boolean haveDriverLicense) {
        this.haveDriverLicense = haveDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void startDriving() {
        System.out.println("Начато движение");
    }

    public void stopDriving() {
        System.out.println("Остановка");
    }

    public void refuelCar() {
        System.out.println("Заправляю авто");
    }

    public String toString() {
        return fullName;
    }
}