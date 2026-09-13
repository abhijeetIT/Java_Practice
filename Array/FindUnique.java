package JavaBasic.Array;

import java.util.ArrayList;

public class FindUnique {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 41, 12, 1, 2, 3, 4, 2};
        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < elements.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < elements.length; j++) {
                if (i != j && elements[i] == elements[j]) {
                    isUnique = false;
                    break; // No need to check further
                }
            }
            if (isUnique) {
                unique.add(elements[i]);
            }
        }
        System.out.println(unique);
    }
}
