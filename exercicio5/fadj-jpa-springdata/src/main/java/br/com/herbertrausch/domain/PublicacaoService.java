package br.com.herbertrausch.domain;

import java.util.List;
import org.springframework.context.ApplicationContext;
import br.com.herbertrausch.util.SpringUtil;


public class PublicacaoService {

	private PublicacaoRepository db;
	
	public PublicacaoService(){
		
		ApplicationContext context=SpringUtil.getContext();
		db = context.getBean(PublicacaoRepository.class);
		
	}


	public List<Publicacao> retornarTudo(){
		return (List<Publicacao>) db.findAll();
	}
	
	public Publicacao retornarPorChavePrimaria(Long id){
		return db.findOne(id);
	}
	
	public List<Publicacao> buscarPorPagina(String p){
		return db.findByPagina(p);
		
	}



}