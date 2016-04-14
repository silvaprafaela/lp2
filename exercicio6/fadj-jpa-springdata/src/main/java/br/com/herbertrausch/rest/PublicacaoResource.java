package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.domain.Publicacao;
import br.com.herbertrausch.domain.PublicacaoService;

@Path("/publicacao")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")

public class PublicacaoResource {
	
	public PublicacaoService publicacaoService = new PublicacaoService();
	

	
	@GET
	public List<Publicacao> get() {
		List<Publicacao> publicacao = publicacaoService.retornarTudo();
		return publicacao;
	
	}
	


	@GET
	@Path("/id/{id}")
	public Publicacao get(@PathParam("id") long id) {
		Publicacao p = publicacaoService.retornarPorChavePrimaria(id);
		return p;
	}

	
		
	@GET
	@Path("/pagina/{pagina}")
	public List<Publicacao> getByPagina(@PathParam("pagina") String pagina) {
		List<Publicacao> publicacao = publicacaoService.buscarPorPagina(pagina);
		return publicacao;	
	}
	
	@GET
	@Path("/texto/{texto}")
	public List<Publicacao> getByTexto(@PathParam("texto") String texto) {
		List<Publicacao> pubtexto = publicacaoService.buscarPorTexto(texto);
		return pubtexto;	
	}
	


}
