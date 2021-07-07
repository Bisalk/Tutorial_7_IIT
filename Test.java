import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> statistics = new ArrayList<Integer>();

        statistics.add(99);
        statistics.add(1);
        statistics.add(2);
        statistics.add(3);
        statistics.add(4);
        statistics.add(5);
        statistics.add(6);
        statistics.add(7);
        statistics.add(8);
        statistics.add(9);
        statistics.add(10);
        statistics.add(11);
        statistics.add(12);
        statistics.add(13);
        statistics.add(14);

        Collections.sort(statistics);

        Player P1 = new Player("p1",12,"batsman",statistics);

        System.out.println("Average           :"+P1.getAverage());

        P1.getPlayerDetails();

        System.out.println("Best Performance  :"+P1.getBestPerformance());

        ArrayList<Integer> p1Statistics = P1.getStatistics();
        String p1Name = P1.getName();
        int p1Age = P1.getAge();
        String p1Type = P1.getType();

    }


}
