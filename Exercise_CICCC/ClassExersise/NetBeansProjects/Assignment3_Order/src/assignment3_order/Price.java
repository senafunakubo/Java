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
    
    Price(int syo, int chiku, int bai){
      this.syo = syo;
      this.chiku = chiku;
      this.bai = bai;
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
    
    public void setSyo(int syo){
        this.syo = syo;
    }
    
    public void setChiku(int chiku){
        this.chiku = chiku;
    }
    
    public void setBai(int bai){
        this.bai = bai;
    }
    
    Price getPrice(){
        return price;
    }
    
}
