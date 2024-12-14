package string;

public class reverseStringSolution {
    public String[] reverseString(String[] s) {
        int l = s.length - 1;
        int i = 0;
        while (i < l) {
            String temp = s[i];
            s[i] = s[l];
            s[l] = temp;
            i++;
            l--;
        }
        return s;
    }

    public String[] reverseString2(String[] s) {
        recursiveReverse(s, 0, s.length - 1);
        return s;
    }

    private void recursiveReverse(String[] s, int i, int l) {
        if (i >= l) return;
        String temp = s[i];
        s[i] = s[l];
        s[l] = temp;
        recursiveReverse(s, i + 1, l - 1);
    }
}
