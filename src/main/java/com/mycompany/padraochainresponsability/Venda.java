/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.padraochainresponsability;

/**
 *
 * @author 20211stads025
 */
public class Venda implements Setor{
    private Setor proximo;
    
    @Override
    public void tratarProblema(Solicitacao solicitacao) {
        if (solicitacao.getTipo() == TipoProblema.novo_pedido || solicitacao.getTipo() == TipoProblema.verificacao_bandeira){
            System.out.println("O setor de vendas tratou a requisição");
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
