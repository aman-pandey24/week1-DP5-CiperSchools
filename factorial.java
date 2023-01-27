package CP_package;

public class factorial {
    public static long fact(long n){
        if (n==0||n==1){
            return 1;
        }
        long recursion=fact(n-1);
        long bigger_problem=recursion*n;
        return bigger_problem;
    }
    public static void main(String[] args) {
        System.out.println(fact(20));
    }
}
