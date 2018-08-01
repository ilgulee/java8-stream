package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Stream8 {
    public static List<Integer> returnSquareRoot(List<Integer> numbers){
        return numbers.stream().map(Math::sqrt).map(Double::intValue).collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> users){
        return users.stream().map(User::getAge).collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users){
        return users.stream().map(User::getAge).distinct().collect(toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Integer countUsersOlderThen25(List<User> users){
        long count =users.stream().map(User::getAge).filter(age->age>25).count();
        return Math.toIntExact(count);
    }

    public static List<String> mapToUpperCase(List<String> strings){
        return strings.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }

    public static Integer sum(List<Integer> integers){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip){
        return integers.stream().skip(toSkip).collect(toList());
    }

    public static List<String> getFirstNames(List<String> names){
        return names.stream().map(s->s.split(" ")).map(s->s[0]).collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names){
        return names.stream().map(string->string.split("")).flatMap(Arrays::stream).distinct().collect(toList());
    }


    public static String separateNamesByComma(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static double getAverageAge(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Integer getMaxAge(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Integer getMinAge(List<User> users) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static boolean anyMatch(List<User> users, int age){
        return users.stream().anyMatch(user -> user.getAge().equals(age));
    }

    public static boolean noneMatch(List<User> users, int age){
        return users.stream().noneMatch(user -> user.getAge().equals(age));
    }

    public static Optional<User> findAny(List<User> users, String name){
        return users.stream().filter(user -> user.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users){
//       return users.stream().sorted(Comparator.comparingInt(User::getAge)).collect(toList());
        users.sort(Comparator.comparing(User::getAge));
        return users;
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static List<Integer> generateFirst10PrimeNumbers(){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
    }

    public static List<Integer> generate10RandomNumbers(){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static User findOldest(List<User> users){
        return users.stream().max(Comparator.comparingInt(User::getAge)).get();
    }

    public static int sumAge(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
