package ee.itcollege.T25Piirivalve.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.tostring.RooToString;
import ee.itcollege.T25Piirivalve.entities.SEADUS;

/**
 * Entity implementation class for Entity: OBJEKTI_SEADUS_INTSIDENDIS
 *
 */
@Entity
@RooToString
@RooEntity

public class ISIKU_SEADUS_INTSIDENDIS extends BaseEntity implements Serializable {

	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	@NotNull
	private Date kuni;
	@NotNull
	private String kirjeldus;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private ISIK_INTSIDENDIS iSIK_INTSIDENDIS;
	@ManyToOne
	private SEADUS sEADUS;
	public ISIKU_SEADUS_INTSIDENDIS() {
		super();
	}
	
	public Date getAlates() {
		return this.alates;
	}

	public void setAlates(Date alates) {
		this.alates = alates;
	}   
	public Date getKuni() {
		return this.kuni;
	}

	public void setKuni(Date kuni) {
		this.kuni = kuni;
	}
	public String getKirjeldus() {
		return kirjeldus;
	}
	public void setKirjeldus(String kirjeldus) {
		this.kirjeldus = kirjeldus;
	}
	public ISIK_INTSIDENDIS getISIK_INTSIDENDIS() {
	    return iSIK_INTSIDENDIS;
	}
	public void setISIK_INTSIDENDIS(ISIK_INTSIDENDIS param) {
	    this.iSIK_INTSIDENDIS = param;
	}
	public SEADUS getSEADUS() {
	    return sEADUS;
	}
	public void setSEADUS(SEADUS param) {
	    this.sEADUS = param;
	}
   
}
