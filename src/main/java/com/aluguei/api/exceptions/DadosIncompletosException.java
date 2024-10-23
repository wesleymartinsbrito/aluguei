package com.aluguei.api.exceptions;

public class DadosIncompletosException extends RuntimeException{
    public DadosIncompletosException(){
        super("Não foi possível criar, dados incompletos.");
    }
    public DadosIncompletosException(String message){
        super(message);
    }
}
