/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;

/**
 *
 * @author T11380
 */
public class Convidat {
    
    private int _numTaula = 0;
    private String _nom = new String();
    private boolean _teParella = false;
    private String _nomParella = new String();
    private boolean _esXiquet = false;
    private String _missatge = new String();
    
    public void setNumTaula(int _numTaula) {
        this._numTaula = _numTaula;
    }
    
    public void setNom(String _nom) {
        this._nom = _nom;
    }
    
    public void setTeParella(boolean _teParella) {
        this._teParella = _teParella;
    }
    
    public void setNomParella(String _nomParella) {
        this._nomParella = _nomParella;
    }
    
    public void setEsXiquet(boolean _esXiquet) {
        this._esXiquet = _esXiquet;
    }
    
    public void setMissatge(String _missatge) {
        this._missatge = _missatge;
    }
    
    public int getNumTaula() {
        return this._numTaula;
    }
    
    public String getNom() {
        return this._nom;
    }
    
    public boolean getTeParella() {
        return this._teParella;
    }
    
    public String getNomParella() {
        return this._nomParella;
    }
    
    public boolean getEsXiquet() {
        return this._esXiquet;
    }
    
    public String getMissatge() {
        return this._missatge;
    }
}
