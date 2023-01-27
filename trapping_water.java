package CP_package;

public class trapping_water {
    public static int gate_water_units(int[] buildarray){
        int[] left=new int[buildarray.length];
        int[] right=new int[buildarray.length];
        left[0]=buildarray[0];
        int water_units=0;
        for (int left_index=1;left_index<left.length;left_index++){
            left[left_index]=Math.max(left[left_index-1],buildarray[left_index]);
        }
        right[buildarray.length-1]=buildarray[buildarray.length-1];
        for (int right_index=buildarray.length-2;right_index>=0;right_index--){
            right[right_index]=Math.max(right[right_index+1],buildarray[right_index]);
        }
        for(int curr_index=0;curr_index<buildarray.length;curr_index++){
            water_units+=(Math.min(left[curr_index],right[curr_index])-buildarray[curr_index]);
        }
        return water_units;
    }
    public static void main(String[] args) {
        int[] arr={5,0,5,3,2,1,4};
        System.out.println(gate_water_units(arr));
    }
}
