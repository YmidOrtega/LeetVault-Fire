package N6_ZigzagConversion;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        int n = s.length(), row = 0, dsindex = 0, cyclelen = 2 * numRows - 2, j = 0;
        if(numRows == 1 || numRows >= n ) return s;
        char src []  = s.toCharArray();
        char dst[] = new char [n];
        for(row = 0 ; row < numRows; row++){
            int step1 = cyclelen - 2 * row;
            for(j = row; j < n; j+=cyclelen){
                dst[dsindex++] = src[j];
                if(row>0 && row<numRows-1){
                    int diag = j+step1;
                    if(diag<n) dst[dsindex++]  = src[diag];
                }
            }
        }
        return new String(dst);
    }
}
