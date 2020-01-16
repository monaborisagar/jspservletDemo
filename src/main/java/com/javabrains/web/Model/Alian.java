package com.javabrains.web.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alian")
public class Alian {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "aid")
    private int aid;

    @Column(name = "aname")
    private String aname;

    @Column(name = "tech")
    private String tech;
    
    
    public Alian()
    {
    	
    }
    public Alian(int aid, String aname, String tech) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.tech = tech;
	}

      //getter setter
	  public int getId() { return id; }
	public void setId(int id) { this.id = id; }
	  public int getAid() { return aid; }
	  public void setAid(int aid) { this.aid = aid; }
	  public String getAname() { return aname; }
	  public void setAname(String aname) { this.aname = aname; }
	  public String getTech() { return tech; }
	  public void setTech(String tech) { this.tech = tech; }
	@Override
	public String toString() {
		return "Alian [id=" + id + ", aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	 
	
	
	/*
	 * private int aid; private String aname; private String tech;
	 * 
	 * public int getAid() { return aid; }
	 * 
	 * public void setAid(int aid) { this.aid = aid; }
	 * 
	 * public String getAname() { return aname; }
	 * 
	 * public void setAname(String aname) { this.aname = aname; }
	 * 
	 * public String getTech() { return tech; }
	 * 
	 * public void setTech(String tech) { this.tech = tech; }
	 * 
	 * @Override public String toString() { return "Alian [aid=" + aid + ", aname="
	 * + aname + ", tech=" + tech + "]"; }
	 */
	  
	 
}
