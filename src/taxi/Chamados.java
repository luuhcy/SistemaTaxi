/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxi;

import java.util.ArrayList;

/**
 *
 * @author Lucy
 */
public class Chamados {
    
    private int idChamado;
    private int dataChamado;
    private String tipoChamado;
    private String origemChamado;
    private String destinoChamado;
    
    //Referencia aos objetos associados
    private ArrayList<Cliente> clientes;

    public Chamados() {
        this.clientes = new ArrayList();
    }

    public Chamados(int idChamado, int dataChamado, String tipoChamado, String origemChamado, String destinoChamado) {
        this.idChamado = idChamado;
        this.dataChamado = dataChamado;
        this.tipoChamado = tipoChamado;
        this.origemChamado = origemChamado;
        this.destinoChamado = destinoChamado;
        this.clientes = new ArrayList();
    }
    
    

    // Getter e Setter para idChamado
    public int getIdChamado() {
        return idChamado;
    }

    public void setIdChamado(int idChamado) {
        this.idChamado = idChamado;
    }

    // Getter e Setter para dataChamado
    public int getDataChamado() {
        return dataChamado;
    }

    public void setDataChamado(int dataChamado) {
        this.dataChamado = dataChamado;
    }

    // Getter e Setter para tipoChamado
    public String getTipoChamado() {
        return tipoChamado;
    }

    public void setTipoChamado(String tipoChamado) {
        this.tipoChamado = tipoChamado;
    }

    // Getter e Setter para origemChamado
    public String getOrigemChamado() {
        return origemChamado;
    }

    public void setOrigemChamado(String origemChamado) {
        this.origemChamado = origemChamado;
    }

    // Getter e Setter para destinoChamado
    public String getDestinoChamado() {
        return destinoChamado;
    }

    public void setDestinoChamado(String destinoChamado) {
        this.destinoChamado = destinoChamado;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void inserirCliente(Cliente cli) {
        this.clientes.add(cli);
    }
    
    
}
