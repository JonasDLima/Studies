package com.example.implement_treating_exceptions;

import com.example.implement_treating_exceptions.exceptions.ErroValidacao;

public class Main {
    public static void main(String[] args) {
        OperacaoArray calc = new OperacaoArray ();
        char[] op1 = null;
        char[] op2 = null;
        try {
            // op1 = new char [Short.MAX_VALUE];
            // op2 = new char [Short.MAX_VALUE];
        } catch ( OutOfMemoryError e ) {
            Runtime runtime = Runtime.getRuntime ();
            System.out.println ( "Memória insuficiente!" );
            System.out.println ( "A memória total da MVJ eh " + 
            runtime.totalMemory() + " eo máximo eh " +
            runtime.maxMemory() );
            System.out.println ( "Reconfigure a MVJ usando o parametro -Xmx<size>, Você precisa de " +
            16*Short.MAX_VALUE + " soh para os vetores." );
            System.exit ( -1 );
        }

        try {
            calc.concatenarArray ( op1 , op2 );
        } catch (ErroValidacao e) {
            System.out.println( "Um erro ocorreu: " + e.getMessage() );
            System.out.println( "Causa raiz: " + e.getCause().getMessage() );
        }
    }
}