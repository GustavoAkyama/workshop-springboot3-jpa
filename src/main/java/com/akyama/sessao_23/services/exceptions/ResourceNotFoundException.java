package com.akyama.sessao_23.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVerionsUID = 1L;

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id " + id);
    }
}
