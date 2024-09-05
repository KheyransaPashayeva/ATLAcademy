package lesson40;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        final String word="AZERBAIJAN";
        char[] charArray=word.toCharArray();

        Map<Character,Integer>hashMap=new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
//            if (hashMap.containsKey(charArray[i])){
//                Integer count =hashMap.get(charArray[i]);
//                hashMap.put(charArray[i],count+1);
//            }else{
//                hashMap.put(charArray[i],1);
//            }

            //asagidaki ikisi eyni seydir
//            hashMap.merge(charArray[i], 1, new BiFunction<Integer, Integer, Integer>() {
//                @Override
//                public Integer apply(Integer integer, Integer integer2) {
//                    return integer+integer2;
//                }
//            });

            hashMap.merge(charArray[i], 1, Integer::sum);
        }
        System.out.println(hashMap);
    }
}

