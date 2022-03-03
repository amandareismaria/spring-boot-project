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
@Table(name = "TB_TEMPRD", schema = "ANM")
public class Temporada implements Serializable {

	private static final long serialVersionUID = 44L;
	
	@Id
	@Column(name = "COD_TEMP")
	private Long codigoTemporada;
	
	@Column(name = "DESC_TEMPRD")
	private String descricaoTemporada;
	
	@Column(name = "QT_TT_EPI_TEMPRD")
	private Integer quantidadeTotalEpisodioTemporada;

	@Column(name = "COD_STUDIO")
	private Long codigoStudio;
	
	@Column(name = "DH_INCL_REGT")
	private LocalDateTime dataHoraInclusaoRegistro;
	
	@Column(name = "DH_ULTI_ATLZ")
	private LocalDateTime dataHoraUltimaAtualizacao;
}
