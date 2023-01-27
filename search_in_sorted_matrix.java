package CP_package;

public class search_in_sorted_matrix {
    public static boolean search(int[][] arr,int target_value){
        int i=0,j=arr[0].length-1;
        while (i<arr.length && j>=0){
            int curr_element=arr[i][j];
            if (curr_element==target_value){
                return true;
            }
            if(curr_element>target_value){
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int target=8;
        System.out.println(search(matrix,target));
    }
}
