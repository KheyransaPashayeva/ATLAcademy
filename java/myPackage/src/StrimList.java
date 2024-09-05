

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class StrimList {
    public static void main(String[] args) {
        List<Integer> integers = List.of(2, 4, 1, 7, 12);
        ArrayList<Integer> integers1 = new ArrayList<Integer>();

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i)%2==0){
                integers1.add(integers.get(i));
            }

        }
        System.out.println(integers1);
        Integer max=integers1.get(0);
        for (Integer num:integers1) {
            if ( num > max) {
                max=num;
            }
        }
        System.out.println(max);

        List<String> stringList = List.of("kenan", "ali", "ehmed", "kebab", "kubik");
        List<String> k = stringList.stream()
                .filter(string -> string.startsWith("k"))
                .collect(Collectors.toList());
        System.out.println(k);

        List<Integer> listnum = List.of(2, 5, 3, 1, 4);
        List<Integer> num =listnum.stream()
                .map(integer -> integer*integer)
                .toList();
        System.out.println(num);

        Scanner sc = new Scanner(System.in);
        String string=sc.nextLine();
        Map<Character, Long> collect = string.chars()
                .mapToObj(o->(char) o)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);

//        random 100 eded
        Random random = new Random();
        List<Integer> listarr = random.ints(100, 10, 101) // 10 sayı, 10 ile 100 arasında (101 dahil değil)
                .filter(i -> (i % 2) != 0) // Sadece tek sayıları seçiyoruz
                .boxed() // intStream'i Stream<Integer> olarak kutuluyoruz
                .collect(Collectors.toList()); // Stream'i bir listeye topluyoruz

        // Listeyi ekrana yazdırıyoruz
        listarr.forEach(System.out::println);
    }
}

