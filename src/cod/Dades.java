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
public class Dades {
    
    private int _numConvidats = 0;
    private int _numTaules = 0;
    private List<Taula> Taula = new ArrayList<>();
    private Error Error = new Error();
    
    public void setNumConvidats(int _numConvidats) {
        this._numConvidats = _numConvidats;
    }
    
    public void setNumTaules(int _numTaules) {
        this._numTaules = _numTaules;
    }
    
    public void setTaula(List<Taula> Taula) {
        this.Taula = Taula;
    }
    
    public void setError(Error Error) {
        this.Error = Error;
    }
    
    public int getNumConvidats() {
        return this._numConvidats;
    }
    
    public int getNumTaules() {
        return this._numTaules;
    }
    
    public List<Taula> getTaula() {
        return this.Taula;
    }
    
    public Error getError() {
        return this.Error;
    }
}
