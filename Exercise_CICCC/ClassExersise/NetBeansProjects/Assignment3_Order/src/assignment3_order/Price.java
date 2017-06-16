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
    
    public String getSyo(){
        String syoSt = Integer.toString(syo);
        return syoSt;
    }
    
    public String getChiku(){
        String chikuSt = Integer.toString(chiku);
        return chikuSt;
    }
    
    public String getBai(){
        String baiSt = Integer.toString(bai);
        return baiSt;
    }
    
    Price getPrice(){
        return price;
    }
    
}
