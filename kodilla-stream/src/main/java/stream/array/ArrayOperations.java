package stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
     static double getAverage(int[] numbers){
         IntStream.range(0, numbers.length)
                 .mapToObj(i->numbers[i])
                 .forEach(System.out::println);

         double average = IntStream.range(0, numbers.length)
                 .mapToDouble(i -> numbers[i])
                 .average()
                 .orElse(0.0);
         return average;
     }

}
