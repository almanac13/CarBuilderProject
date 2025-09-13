public class Car {
    private String type;
    private String model;
    private String color;
    private String engine;
    private String country;
    private int year;
    private String license_number;
    private int max_speed;

    public Car(Builder builder) {
        this.type = builder.type;
        this.model = builder.model;
        this.color = builder.color;
        this.engine = builder.engine;
        this.country = builder.country;
        this.year = builder.year;
        this.license_number = builder.license_number;
        this.max_speed = builder.max_speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public String toString() {
        return "Car: " + type + " " + model + " (" + year + "), color: " + color +
                ", engine: " + engine + ", max_speed: " + max_speed + " km/h" + ", " +
                "licence_number: " + license_number;
    }

    public static class Builder {
        private String type;
        private String model;
        private String color;
        private String engine;
        private String country;
        private int year;
        private String license_number;
        private int max_speed;

        public Builder type(String type) {
            this.type = type;
            return this;
        }
        public Builder model(String model) {
            this.model = model;
            return this;
        }
        public Builder color(String color) {
            this.color = color;
            return this;
        }
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }
        public Builder country(String country) {
            this.country = country;
            return this;
        }
        public Builder year(int year) {
            this.year = year;
            return this;
        }
        public Builder license_number(String licenseNumber) {
            this.license_number = licenseNumber;
            return this;
        }
        public Builder max_speed(int max_speed) {
            this.max_speed = max_speed;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}
