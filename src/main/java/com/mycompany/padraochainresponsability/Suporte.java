/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraochainresponsability;



/**
 *
 * @author 20211stads025
 */
public class Suporte implements Setor{
    private Setor proximo;
    
    @Override
    public void tratarProblema(Solicitacao solicitacao) {
        if (solicitacao.getTipo() == TipoProblema.devolucao){
            System.out.println("Setor de suporte tratou a requisicao");
        }
        else {
            proximo.tratarProblema(solicitacao);
        }
    }

    @Override
    public void setProximo(Setor proximo) {
        this.proximo = proximo;
    }
    
    
    
    
}
