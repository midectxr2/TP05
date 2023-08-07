public class Bicycle implements Lineable{
    String color;
    String brand;
    public Bicycle(String color, String brand){
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public boolean canPass(){
        return true;
    }
}
