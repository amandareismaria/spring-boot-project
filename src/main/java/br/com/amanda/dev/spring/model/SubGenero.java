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
@Table(name = "TB_SUB_GNR", schema = "ANM")
public class SubGenero implements Serializable {

	private static final long serialVersionUID = 60L;
	
	@Id
	@Column(name = "COD_SUB_GNR")
	private Long codigoSubGenero;
	
	@Column(name = "NM_SUB_GNR")
	private String nomeSubGenero;
	
	@Column(name = "DH_INCL_REGT")
	private LocalDateTime dataHoraInclusaoRegistro;
	
	@Column(name = "DH_ULTI_ATLZ")
	private LocalDateTime dataHoraUltimaAtualizacao;

}
