/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;


public class Urna {
    private int voto;
    int qtdjava=0;
    int qtdc=0;

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
        if(this.voto ==1){
          qtdjava++;
        }
        if(this.voto ==2){
          qtdc++;
        }
    }
    public int getjava() {
        return qtdjava;
    }
    public int getc() {
        return qtdc;
    }
}
