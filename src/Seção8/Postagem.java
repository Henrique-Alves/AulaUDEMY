package Seção8;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {
	
	private static SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date data;
	private String titulo;
	private String conteudo;
	private Integer curtir;
	
	private List<Comente> comentes = new ArrayList<>();
	
	public Postagem() {
		
	}

	public Postagem(Date data, String titulo, String conteudo, Integer curtir) {
		this.data = data;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.curtir = curtir;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getCurtir() {
		return curtir;
	}

	public void setCurtir(Integer curtir) {
		this.curtir = curtir;
	}

	public List<Comente> getComentes() {
		return comentes;
	}

	public void addComente(Comente comente) {
		comentes.add(comente);
	}
	public void removeComente(Comente comente) {
		comentes.remove(comente);
	}

	public String toString() {
		StringBuilder ha = new StringBuilder();
		ha.append(titulo + "/n");
		ha.append(curtir);
		ha.append(" curtidas - ");
		ha.append(dt.format(data) + "/n " );
		ha.append(conteudo + "/n ");
		ha.append(comentes + "/n ");
		for(Comente c: comentes){
			
			ha.append(c.getComent());
		}
		return ha.toString();
	}
	
	

	

	
	
	

}
