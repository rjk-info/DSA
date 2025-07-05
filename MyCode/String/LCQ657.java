/*
 * LeetCode Problem 657: Robot Return to Origin
 * Given a string moves representing the directions the robot moves,
 * determine if the robot returns to the origin (0, 0).
 * The moves string contains characters 'U', 'D', 'L', and 'R'
 * representing Up, Down, Left, and Right respectively.
 * The robot starts at the origin (0, 0) and moves according to the string
 * moves.
 * * The robot returns to the origin if the net movement in both x and y
 * directions is zero.
 * * Example:
 * Input: moves = "UDLR"
 * Output: true
 */

class LCQ657 {
    public boolean judgeCircle(String moves) {
        int x = 0,y = 0;
        for(int i = 0; i<moves.length(); i++){
            char dis = moves.charAt(i);
            if(dis == 'D'){
                y--;
            }
            else if(dis == 'U'){
                y++;
            }
            else if(dis == 'L'){
                x--;
            }
            else{
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}