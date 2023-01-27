package CP_package;

import java.util.ArrayList;

public class generate_all_subset {
    public static void helper(int[] arr, ArrayList<Integer> ans,int begin){

        printArrayList(ans);
        for (int i=begin;i<arr.length;i++){
            if (ans.contains(arr[i])){
                continue;
            }
            ans.add(arr[i]);
            helper(arr,ans,i+1);
            ans.remove(ans.size()-1);
        }
    }
    public static void printArrayList(ArrayList<Integer> ans){
        for (int x:ans){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        ArrayList<Integer> ans=new ArrayList<>();
        helper(arr,ans,0);
    }
}
