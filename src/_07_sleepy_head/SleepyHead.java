package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation = false;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         */
        int weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if(weekday == 0) {
        	isWeekday = true;
        }else if(weekday == 1) {
        	isWeekday = false;
        }
        int vacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        if(vacation == 0) {
        	isWeekday = true;
        }else if(vacation == 1) {
        	isWeekday = false;
        }
        if(isWeekday = false || isVacation == true) {
        JOptionPane.showConfirmDialog(null, "Sleep In");
        } {
        	JOptionPane.showConfirmDialog(null, "Get up Lazybones");
        }
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
