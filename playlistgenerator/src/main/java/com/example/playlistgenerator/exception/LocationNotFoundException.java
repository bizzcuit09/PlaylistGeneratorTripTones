package com.example.playlistgenerator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class LocationNotFoundException extends RuntimeException
{
    public LocationNotFoundException(String exception) {
        super(exception);
    }
}
