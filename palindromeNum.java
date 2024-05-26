package leetprblms;
import java.util.*;
public class palindromeNum {
	public static boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        if(temp==rev)
        return true;
        else
        return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.print(isPalindrome(x));
        

}
}
