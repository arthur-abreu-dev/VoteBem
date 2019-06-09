package votebem.domain.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, String> senha;
	public static volatile SingularAttribute<Usuario, Integer> idUsuario;
	public static volatile SingularAttribute<Usuario, Integer> pontos;
	public static volatile SingularAttribute<Usuario, String> nomeUsu;
	public static volatile SingularAttribute<Usuario, String> sexo;
	public static volatile SingularAttribute<Usuario, String> email;

}

