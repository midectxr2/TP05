import java.util.Locale;

public class MyBinaryInteger implements Comparable<MyBinaryInteger>{
    public int number;
    public String str;
    public MyBinaryInteger(int n){
        String str = Integer.toBinaryString(n);
        int number = Integer.parseInt(str);
        this.str = str;
        this.number = number;
    }

    @Override
    public String toString() {
        return "MyBinaryInteger{" +
                "number=" + number +
                '}';
    }

    public int compareTo(MyBinaryInteger compareTo){
        MyBinaryInteger compareToBin = (MyBinaryInteger)compareTo;
        int compteur1 = 0;
        int compteur2 = 0;
        if(str.length() < compareToBin.str.length()){
            return -1;
        } else if (str.length() > compareToBin.str.length()) {
            return 1;
        }
        else{
            for(int i=0; i<str.length();i++){
                if(str.charAt(i) == '1'){
                    compteur1++;
                }
                if(compareToBin.str.charAt(i) == '1'){
                    compteur2++;
                }
            }
            if(compteur1 > compteur2){
                return 1;
            } else if (compteur1 < compteur2) {
                return -1;
            }
            else{
                return 0;
            }
        }
    }
}
