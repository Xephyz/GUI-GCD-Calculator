package com.GCDCalcGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backend {

    static List<long[]> gcdE(long a, long b) {

        List<long[]> steps = new ArrayList<>();

        long[]  gcd1 = {Math.abs(a), 0, 1, 0},
                gcd2 = {Math.abs(b), 0, 0, 1};
        steps.add(gcd1);
        steps.add(gcd2);

        long temp = 1;

        while (temp != 0) {
            // Calculating rk from rk-2 mod rk-1
            long rk = steps.get(steps.size() - 2)[0] % steps.get(steps.size() - 1)[0] ;
            // Calculating qk from rounded down rk-2/rk-1
            long qk = Math.floorDiv(steps.get(steps.size() - 2)[0], steps.get(steps.size() - 1)[0]);
            // Calculating sk from sk-2 - qk*sk-1
            long sk = (steps.get(steps.size() - 2)[2] - (steps.get(steps.size() - 1)[2] * qk));
            // Calculating tk from tk-2 - qk*tk-1
            long tk = (steps.get(steps.size() - 2)[3] - (steps.get(steps.size() - 1)[3] * qk));

            long[] curr = {rk, qk, sk, tk};
            steps.add(curr);
            temp = rk;
        }

        return steps;
    }


    public static void clickDelegator(ActionEvent e, JFormattedTextField text1, JFormattedTextField text2) {
        System.out.println("v nice");
        System.out.println(text1.getValue());
        System.out.println(text2.getValue());

    }
}
