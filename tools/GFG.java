package tools;

import java.util.*;

public class GFG {
    public ArrayList<Integer> common_element(int v1[], int v2[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> commonElements = new ArrayList<>();

        // Add elements of the first array to the HashSet
        for (int num : v1) {
            set.add(num);
        }

        // Check for common elements in the second array
        for (int num : v2) {
            if (set.contains(num) && !commonElements.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }
}
