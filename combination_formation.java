package CP_package;

public class combination_formation {
    public static void print_all_decoding(String number,String output){
        if(number.length()==0){
            System.out.println(output);
            return;
        }
        String first_char=number.substring(0,1);
        int first_num=Integer.parseInt(first_char);
        if (first_num!=0){
            char character=(char)('a'+first_num-1);
            print_all_decoding(number.substring(1),output+character);

        }
        if(number.length()<=1){
            return;
        }
        int first_two_num=Integer.parseInt(number.substring(0,2));
        if (first_two_num<=26){
            if (first_two_num<=0){
                print_all_decoding(number.substring(2),output+"");
                return;
            }
            char character=(char) ('a'+first_two_num-1);
            print_all_decoding(number.substring(2),output+character);
        }
    }
    public static void main(String[] args) {
        print_all_decoding("21316","");
    }
}
