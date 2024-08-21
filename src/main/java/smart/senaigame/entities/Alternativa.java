package smart.senaigame.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "alternativas")
public class Alternativa {
    @Id
    private Integer id;
    private String texto;
    private boolean correta;

    public Alternativa() {
    }

    @ManyToOne
    @JoinColumn(name = "questao_id")
    private Questao questao;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isCorreta() {
        return correta;
    }

    public void setCorreta(boolean correta) {
        this.correta = correta;
    }
}