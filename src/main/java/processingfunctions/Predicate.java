package processingfunctions;

public interface Predicate<T> {
    boolean test(T t);

    Predicate<String> p = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.length() < 20;
        }
    };
    Predicate<String> predicate = s -> s.length() < 20;

}
