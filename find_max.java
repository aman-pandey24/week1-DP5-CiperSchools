package CP_package;

public class find_max {
    public static int find(int[] arr,int index){
        if (index<0){
            return Integer.MIN_VALUE;
        }
        int temp=find(arr,index-1);
        int max=Math.max(temp,arr[index]);
        return max;
    }
    public static void main(String[] args) {
        int[]arr={5,15,3,13,12,11};
        int n=arr.length;
        System.out.println(find(arr,n-1));
    }
}
