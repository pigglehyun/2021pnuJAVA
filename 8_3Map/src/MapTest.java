import java.util.*;
import java.util.stream.Collectors;

public class MapTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> data = new ArrayList<>();

        data.add(sc.next());
        data.add(sc.next());
        data.add(sc.next());
        data.add(sc.next());
        data.add(sc.next());
        sc.close();

        List<String> upperStrData = data.stream().map(word ->word.split(" "))
                .flatMap(Arrays::stream).map(word->word.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(upperStrData);

    }

}