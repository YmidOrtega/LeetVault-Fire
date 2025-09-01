package N1768_MergeStringsAlternately;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
	    int i=0, j=0, w1 = word1.length(), w2 = word2.length(), k = 0;
	    char[] letter = new char[w1+w2];
	    while (i < w1 && j < w2){
		    letter[k++] = word1.charAt(i++);
		    letter[k++] = word2.charAt(j++);
	    }
	    while (i < w1){
		    letter[k++] = word1.charAt(i++);
	    }
	    while (j < w2){
		    letter[k++] = word2.charAt(j++);
	    }
	    return new String(letter,0,k);
    }
}
