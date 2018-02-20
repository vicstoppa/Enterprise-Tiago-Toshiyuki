package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Aluno;
import br.com.fiap.jpa.entity.Genero;
import br.com.fiap.jpa.entity.Periodo;
import br.com.fiap.jpa.entity.Turma;
import br.com.fiap.jpa.entity.Unidade;

public class Teste {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("2tdsa");
		EntityManager em = fabrica.createEntityManager(); 

		//Aluno aluno = new Aluno("Victor", new GregorianCalendar(2017, Calendar.JANUARY, 2  ),false  , 0, "2TDSA" ,2, Genero.MASCULINO,1500, null);
		
		Turma turma = new Turma("2TDSA",5.0f,200,false,null, new GregorianCalendar(2017, Calendar.JANUARY,5),Unidade.ACLIMACAO,Periodo.MANHA);
		
		//em.getTransaction().begin();
		//em.persist(aluno);
		//em.getTransaction().commit();
		
		em.getTransaction().begin();
		em.persist(turma);
		em.getTransaction().commit();
		
		
				
		em.close();
		fabrica.close();
	}

}
