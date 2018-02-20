package br.com.fiap.jpa.entity;

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

@Entity
@Table(name="T_TURMA")
@SequenceGenerator(name="turma",sequenceName="SQ_T_TURMA",allocationSize=1)
public class Turma {

	@Id
	@Column(name="cd_turma")
	@GeneratedValue(generator="turma", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_turma",nullable=false,length=100)
	private String nome;
	
	@Column(name="vl_turma",nullable=false)
	private float valorMensalidade;
	
	@Column(name="nr_total_vaga",nullable=false)
	private int numeroVagas;
	
	@Column(name="st_ead",nullable=false)
	private boolean ead;
	
	@Lob//grava arquivo no 
	@Column(name="fl_grade")
	private byte[] fotoGrade;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_criacao")
	private Calendar dataAbertura;
	
	@Enumerated(EnumType.STRING)//salva o enum como o nome mesmo não um numero
	@Column(name="ds_unidade")
	private Unidade unidade;
	
	@Enumerated(EnumType.STRING)//salva o enum como o nome mesmo não um numero
	@Column(name="ds_periodo")
	private Periodo periodo;

	
	
	public Turma() {}
	
	public Turma(String nome, float valorMensalidade, int numeroVagas, boolean ead, byte[] fotoGrade,
			Calendar dataAbertura, Unidade unidade, Periodo periodo) {
		this.nome = nome;
		this.valorMensalidade = valorMensalidade;
		this.numeroVagas = numeroVagas;
		this.ead = ead;
		this.fotoGrade = fotoGrade;
		this.dataAbertura = dataAbertura;
		this.unidade = unidade;
		this.periodo = periodo;
	}


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

	public float getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(float valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}

	public boolean isEad() {
		return ead;
	}

	public void setEad(boolean ead) {
		this.ead = ead;
	}

	public byte[] getFotoGrade() {
		return fotoGrade;
	}

	public void setFotoGrade(byte[] fotoGrade) {
		this.fotoGrade = fotoGrade;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	
	

	

}
