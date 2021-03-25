package com.juaracoding.main.model;

public class KPRDataPost {
	
	private String df;
    private int lamapijaman ;
    private int platfond ;
    private double bunga ;
  
    
    public KPRDataPost() {
    	
    }


	public KPRDataPost(String df, int lamapijaman, int platfond, double bunga) {
		super();
		this.df = df;
		this.lamapijaman = lamapijaman;
		this.platfond = platfond;
		this.bunga = bunga;
	}


	public String getDf() {
		return df;
	}


	public void setDf(String df) {
		this.df = df;
	}


	public int getLamapijaman() {
		return lamapijaman;
	}


	public void setLamapijaman(int lamapijaman) {
		this.lamapijaman = lamapijaman;
	}


	public int getPlatfond() {
		return platfond;
	}


	public void setPlatfond(int platfond) {
		this.platfond = platfond;
	}


	public double getBunga() {
		return bunga;
	}


	public void setBunga(double bunga) {
		this.bunga = bunga;
	}
    
    
    
    
	

}
