package Xadrez;

import Tabuleiro.Tabuleiro;

public class XadrezPartida {
    private Tabuleiro tabuleiro;

    public XadrezPartida(){
        tabuleiro = new Tabuleiro(8, 8);
    }

    public XadrezPeca[][] getPecas(){
        XadrezPeca[][] mat = new XadrezPeca[tabuleiro.getLinha()][tabuleiro.getColuna()];

        for(int i=0; i<tabuleiro.getLinha();i++){
            for(int j=0; j<tabuleiro.getColuna();j++){
                mat[i][j] = (XadrezPeca) tabuleiro.peca(i,j);
            }
        }
        return mat;
    }
}
