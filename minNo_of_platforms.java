package CP_package;

public class minNo_of_platforms {
    public static int mini(int[] arr,int[] dep){
        int result=1;
        int arrival_index=1;
        int departure_index=0;
        int platform_required=1;
        while (arrival_index<arr.length&&departure_index<dep.length){
            int curr_arr_time=arr[arrival_index];
            int curr_dep_time=dep[departure_index];
            if(curr_arr_time<=curr_dep_time){
                platform_required++;
                arrival_index++;
            }
            else {
                platform_required--;
                departure_index++;
            }
            if (platform_required>result){
                result=platform_required;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={900,915,1100};
        int[] dep={1000,1105,1200};
        System.out.println(mini(arr,dep));
    }
}
