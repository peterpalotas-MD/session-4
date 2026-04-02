package Tasks;

import java.util.HashMap;

//I implemented thi using a dynamic progrmming approach to make my simple function fro m before run for larger numbers

//should get nTh fibonnachi number in very good time complexity. i SACRIFICED SOme space compelxity for it by storing a memoization hash map
public class Fibonacci {


    //n : result
    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int nthFib(int n) {
        if (n <= 1) return n;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = nthFib(n - 1) + nthFib(n - 2);
        memo.put(n, result);
        return result;
    }


    public static void main(String[] args) {
        System.out.println(nthFib(25));
    }
}

