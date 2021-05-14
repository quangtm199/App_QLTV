/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Book {
    private String masach;

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public String getNamXB() {
        return namXB;
    }

    public void setNamXB(String namXB) {
        this.namXB = namXB;
    }
    private String tensach;
  
     private String tacgia;
       private String NXB;
       private String theloai;
      private int giatien;
        private String namXB;
    public Book() {
        super();
    }
 
    public Book(String masach, String tensach, String tacgia, String NXB, String theloai ,int giatien, String namXB ) {
        super();
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.NXB = NXB;
        this.theloai= theloai;
        this.giatien=giatien;
        this.namXB =namXB;
    }
 
    @Override
    public String toString() {
        return "Book [masach=" + masach + ", tensach=" + tensach+ ", tacgia=" + tacgia + ", NXB=" + NXB + ", theloai="
                + theloai + " , giatien = "+ giatien + " , NamXB =" + namXB +" ]";
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
}
    