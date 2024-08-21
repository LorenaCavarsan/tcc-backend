package smart.senaigame.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Questao")
public class Questao{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idQuestao;
    private String enunciado;
    private String texto_apoio;
    private String comando;

    @ManyToOne
    @JoinColumn(name = "processo_seletivo_id")
    private ProcessSeletivo processoSeletivo;

    @OneToMany(mappedBy = "questao", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Alternativa> alternativas;


    public Questao() {
    }

    public void setIdQuestao(Integer idQuestao) {
        this.idQuestao = idQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getTexto_apoio() {
        return texto_apoio;
    }

    public void setTexto_apoio(String texto_apoio) {
        this.texto_apoio = texto_apoio;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
}
