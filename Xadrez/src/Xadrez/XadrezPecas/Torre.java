package Xadrez.XadrezPecas;

import Tabuleiro.Tabuleiro;
import Xadrez.Cor;
import Xadrez.XadrezPeca;

public class Torre extends XadrezPeca {
    public Torre(Tabuleiro tabuleiro,Cor cor){
        super(tabuleiro, cor);
    }

    @Override
    public String toString(){
        return "T";
    } 
}
