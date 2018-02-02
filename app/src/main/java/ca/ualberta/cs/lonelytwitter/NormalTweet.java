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

public class NormalTweet extends Tweet {

    /**
     * constructor a tweet instance with message
     * @param message - messsage of the tweet
     */
    NormalTweet(String message){ super(message); }

    /**
     * constructd a tweet instance with message and date
     * @param message - message of the tweet
     * @param date - date of the tweet
     */
    NormalTweet(String message, Date date){
        super(message,date);
    }

    /**
     * flag used to keep track of importance of tweet
     * @return true if false if tweet is NormalTweet
     * @see ImportantTweet
     */
    @Override
    public boolean isImportant(){
        return false;
    }
}
