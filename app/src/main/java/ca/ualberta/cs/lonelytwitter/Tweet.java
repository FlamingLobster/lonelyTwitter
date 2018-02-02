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

/**
 * Represents a tweet
 *
 * @author Michael
 *
 * @version 1.0
 *
 * @see ImportantTweet
 * @see NormalTweet
 */


public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;

    Tweet(){

    }

    /**
     * construts a tweet instance using the given message
     *
     * @param message: the message of the tweet
     */
    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public Date getDate(){
        return date;

    }
    public String getMessage(){
        return message;
    }


    /**
     * set the message of the tweet
     *
     * @param message - the new message of the tweet
     * @throws TweetTooLongException - is thrown when the message is over 140 characters
     *
     * @see ImportantTweet
     * @see NormalTweet
     */
    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();

    @Override
    public String toString(){
        return message;
    }
}
