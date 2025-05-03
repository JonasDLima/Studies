package com.example.implement_treating_exceptions.exceptions;

public class ErroValidacao extends Throwable {
    public ErroValidacao ( String msg_erro ) {
        super ( msg_erro );
    }
    public ErroValidacao ( String msg_erro , Throwable causa ) {
        super ( msg_erro , causa );
    }
    public void atribuirCausa ( Throwable causa ) {
        initCause ( causa );
    }
    @Override
    public String toString ( ) {
        return "ErroValidacao: " + this.getMessage();
    }
}
