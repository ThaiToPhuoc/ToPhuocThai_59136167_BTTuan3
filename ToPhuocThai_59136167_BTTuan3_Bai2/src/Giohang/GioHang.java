/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Giohang;
import Thanhtoan.IThanhToan;
import java.util.ArrayList;
import Hanghoa.HangHoa;
/**
 *
 * @author tophu
 */
public class GioHang implements IThanhToan{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH = new ArrayList<>();

    public GioHang() {
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
     
    @Override
    public double thanhToan(int tienHang) {
        return hinhThucTT.thanhToan(tienHang);
    }
    
    public void themHH(HangHoa HH){
        dsHH.add(HH);
    }
    
    public int tinhtien(){
        int S = 0;
        for(int i = 0; i < dsHH.size(); i++)
            S+=dsHH.get(i).getGia();
        return S;
    }
}
