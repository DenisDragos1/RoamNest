package com.dailycodework.lakesidehotel.exception;
//role repository
public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
