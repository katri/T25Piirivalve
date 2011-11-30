package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.OBJEKT;

/**
 * Entity implementation class for Entity: PIIRIRIKKUJA
 *
 */
@Entity
@RooToString
@RooEntity

public class PIIRIRIKKUJA extends BaseEntity implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long piiririkkuja_ID;
	@Size(min = 1, max = 20)
	@NotNull
	private String isikukood;
	@Size(min = 1, max = 25)
	@NotNull
	private String eesnimi;
	@Size(min = 1, max = 35)
	@NotNull
	private String perenimi;
	@NotNull
	private char sugu;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date synniaeg;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private OBJEKT oBJEKT;

	public PIIRIRIKKUJA() {
		super();
	}   
	public Long getPiiririkkuja_ID() {
		return this.piiririkkuja_ID;
	}

	public void setPiiririkkuja_ID(Long piiririkkuja_ID) {
		this.piiririkkuja_ID = piiririkkuja_ID;
	}   
	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}   
	public String getEesnimi() {
		return this.eesnimi;
	}

	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}   
	public String getPerenimi() {
		return this.perenimi;
	}

	public void setPerenimi(String perenimi) {
		this.perenimi = perenimi;
	}   
	public char getSugu() {
		return this.sugu;
	}

	public void setSugu(char sugu) {
		this.sugu = sugu;
	}   
	public Date getSynniaeg() {
		return this.synniaeg;
	}

	public void setSynniaeg(Date synniaeg) {
		this.synniaeg = synniaeg;
	}
	public OBJEKT getOBJEKT() {
	    return oBJEKT;
	}
	public void setOBJEKT(OBJEKT param) {
	    this.oBJEKT = param;
	}
   
}