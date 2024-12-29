/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxi;

import java.util.ArrayList;

public class Cliente {
    //atributos
    private int id;
    private String Rg;
    private long Cpf;
    private String Nome;
    private int Telefone;
    
    //referencia aos objetos associados
    private ArrayList<Chamados> chamados;
 
    
    public Cliente() {
        this.chamados = new ArrayList();
    }

    public Cliente(int id, String Rg, long Cpf, String Nome, int Telefone) {
        this.id = id;
        this.Rg = Rg;
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.chamados = new ArrayList();
    }

    
    
    //metódos especiais
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public long getCpf() {
        return Cpf;
    }

    public void setCpf(long Cpf) {
        this.Cpf = Cpf;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public ArrayList<Chamados> getChamados() {
        return chamados;
    }

    public void setChamados(ArrayList<Chamados> chamados) {
        this.chamados = chamados;
    }
    
    public void inserirChamado(Chamados cha){
        this.chamados.add(cha);
        
    }
}