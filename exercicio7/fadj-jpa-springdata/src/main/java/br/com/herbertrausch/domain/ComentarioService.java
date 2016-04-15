package br.com.herbertrausch.domain;

import java.util.List;
import org.springframework.context.ApplicationContext;
import br.com.herbertrausch.util.SpringUtil;


public class ComentarioService {

	private ComentarioRepository db;
	
	public ComentarioService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(ComentarioRepository.class);
		
	}


	public List<Comentario> retornarTudo(){
		return (List<Comentario>) db.findAll();
	}
	
	public Comentario retornarPorChavePrimaria(Long id){
		return db.findOne(id);
	}
	
	public List<Comentario> buscarPorComentario(String p){
		return db.findByComentario(p);
		
	}
	
	
}