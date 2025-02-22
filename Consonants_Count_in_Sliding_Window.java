import java.util.Scanner;

public class Consonants_Count_in_Sliding_Window {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int count=0;
        for (int index = 0; index < k; index++) {
            if(!isvowel(str.charAt(index)))count++;
        }
        System.out.print(count+" ");
        for (int i = 1; i <=str.length()-k; i++) {
            if(!isvowel(str.charAt(i-1))){
                count--;
            }
            if(!isvowel(str.charAt(i+k-1))){
                count++;
            }
            System.out.print(count+" ");
        }
    }
    public static Boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){          
            return true;
        }
        return false;
    }
}