package br.com.coder.exercicios_sb.models.entities;

public class Cliente {
    

    private Long id;
    private String nome;
    private String cpf;

    public Cliente(int id, String nome, String cpf){
        super();
        this.id = (long) id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpg() {
        return cpf;
    }
    public void setCpg(String cpf) {
        this.cpf = cpf;
    }
    
}
