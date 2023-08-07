import com.sun.source.util.SourcePositions;

import java.security.DigestOutputStream;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrez un entier");
        int nombre = scanner.nextInt();
        Comparable[] comparables = new Comparable[nombre];
        for (int j = 0; j < comparables.length; j++) {
            System.out.println("entrez un entier a comparer, si vous avez finit entrez -1");
            int res = scanner.nextInt();
            MyBinaryInteger myBinaryInteger = new MyBinaryInteger(res);
            comparables[j] = myBinaryInteger;
        }

        Arrays.sort(comparables);
        System.out.println(Arrays.toString(comparables));
    }
}