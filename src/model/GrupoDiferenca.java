/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class GrupoDiferenca {
    private String descricao;
    private Prato prato;
    private GrupoDiferenca grupoPai;
    private ArrayList<GrupoDiferenca> subGrupo;

    public Prato getPrato() {
        return prato;
    }

    public void setPrato(Prato prato) {
        this.prato = prato;
    }
    
    public GrupoDiferenca(String descricao) {
        this.descricao = descricao;
        subGrupo = new ArrayList<>();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<GrupoDiferenca> getSubGrupo() {
        return subGrupo;
    }

    public void setSubGrupo(ArrayList<GrupoDiferenca> subGrupo) {
        this.subGrupo = subGrupo;
    }

    public GrupoDiferenca getGrupoPai() {
        return grupoPai;
    }

    public void setGrupoPai(GrupoDiferenca grupoPai) {
        this.grupoPai = grupoPai;
    }

    
    
    
    
    
}
