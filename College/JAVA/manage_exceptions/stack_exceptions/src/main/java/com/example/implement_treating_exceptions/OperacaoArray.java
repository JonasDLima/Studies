package com.example.implement_treating_exceptions;

import com.example.implement_treating_exceptions.exceptions.ErroValidacao;

public class OperacaoArray {
    public char[] concatenarArray ( char[] op1 , char[] op2 ) throws ErroValidacao {
        int tamnh_res;

        try {
            if ( op1 == null || op2 == null ) {
                throw new NullPointerException( "Os parâmetros não podem ser arrays não alocados" );
            }
            tamnh_res = op1.length + op2.length;
        } catch (NullPointerException e) {
            throw new ErroValidacao( "Foi encontrado um array inválido", e );
        }

        return copiarArray ( op1 , op2 , tamnh_res , op2.length );

    }
    private char[] copiarArray ( char[] op1 , char[] op2 ,
    int tamnh_res , int n ) {
        char[] resultado = new char [ tamnh_res ];
        System.arraycopy( op1 , 0 , resultado , 0 , op1.length );
        System.arraycopy( op2 , 0 , resultado , op1.length , n );
        return resultado;
    }
}
