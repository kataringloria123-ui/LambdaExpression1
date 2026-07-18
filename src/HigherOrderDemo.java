import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class HigherOrderDemo {

    public static String selectWords(List<String> words, Predicate<String> strFilter) {
        return words.stream().filter(strFilter).reduce("", (a, b) -> a +" "+ b);
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello","My","name","is","Bob");
        System.out.println(selectWords(words, (s) -> s.length() < 4));

        Predicate<String> smallWordsFilter = (s) -> s.length() > 3;

        System.out.println(selectWords(words, smallWordsFilter));
    }
}
