import java.util.Scanner;
public class _41Array {

  public static int StringSearch(String names[] , String key) {
    for(int i=0 ; i<names.length ; i++) {
      if(names[i].equals(key)) {
        return i ;
  } 
  }
  return -1 ;
  }
  
  public static void main(String[] args) {
    String [] names = {"John", "Mary", "David", "Emma"};
    String key = "Mary";

    int index = StringSearch(names,key);
    if (index == -1) {
      System.out.println("not found");
    }else {
      System.out.println("found at index "+index);
    }
  }
}
