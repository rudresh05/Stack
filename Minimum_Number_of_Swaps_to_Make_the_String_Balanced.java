package Stack;

public class Minimum_Number_of_Swaps_to_Make_the_String_Balanced {
    public static int minimum_Number_of_Swaps_to_Make_the_String_Balanced(String s){
        int bal =0;
        int imbal=0; 
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(ch=='['){
                bal++;
            }
            else{
                if(bal>0){
                    bal--;
                }
                else{
                    imbal++;
                }
            }
        }
        return (imbal+1)/2;
    }
    public static void main(String[] args){
        String s = "]]][[[";
        System.out.print(minimum_Number_of_Swaps_to_Make_the_String_Balanced(s));
    }
}
