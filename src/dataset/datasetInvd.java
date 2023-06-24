/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class datasetInvd {
   private ArrayList<String> iddetail; 
   private ArrayList<String> namabrg; 
   private ArrayList<String> satuan; 
   private ArrayList<String> hrginvd; 
   private ArrayList<Integer> qty;
   private ArrayList<String> jmlh;
   private ArrayList<Integer> beratinvd;
   private ArrayList<String> jmlberat;
   
    public datasetInvd(){
    iddetail = new ArrayList<>();
    namabrg = new ArrayList<>();
    satuan = new ArrayList<>();
    hrginvd = new ArrayList<>();
    qty = new ArrayList<>();
    jmlh = new ArrayList<>();
    beratinvd = new ArrayList<>();
    jmlberat = new ArrayList<>();
    }
    
    public void addIddetail(String value){
        this.iddetail.add(value);
    }
    
    public ArrayList<String> getDataIddetail(){
        return this.iddetail;
    }
    
    public void addNamabrg(String value){
        this.namabrg.add(value);
    }
    
    public ArrayList<String> getDataNamabrg(){
        return this.namabrg;
    }
    
    public void addSatuan(String value){
        this.satuan.add(value);
    }
    
    public ArrayList<String> getDataSatuan(){
        return this.satuan;
    }
    
    public void addHrginvd(String value){
        this.hrginvd.add(value);
    }
    
    public ArrayList<String> getDataHrginvd(){
        return this.hrginvd;
    }
    
    public void addQty(int value){
        this.qty.add(value);
    }
    
    public ArrayList<Integer> getDataQty(){
        return this.qty;
    }
    
    public void addJumlah(String value){
        this.jmlh.add(value);
    }
    
    public ArrayList<String> getDataJumlah(){
        return this.jmlh;
    }
    
    public void addBeratinvd(int value){
        this.beratinvd.add(value);
    }
    
    public ArrayList<Integer> getDataBeratinvd(){
        return this.beratinvd;
    }
    
    public void addJmlberat(String value){
        this.jmlberat.add(value);
    }
    
    public ArrayList<String> getDataJmlberat(){
        return this.jmlberat;
    } 
    
    public void TambahInvd(String iddetail, String namabrg, String satuan,
            String hrginvd, int qty, String jmlh, int beratinvd, String jmlberat){
        addIddetail(iddetail);
        addNamabrg(namabrg);
        addSatuan(satuan);
        addHrginvd(hrginvd);
        addQty(qty);
        addJumlah(jmlh);
        addBeratinvd(beratinvd);
        addJmlberat(jmlberat);
    }
}
