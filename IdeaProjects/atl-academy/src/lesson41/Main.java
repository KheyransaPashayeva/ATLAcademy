package lesson41;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player [] players={
                (new Player("Jones",20)),
                (new Player("Swith",15)),
                (new Player("Jones",20))

        };
        Student [] students={
                (new Student(1L,"Jones",23)),
                (new Student(3L,"Swith",45)),
                (new Student(5L,"Eltun",13))

        };

        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));
        Arrays.sort(players,new PlayerScoreAscComparator());
        System.out.println(Arrays.toString(players));
        Arrays.sort(players,new PlayerNameDescComparator());
        System.out.println(Arrays.toString(players));
        System.out.println(Arrays.toString(students));
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
               return p1.getName().compareTo(p2.getName());

            }
        });
        //                return Integer.compare(p2.getScore(),p1.getScore());
        Arrays.sort(players, (p1, p2) -> Integer.compare(p2.getScore(),p1.getScore()));
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Long.compare(s2.getId(), s1.getId());
            }
        });
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println(Arrays.toString(students));
    }

}
