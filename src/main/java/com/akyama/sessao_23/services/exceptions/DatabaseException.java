package com.akyama.sessao_23.services.exceptions;

public class DatabaseException extends RuntimeException{
        private static final long serialVerionsUID = 1L;

        public DatabaseException(String msg){
            super(msg);
        }
}
