package model;

public class Noticia implements  java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String descricao;
	private String titulo;
	private String texto;
	
	//construtores
	public Noticia() {
		
	}
	public Noticia(int id, String descricao, String titulo, String texto) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.titulo = titulo;
		this.texto = texto;
	}
	//metodos de acesso
	public int getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getTexto() {
		return texto;
	}
	
	
	//metodos de modificadores
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	

}
