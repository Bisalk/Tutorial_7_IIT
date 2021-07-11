import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> statistics = new ArrayList<Integer>();

      

        P1.getPlayerDetails();

        System.out.println("Best Performance  :"+P1.getBestPerformance());

        ArrayList<Integer> p1Statistics = P1.getStatistics();
        String p1Name = P1.getName();
        int p1Age = P1.getAge();
        String p1Type = P1.getType();

    }


}
