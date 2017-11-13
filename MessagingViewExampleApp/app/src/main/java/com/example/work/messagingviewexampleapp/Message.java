package com.example.work.messagingviewexampleapp;

/**
 * Created by work on 11/13/17.
 */

class Message {

    String message;

    User sender;

    long createdAt;

    boolean isMine;

    public Message() {
    }

    public Message(String message, User sender, long createdAt, boolean isMine) {
        this.message = message;
        this.sender = sender;
        this.createdAt = createdAt;
        this.isMine = isMine;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isMine() {
        return isMine;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }
}