package br.com.herbertrausch.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comentario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String comentario;
	
	
@ManyToOne
private Publicacao idPublicacao;
	

	
		
	public Long getId() {
	return id;
}




public void setId(Long id) {
	this.id = id;
}




public String getComentario() {
	return comentario;
}




public void setComentario(String comentario) {
	this.comentario = comentario;
}




public Publicacao getIdPublicacao() {
	return idPublicacao;
}




public void setIdPublicacao(Publicacao idPublicacao) {
	this.idPublicacao = idPublicacao;
}




	@Override
	public String toString() {
		return "Publicacao [id=" + id + ", comentario=" + comentario + ", idPublicacao=" + idPublicacao + "]";
	}
}
	

