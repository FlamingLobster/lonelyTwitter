/*
 *  Copyright © 2018 Team X, CMPUT301, University of Alberta - All Rights Reserved.
 * You may use, distribute or modify this code under terms and conditions of Code of Student Behavior at
 * University of Alberta.
 * You can find a copy of the license in this project. Otherwise, please contact contact@abc.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sajediba on 1/17/18.
 */

import java.util.Date;

public class ImportantTweet extends Tweet{

    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
       super(message,date);
    }


    @Override
    public boolean isImportant(){
        return true;
    }
}
