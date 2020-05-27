package lambda;

import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferences {
    //Function<Person, Integer> f = person -> person.getAge();
    Function<Person, Integer> f = Person::getAge;

    /**
    BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;
                                = (i1, i2) -> Integer.sum(i1, i2);
     **/

    BinaryOperator<Integer> sum = Integer::sum;
    BinaryOperator<Integer> max = Integer::max;

    //Consumer<String> printer = s -> System.out.println(s);
    Consumer<String> printer = System.out::println;

    //----------------------------------------------------------------------------------//

}
