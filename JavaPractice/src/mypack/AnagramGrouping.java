package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramGrouping {
    public static void main(String[] args) {
        // Input list of strings
        String[] input = {"rat", "bat", "tea", "tab", "ate", "eat"};

        // List to hold groups of anagrams
        List<List<String>> groupedAnagrams = new ArrayList<>();

        // Iterate over each string in the input array
        for (String str : input) {
            boolean added = false;
            // Check if the current string can be added to any existing group
            for (List<String> group : groupedAnagrams) {
                if (areAnagrams(group.get(0), str)) {
                    group.add(str);
                    added = true;
                    break;
                }
            }
            // If not added to any group, create a new group
            if (!added) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                groupedAnagrams.add(newGroup);
            }
        }

        // Print the result
        System.out.println(groupedAnagrams);
    }

    // Helper method to check if two strings are anagrams
    private static boolean areAnagrams(String str1, String str2) {
        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
