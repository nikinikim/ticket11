import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Дан массив строк. Необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.

        String[] array = {"apple", "banana", "orange", "apple", "kiwi", "orange", "mango"};

        String mergedString = mergeUniqueStrings(array);

        System.out.println(mergedString);


    }

    public static String mergeUniqueStrings(String[] array) {
        Set<String> uniqueStrings = new LinkedHashSet<>();

        for (String str : array) {
            uniqueStrings.add(str);
        }

        StringBuilder mergedString = new StringBuilder();
        for (String str : uniqueStrings) {
            mergedString.append(str);
        }
        return mergedString.toString();
    }


}