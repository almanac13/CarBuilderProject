public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .type("Sedan")
                .model("Mazda")
                .color("blue")
                .year(2001)
                .max_speed(170)
                .build();

        System.out.println(car.toString());
    }
}
