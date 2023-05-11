public class dono {
    private String nome_dono;
    private String cpf_dono;

    public dono (String nome_dono, String cpf_dono){
        this.nome_dono = nome_dono;
        this.cpf_dono = cpf_dono;
    }

    public String getNome_dono() {
        return nome_dono;
    }

    public String getCpf_dono() {
        return cpf_dono;
    }

    public void setNome_dono(String nome_dono) {
        this.nome_dono = nome_dono;
    }

    public void setCpf_dono(String cpf_dono) {
        this.cpf_dono = cpf_dono;
    }
}
