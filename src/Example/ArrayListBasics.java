package Example;

import java.util.ArrayList;

/**
 *
 * @author Sathishkumar T
 */
public class ArrayListBasics {

    public static void main(String[] args) {
        // Let's demonstrate some basics of arraylists
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(70);
        System.out.printf("Second Grade : %d\n", grades.get(1));
    }
}
