import java.util.Scanner;

public class EqualCount {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int count = 0, vc = 0, cc = 0;
        for (int index = 0; index < k; index++) {
            if (isvowel(str.charAt(index))) {
                vc++;
            } else {
                cc++;
            }
        }
        if(vc==cc){
            count++;
        }
        for (int index = k; index < str.length(); index++) {
            if(isvowel(str.charAt(index-k))){
                vc--;
            }
            else{
                cc--;
            }
            if(isvowel(str.charAt(index))){
                vc++;
            }
            else{
                cc++;
            }
            if(vc==cc){
                count++;
            }
        }
        System.out.println(count);
    }

    public static Boolean isvowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}