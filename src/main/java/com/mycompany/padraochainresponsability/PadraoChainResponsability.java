/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.padraochainresponsability;

/**
 *
 * @author 20211stads025
 */
public class PadraoChainResponsability {

    public static void main(String[] args) {
        Solicitacao sl = new Solicitacao(TipoProblema.emissao_nota);
        Solicitacao sl2 = new Solicitacao(TipoProblema.devolucao);
        Solicitacao sl3 = new Solicitacao(TipoProblema.novo_pedido);
        Solicitacao sl4 = new Solicitacao(TipoProblema.outro);
        
        Setor suporte = new Suporte();
        Setor financeiro =  new Financeiro();
        Setor venda = new Venda();
        Setor outro = new Outros();
        
        suporte.setProximo(financeiro);
        financeiro.setProximo(venda);
        venda.setProximo(outro);

        suporte.tratarProblema(sl);
        suporte.tratarProblema(sl2);
        suporte.tratarProblema(sl3);
        suporte.tratarProblema(sl4);
        
    }
}
