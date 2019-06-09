package votebem.domain.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Questao.class)
public abstract class Questao_ {

	public static volatile SingularAttribute<Questao, Integer> idPergunta;
	public static volatile SingularAttribute<Questao, String> pergunta;
	public static volatile SingularAttribute<Questao, Tema> tema;
	public static volatile SingularAttribute<Questao, Integer> pontos;
	public static volatile ListAttribute<Questao, Resposta> respostas;

}

