package parkingCharges;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


//********THIS IS MY WORK FROM SESSION 3 AND REMAINS UNCHANGED, PASTED HERE FOR SIMPLICITY OF FINDING MY FINSIHED TASKS*********

/*
        plan
        have a variable current cost
        loop through to simulate this


        mod everything by 24 so that if they stay to like hour 25, they get billed at one
         */

//map of hour and cost
//should be int hour to int cost (costs are not decimal
public class parkingCharges {

    static void main(String[] args) {
        int cost = costOfParking(23,2);
        System.out.println(cost);
    }

    //takes in the houyr of day, and how long they parked
    public static int costOfParking(int hour, int parkingLength){

        TreeMap<Integer, Integer> timeCost = new TreeMap<>(Map.of(0,300, 5,350,10,500,15,700,20,400));

        int total = 0;
        //if 2 hrs, loop on 2, loop on 1
        while (parkingLength>0){
            hour%=24;
            total+= timeCost.get(timeCost.floorKey(hour));

            hour++;
            parkingLength--;
        }
        return total;

    }
}