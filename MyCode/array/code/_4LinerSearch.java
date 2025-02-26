import java.util.Scanner;
public class _4LinerSearch {

  public static int linearSearch(int numbres[],int key){
    for(int i=0;i<numbres.length;i++) {
      if (numbres[i]==key) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    
    int numbres[] = {2,3,4,6,8,10,12,14,16} ;
    int key = 10 ;

    int index = linearSearch(numbres,key);
    if (index == -1) {
      System.out.println("not found");
    }else {
      System.out.println("found at index "+index);
    }
  }

}
