class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Step 1:
        // Create a HashMap
        // key   = sorted version of the word
        // value = list of words that match that sorted pattern
        HashMap<String, List<String>> map = new HashMap<>();
        // Step 2:
        // Go through each word in the input array
        for (String word : strs) {
            // Step 3:
            // Convert the word into a char array so we can sort it
            char[] chars = word.toCharArray();
            // Step 4:
            // Sort the characters
            // Example: "cat" -> ['a','c','t']
            Arrays.sort(chars);
            // Step 5:
            // Convert sorted char array back into a String
            // This becomes the key
            // Example: "cat" -> "act"
            String key = new String(chars);
            // Step 6:
            // If this key is not already in the map,
            // create a new empty list for it
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            // Step 7:
            // Add the original word into the correct group
            map.get(key).add(word);
        }
        // Step 8:
        // Return all grouped values from the map
        return new ArrayList<>(map.values());
    }
}
