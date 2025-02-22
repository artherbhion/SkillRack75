import java.util.Scanner;

public class pathcount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               arr[i][j] = sc.nextInt();
            }
        }
        int[][] path=new int[r][c];
        path[0][0]=arr[0][0];
        for(int i=1;i<c;i++){
            if(arr[0][i]==1){
            path[0][i]=path[0][i-1];}
        }
        for(int i=1;i<r;i++){
            if(arr[i][0]==1){
            path[i][0]=path[i-1][0];
            }
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(arr[i][j]==1){
                    path[i][j]=path[i][j-1]+path[i-1][j];
                }
            }
        }
        if(path[r-1][c-1]>0){
            System.out.println("YES"+ path[r-1][c-1]);
        }
        else{
            System.out.println("NO");
        }
    }
}
