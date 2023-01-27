package CP_package;

public class kSmallest_element {
    public static void k_smallest(int[] arr,int k){
        for(int index=k;index<arr.length;index++){
            int curr_elemenet=arr[k];
            int max=arr[k-1];
            int max_pos=k-1;
            for(int reverse_index=k-2;reverse_index>=0;reverse_index--){
                if (arr[reverse_index]>max){
                    max=arr[reverse_index];
                    max_pos=reverse_index;
                }
            }
            if (curr_elemenet<max){
                while (max_pos<k-1){
                    arr[max]=arr[max_pos+1];
                    max_pos++;
                }
                arr[k-1]=curr_elemenet;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr={10,20,5,4,3,9,16,19,22,65};
        int k=4;
        k_smallest(arr,k);
    }
}
