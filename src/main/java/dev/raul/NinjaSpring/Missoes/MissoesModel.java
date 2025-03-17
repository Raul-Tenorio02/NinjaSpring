package dev.raul.NinjaSpring.Missoes;

import dev.raul.NinjaSpring.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //uma missao pode ser feita por vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;



}
