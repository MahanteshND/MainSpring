package com.ami.org.Dto.CountryDto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.ami.org.util.Constructor;
@Entity
@Table(name="Country_table")
public class CountrydDTO implements Serializable {
    @Id
    @GenericGenerator(name="myid",strategy="increment")
    @GeneratedValue(generator="myid")
    private int id;
    @Column(name="t_countryname")
	private String countryname;
    @Column(name="t_countrycode")
    private String countrycode;
	@Column(name="t_capital")
    private String capital;
	public CountrydDTO() {
Constructor.message(getClass());
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
}
