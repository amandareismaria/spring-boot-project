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
@Table(name = "TB_ANIME", schema = "ANM")
public class Anime implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "COD_ANIME")
	private Long codigoAnime;
	
	@Column(name = "TTL_ANIME")
	private String tituloAnime;
	
	@Column(name = "TTL_ORIG")
	private String tituloOriginal;
	
	@Column(name = "QT_TT_EPI")
	private Integer quantidadeTotalEpisodio;
	
	@Column(name = "COD_GNR")
	private Long codigoGenero;
	
	@Column(name = "COD_TEMP")
	private Long codigoTemporada;
	
	@Column(name = "COD_AUTOR")
	private Long codigoAutor;
	
	@Column(name = "COD_SUB_GNR")
	private Long codigoSubGenero;
	
	@Column(name = "COD_PERSONAGEM")
	private Long codigoPersongem;
	
	@Column(name = "DESC_STATUS")
	private String descricaoStatus;
	
	@Column(name = "COD_DUBLADOR")
	private Long codigoDublador;
	
	@Column(name = "DH_INCL_REGT")
	private LocalDateTime dataHoraInclusaoRegistro;
	
	@Column(name = "DH_ULTI_ATLZ")
	private LocalDateTime dataHoraUltimaAtualizacao;

}
