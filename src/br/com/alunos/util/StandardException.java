/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alunos.util;

/**
 *
 * @author lucas
 */
class StandardException extends Exception {
    public StandardException() {
        
    }
    
    public StandardException(String arg0) {
        super(arg0);
    }
    
    public StandardException(Throwable arg0) {
        super(arg0);
    }
    
    public StandardException(String arg0, Throwable arg1) {
        super(arg0,arg1);
    }
}
