package smart.senaigame.entities;


import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Table(name = "Processo_Seletivo")
@Entity

public class ProcessSeletivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private String subTitulo;
    private String categoria;

    @Column(updatable = false)
    private String semestre;

    @Column(updatable = false)
    private String ano;

    @OneToMany(mappedBy = "processoSeletivo", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Questao> questoes;


    public ProcessSeletivo() {
    }

    public ProcessSeletivo(Integer id, String titulo, String subTitulo, String categoria, String semestre, String ano) {
        this.id = id;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.categoria = categoria;
        this.semestre = semestre;
        this.ano = ano;
    }

    public ProcessSeletivo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

}
