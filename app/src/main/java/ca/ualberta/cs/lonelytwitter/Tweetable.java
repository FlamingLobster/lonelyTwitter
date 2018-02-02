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

/**
 * provides functions for Tweetable objects
 * Tweetable objects contain messages and corresponding setter and getter for message
 */
public interface Tweetable {
    /**
     * getter for message
     * @return message of the object
     */
    public String getMessage();

    /**
     * setter for message
     * @param message - the message of the object
     * @throws TweetTooLongException - throw when message exceeds 140 characters
     */
    public void setMessage(String message) throws TweetTooLongException;
}
