package transport;


import driver.DriverB;

public class Car extends Transport<DriverB> {
        public enum BodyType {
            SEDAN("Седан"),
            HATCHBACK("Хетчбек"),
            COUPE("Купе"),
            UNIVERSAL("Универсал"),
            SUV("Внедорожник"),
            CROSSOVER("Кроссовер"),
            PICKUP("Пикап"),
            VAN("Фургон"),
            MINIVAN("Минивэн");

            private final String translation;

            BodyType(String translation) {
                this.translation = translation;
            }

            public String getTranslation() {
                return translation;
            }

            @Override
            public String toString() {
                return "Тип кузова: " + translation;
            }
        }
    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + bodyType;
    }
}