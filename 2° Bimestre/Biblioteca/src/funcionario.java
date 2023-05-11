public class funcionario {
    private String nome_func;
    private String cpf_func;

    public funcionario(String nome_func, String cpf_func){
        this.nome_func = nome_func;
        this.cpf_func = cpf_func;

    }

    public String getNome_func() {
        return nome_func;
    }

    public String getCpf_func() {
        return cpf_func;
    }

    public void setNome_func(String nome_func) {
        this.nome_func = nome_func;
    }

    public void setCpf_func(String cpf_func) {
        this.cpf_func = cpf_func;
    }
}
