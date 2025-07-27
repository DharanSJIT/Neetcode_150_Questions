class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str1=s.toCharArray();
        Arrays.sort(str1);
        char[] str2=t.toCharArray();
        Arrays.sort(str2);
        return (Arrays.equals(str1,str2));
    }
}
