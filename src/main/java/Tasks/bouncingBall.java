package Tasks;


/*

A child is playing with a ball on the nth floor of a tall building.
 The height h of this floor is known. He drops the ball out of the window.
 The ball bounces to two thirds of it's height, i.e. 0.66.
  His brother looks on from a window that is 1.5m from the ground.

How many times will the brother see the ball pass his window (including the time the ball falls and whilst its bouncing)?
Assume you have the following arguments to your function:
h is a float that is greater than 0
bounce is a float that is greater than 0 and less than 1
window must be less than h
If all of the above argument criterias are matched, return the outcome of occurrences, as an integer, otherwise return -1

 */
public class bouncingBall {

    /**
     * this is the function outlined in the question, below are the contraints
     *
     * @param h      is a float that is greater than 0
     * @param bounce is a float that is greater than 0 and less than 1
     * @param window should be less then h
     * @return returns how many timnes the brother sees the ball bounce
     */

    public static int ballBounce(double h, double bounce, double window) {

        //ill start by checkign if the conditions are correct, if not i will return a generic error
        // if i wanted to, I could make an error thats more descriptive but I am abstracting it so I can get to the harder tasks easier
        if (h < 0 || bounce < 0 || bounce > 1 || window > h) {
            System.out.println("You didnt meet the conditions!");
            return -1;
        }
        //I'll return if its time to stop counting
        int bounceCount = 0;
        while (true) {
            h *= (bounce);
            if(h > window){
                bounceCount+=1;
            }else{
                return bounceCount;
            }

        }

    }
    static void main(String[] args) {
        System.out.println((ballBounce(10, 0.66, 1.5)));
    }
}


