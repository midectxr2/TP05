public class Car implements Lineable{
    String licensePlate;
    String brand;
    public Car(String licensePlate, String brand){
        this.licensePlate = licensePlate;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public boolean canPass(){
        return false;
    }


}
