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
@Table(name = "TB_STUDIO", schema = "ANM")
public class Studio implements Serializable {

	private static final long serialVersionUID = 11L;
	
	@Id
	@Column(name = "COD_STUDIO")
	private Long codigoStudio;
	
	@Column(name = "NM_STUDIO")
	private String nomeStudio;
	
	@Column(name = "DH_INCL_REGT")
	private LocalDateTime dataHoraInclusaoRegistro;
	
	@Column(name = "DH_ULTI_ATLZ")
	private LocalDateTime dataHoraUltimaAtualizacao;

}
