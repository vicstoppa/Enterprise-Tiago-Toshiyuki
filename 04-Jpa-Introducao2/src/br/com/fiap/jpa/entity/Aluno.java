package br.com.fiap.jpa.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

//transforma a classe em uma entidade do banco
@Entity
//altera o nome da tabela no banco
@Table(name="T_ALUNO")
//gera uma sequencia autom�tica para a cria��o somente ORACLE utiliza
@SequenceGenerator(name="aluno",sequenceName="SQ_T_ALUNO",allocationSize=1)
public class Aluno implements Serializable {
	
	//chave primaria
	@Id
	//nome da coluna
	@Column(name="cd_aluno")
	//gera o valor sequencial para chave primaria
	@GeneratedValue(generator="aluno", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	//nullable n�o deixa a coluna ser nula length define o tamanho
	@Column(name="nm_aluno", nullable=false,length=50)
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)//Captura data e Hora (utilizar TIME para capturar apenas data)
	@Column(name="dt_matricula")
	private Calendar dataDatricula;
	
	@Column(name="st_bolsa",nullable=false)
	private boolean bolsista;

	@Column(name="vl_desconto")
	private int desconto;
	
	@Column(name="ds_turma")
	private String turma;
	
	@Transient //n�o ser� uma coluna no banco.
	private float media;
	
	@Enumerated(EnumType.STRING)//salva o enum como o nome mesmo n�o um numero
	@Column(name="ds_genero")
	private Genero genero;
	
	@Column(name="vl_mensalidade")
	private float mensalidade;
	
	@Lob//grava arquivo no banco.
	@Column(name="fl_foto")
	private byte[] foto;


	public float getMensalidade() {
		return mensalidade;
	}
	
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	
	public Aluno() {}

	public Aluno(String nome, Calendar dataDatricula, boolean bolsista, int desconto, String turma, float media,
			Genero genero, float mensalidade,byte[] foto) {
		this.nome = nome;
		this.dataDatricula = dataDatricula;
		this.bolsista = bolsista;
		this.desconto = desconto;
		this.turma = turma;
		this.media = media;
		this.genero = genero;
		this.mensalidade = mensalidade;
		this.foto = foto;
		
	}

	//come�o de Get e Set
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataDatricula() {
		return dataDatricula;
	}

	public void setDataDatricula(Calendar dataDatricula) {
		this.dataDatricula = dataDatricula;
	}

	public boolean isBolsista() {
		return bolsista;
	}

	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
	
}
