class Solution {

    public boolean rotateString(String s, String goal) {

        String S = s + s;

        if (s.length() != goal.length())
            return false;

        if (S.contains(goal))
            return true;
        else
            return false;
    }
}