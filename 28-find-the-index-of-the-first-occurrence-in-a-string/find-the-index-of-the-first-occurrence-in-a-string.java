class Solution {
    public int strStr(String haystack, String needle) {
        // Handle empty needle case
        if (needle.length() == 0) {
            return 0;
        }
        
        // Loop through haystack until remaining characters are fewer than needle length
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if substring starting at i matches needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}
