package org.example;

public class Conta {
    public static double saldoAtual = 0.0;
    private static double vlrDeposito = 0.0;
    private static double vlrSaque = 0.0;

    public void setSaldo(double valor){
        saldoAtual = valor;
    }
    public void setDeposito(double valor){
        vlrDeposito = valor;
    }
    public void setSaque(double valor){
        vlrSaque = valor;
    }

    public static double getSaldo(){
        return saldoAtual;
    }

    public static boolean depositar(){
        boolean resposta = false;
        if (vlrDeposito < 0) {
            System.out.println("Valor de depósito inválido.");
        } else {
            saldoAtual += vlrDeposito;
            vlrDeposito = 0.0;
            resposta = true;
        }
        return resposta;
    }

    public static boolean sacar(){
        boolean resposta = false;
        if (vlrSaque > saldoAtual) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldoAtual -= vlrSaque;
            vlrSaque = 0.0;
            resposta = true;
        }
        return resposta;
    }

}
