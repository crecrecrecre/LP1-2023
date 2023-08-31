package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeEmpresa;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "departamento_id")
    private List<Departamentos> departamentos;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.departamentos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public List<Departamentos> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamentos> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", departamentos=" + departamentos +
                '}';
    }
}
