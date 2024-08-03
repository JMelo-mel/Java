package Xadrez;

import Tabuleiro.Posicao;
import Tabuleiro.Tabuleiro;
import Xadrez.XadrezPecas.Rei;
import Xadrez.XadrezPecas.Torre;

public class XadrezPartida {
    private Tabuleiro tabuleiro;

    public XadrezPartida(){
        tabuleiro = new Tabuleiro(8, 8);
        setupInicial();
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

    private void setupInicial(){
        tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.BRANCO) , new Posicao(2,1));
        tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.PRETO) , new Posicao(0,4));
        tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BRANCO) , new Posicao(7,4));
    }
}
