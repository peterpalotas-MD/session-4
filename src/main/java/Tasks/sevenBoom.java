package Tasks;


/*

Create a Method that takes an array of numbers and returns the word ‘Boom!’ if the number 7 appears in the array. Otherwise return ‘No booming here’.

Examples:
sevenBoom([1, 2, 3, 5, 7]) => ‘Boom!’
sevenBoom([1, 2, 3, 5, 9]) => ‘No booming here’
sevenBoom([1, 2, 3, 5, 97]) => ‘Boom!’
sevenBoom([1, 2, 3, 5, 79]) => ‘Boom!’

ALL THESE TESTS HAVE PASSED, algo works
 */
public class sevenBoom {



    public static String boom(int[] theList){


        //i pop the last digit off x, to check each number digit by digit for a 7
        for(int x : theList){
            while(x>0) {
                int check = x%10;
                if (check == 7) {
                    return "Boom!";
                }
                x/=10;
            }
        }
        return "No booming here";

    }
    static void main(String[] args) {
        System.out.println( boom(new int[] {1, 2, 3, 5, 7}));
        System.out.println( boom(new int[] {1, 2, 3, 5, 9}));
        System.out.println( boom(new int[] {1, 2, 3, 5, 97}));
    }
}
