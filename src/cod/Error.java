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
public class Error {
    
    private int _codError = 0;
    private String _textError = new String();
    
    public void setCodError(int _codError) {
        this._codError = _codError;
    }
    
    public void setTextError(String _textError) {
        this._textError = _textError;
    }
    
    public int getCodError() {
        return this._codError;
    }
    
    public String getTextError() {
        return this._textError;
    }
    
}
