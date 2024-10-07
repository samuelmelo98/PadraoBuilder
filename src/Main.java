public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setMarca("Fiat")
                .setModelo("Uno")
                .setAno(2010)
                .build();
        System.out.println(car);

    }
}
