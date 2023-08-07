import java.util.ArrayList;

public class TrafficLight {
    ArrayList<Lineable> list;

    public TrafficLight(ArrayList<Lineable> list){
        this.list = list;

    }

    public void add(Lineable lineable){
        if(lineable.canPass()){
            for(int i=0; i<list.size();i++){
                if(!list.get(i).canPass()){
                    list.add(i, lineable);
                    return;
                }
            }
        }
        else{
            list.add(lineable);
        }
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "list=" + list +
                '}';
    }
}
