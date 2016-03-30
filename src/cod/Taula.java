/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T11380
 */
public class Taula {
    
    private int _numTaula = 0;
    private int _capacitatTaula = 0;
    private List<Convidat> Convidat = new ArrayList<>();
    
    public void setNumTaula (int _numTaula) {
        this._numTaula = _numTaula;
    }
    
    public void setCapacitatTaula (int _capacitatTaula) {
        this._capacitatTaula = _capacitatTaula;
    }
    
    public void setConvidat (List<Convidat> Convidats) {
        this.Convidat = Convidats;
    }
    
    public int getNumTaula() {
        return this._numTaula;
    }
    
    public int getCapacitatTaula() {
        return this._capacitatTaula;
    }
    
    public List<Convidat> getConvidat() {
        return this.Convidat;
    }
}
