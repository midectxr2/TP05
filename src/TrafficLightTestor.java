import java.util.ArrayList;

public class TrafficLightTestor {
    public static void main(String[] args){
        ArrayList<Lineable> list = new ArrayList<>();
        TrafficLight trafficLight = new TrafficLight(list);
        trafficLight.add(new Car("0", "ford"));
        trafficLight.add(new Car("1", "ford"));
        trafficLight.add(new Bicycle("0", "ford"));
        trafficLight.add(new Bicycle("1", "ford"));
        trafficLight.add(new Bicycle("3", "ford"));

        System.out.println(trafficLight.toString());
    }

}
