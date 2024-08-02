package Aplicacao;

import Xadrez.XadrezPartida;

public class App {
    public static void main(String[] args) throws Exception {
        
        XadrezPartida xadrezpartida = new XadrezPartida();
        IU.imprimirTabuleiro(xadrezpartida.getPecas());
    }
}
