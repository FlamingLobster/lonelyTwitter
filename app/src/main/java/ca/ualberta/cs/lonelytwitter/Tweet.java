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
     * @param message - the message of the tweet
     */
    public Tweet(String message){
        this.message = message;
    }

    /**
     * construts a tweet instance using given message and given date
     * @param message - the message of the tweet
     * @param date - the date of the tweet
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * getter for the date of the tweet
     * @return the date of the tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     * getter for the message of the tweet
     * @return the message of the tweet
     */
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

    /**
     * set the date of the tweet
     * @param date - the date of the tweet
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * flag for is the tweet important
     * @return true if tweet is important, false otherwise
     */
    public abstract boolean isImportant();

    /**
     * overrides toString() by returning messsage of the tweet
     * @return message of the tweet
     */
    @Override
    public String toString(){
        return message;
    }
}
