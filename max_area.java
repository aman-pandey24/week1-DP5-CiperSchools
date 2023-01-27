package CP_package;

import java.util.Stack;

public class max_area {
    public static int maxAreainHistogram(int[] arr){
        Stack<Integer> s=new Stack<>();
        int max_area=0;
        int i=0;
        while (i<arr.length){
            int currBuilding=arr[i];
            if (s.isEmpty()||currBuilding>=arr[s.peek()]){
                s.push(i);
                i++;
            }
            else {
                int prevBar=s.pop();
                int height=arr[prevBar];
                int width;
                if (s.isEmpty()){
                    width=i;
                }
                else {
                    width=i-s.peek()-1;
                }
                int area=height*width;
                max_area=Math.max(max_area,area);
            }
        }
        while(!s.isEmpty()){
            int prevBar=s.pop();
            int height=arr[prevBar];
            int width;
            if (s.isEmpty()){
                width=i;
            }
            else {
                width=i-s.peek()-1;
            }
            int area=height*width;
            max_area=Math.max(area,max_area);
        }
        return max_area;
    }
    public static void main(String[] args) {
        int[] arr={7,6,2,4,3,5,10};
        System.out.println(maxAreainHistogram(arr));
    }
}
