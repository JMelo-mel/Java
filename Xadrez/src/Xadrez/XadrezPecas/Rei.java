package Xadrez.XadrezPecas;

import Tabuleiro.Tabuleiro;
import Xadrez.Cor;
import Xadrez.XadrezPeca;

public class Rei extends XadrezPeca{
    public Rei (Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro, cor);
    }

    @Override
    public String toString(){
        return "R";
    }
}
