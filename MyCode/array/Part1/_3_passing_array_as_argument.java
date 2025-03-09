// package MyCode.array.Part1;

public class _3_passing_array_as_argument {

    public static void Update(int marks[] , int notChange) {
        notChange = notChange + 10 ;
        for(int i = 0 ; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97 , 98 , 99} ;
        int notChange = 5 ;
        Update(marks , notChange);
        System.out.println("value after passing function = "+notChange);
        for(int i = 0 ; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}

// Note : array ko function me pass karne hai to bas array me value update hoga  , agar hum es jagh kisi variable ko pass karenge to us ka value change nhi hoga 