import java.util.Scanner;

public class q1342 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int steps=count(num, 0);
        System.out.println(steps);
        
    }
    static int count(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            steps++;
           return count(num/2, steps);
        }else{
            steps++;
           return count(num-1, steps);
        }
    }
    
}
