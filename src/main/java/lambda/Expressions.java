package lambda;

import java.util.Comparator;

public class Expressions {
    /**
    Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
       }
      };
     **/

    Comparator<String> comparator =
            (String o1, String o2) ->
                    Integer.compare(o1.length(), o2.length());

    /**
    Runnable runnable = new Runnable() {
    @Override
    public void run() {
    int i = 0;
    while (i++ < 10){
     System.out.println("It works");
     }
     }
    };
     **/

    Runnable runnable = () -> {
        int i = 0;
        while (i++ < 10) {
            System.out.println("It works");
        }
    };
    Comparator<String> stringComparator = ( s1, s2) -> {
        System.out.println("I am comparing strings");
        return Integer.compare(s1.length(), s2.length());
    };
}
