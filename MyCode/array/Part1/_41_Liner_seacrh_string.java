// package MyCode.array.Part1;

public class _41_Liner_seacrh_string {

    public static int MenuSearch(String Menu[] , String traget){
        for(int i = 0 ; i<Menu.length ; i++) {
            if(Menu[i] == traget){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        String [] Menu= {"dosa" , "samosa" , "etly" , "chai" , "roti"} ;
        String traget = "chai" ;

        int index = MenuSearch(Menu, traget) ;
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("item avlavle in index no = "+ index);
        }
    }
}
