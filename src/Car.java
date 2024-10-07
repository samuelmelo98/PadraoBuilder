public class Car {
    private String marca;
    private String modelo;
    private int ano;

    static class Builder{
        private String marca;
        private String modelo;
        private int ano;

        /**
         * set's
         */
        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder setAno(int ano) {
            this.ano = ano;
            return this;
        }

        public Car build(){
            Car car = new Car();
            car.marca = this.marca;
            car.modelo = this.modelo;
            car.ano = this.ano;
            return car;
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
