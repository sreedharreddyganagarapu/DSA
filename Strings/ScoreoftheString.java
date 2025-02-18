//You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.



import java.util.*;
public class ScoreoftheString {
    public static int Ascii(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            int a=i;
            int b=i+1;
            char first=s.charAt(a);
            char last=s.charAt(b); 
            int aascii=first;
            int bascii=last;
            int temp=Math.abs(aascii-bascii);
            ans=ans + temp;
        }
    return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Ascii(s));
    }
            
}

