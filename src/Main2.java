import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int result = -1;
        int min = Integer.MAX_VALUE;
        int[] hash = new int[105];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            hash[a[i]]++;
        }
        for(int i=0;i<105;i++){
            if(hash[i]%2==0 && hash[i]>1){
                if(hash[i]<min){
                    min = hash[i];
                    result = i;
                }
            }
        }
        System.out.println(result);
    }
}
