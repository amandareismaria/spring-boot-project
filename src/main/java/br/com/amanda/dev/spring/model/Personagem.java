package br.com.amanda.dev.spring.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_PERSONAGEM", schema = "ANM")
public class Personagem implements Serializable {

	private static final long serialVersionUID = 304L;
	
	@Id
	@Column(name = "COD_PERSONAGEM")
	private Long codigoPersongem;
	
	@Column(name = "NM_PERSONAGEM")
	private String nomePersonagem;
	
	@Column(name = "IDADE_PERSNG")
	private Integer idadePersonagem;	
	
	@Column(name = "DH_INCL_REGT")
	private LocalDateTime dataHoraInclusaoRegistro;
	
	@Column(name = "DH_ULTI_ATLZ")
	private LocalDateTime dataHoraUltimaAtualizacao;


}
