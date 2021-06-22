class Result {
    public static long repeatedString(String s, long n) {
        int strLength = s.length();
        long q = 0, r = 0;
        //how many times the string should be repeated
        q = n / strLength;
        //if there is a remainder it means that there is a substring that we have to put into consideration
        r = n % strLength;
        long partialStrLen = (r == 0) ? 0 : r;
        long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
        return aCount;
    }

    public static long getLetterCount(String s, long strLength) {
        long count = 0;
        for(int i = 0; i < strLength; i++) {
            if(s.charAt(i) == 'a') {
                count++;
            }
        }
        
        return count;
    }
}