/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_order;

/**
 *
 * @author senafunakubo
 */
public class Price {
    
    private Price price;
    public  int syo;
    public  int chiku;
    public  int bai;
    public  double tax;
    public  int Dfee;
    
    Price(int syo, int chiku, int bai, double tax, int Dfee){
      this.syo = syo;
      this.chiku = chiku;
      this.bai = bai;
      this.tax = tax;
      this.Dfee = Dfee;
    }
    
    public int getSyo(){
        return syo;
    }
    
    public int getChiku(){
        return chiku;
    }
    
    public int getBai(){
        return bai;
    }
    
    public double getTax(){
        return tax;
    }
    
    public int getDfee(){
        return Dfee;
    }
    
    public void setSyo(int syo){
        this.syo = syo;
    }
    
    public void setChiku(int chiku){
        this.chiku = chiku;
    }
    
    public void setBai(int bai){
        this.bai = bai;
    }
    
    public void setTax(double tax){
        this.tax = tax;
    }
    
    public void setDfee(int Dfee){
        this.Dfee = Dfee;
    }
    
    Price getPrice(){
        return price;
    }
    
}
