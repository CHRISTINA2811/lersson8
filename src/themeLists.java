import java.util.ArrayList;
import java.util.List;

public class themeLists {


    public static void main(String[] args) {
        List<Integer>spisok55 = new ArrayList<>();
        spisok55.add(1);
        spisok55.add(44);
        spisok55.add(8);

        List<Integer> spisok = spisok(spisok55);

        System.out.println( spisok);
    }

   static List<Integer> spisok(List<Integer> spisok) {
        List<Integer> spisok22 = new ArrayList<>();
        for (Integer integer : spisok) {
            if (integer % 2 == 0) {
                spisok22.add(integer);

            }
        }
        return spisok22;
    }
}