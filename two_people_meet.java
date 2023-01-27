package CP_package;

public class two_people_meet {
    public static boolean ismeet(int p1,int p2,int s1,int s2){
        if(p1>p2&&s1>s2){
            return false;
        }
        if (p2>p1&&s2>s1){
            return false;
        }
        if(p1<p2){
            swap(p1,p2);
            swap(s1,s2);
        }
        return ((p1-p2)%(s1-s2)==0);
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=a;
    }
    public static void main(String[] args) {
        int x1 = 5, v1 = 8, x2 = 4, v2 = 7;
        if (ismeet(x1, x2, v1, v2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
