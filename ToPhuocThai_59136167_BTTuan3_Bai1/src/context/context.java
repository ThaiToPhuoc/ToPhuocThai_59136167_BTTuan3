/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import Tinh.ITinh;

/**
 *
 * @author tophu
 */
public class context implements ITinh{
    ITinh tinhToan;

    public context() {
    }

    public void setTinhToan(ITinh tinhToan) {
        this.tinhToan = tinhToan;
    }
    
    public float tinh(float a, float b){
        return tinhToan.tinh(a, b);
    }
}
