/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophuocthai_59136167_bttuan3_bai2;
import Hanghoa.HangHoa;
import Giohang.GioHang;
import Thanhtoan.IThanhToan;
import Thanhtoan.ThanhToanCOD;
import Thanhtoan.ThanhToanOnline;
/**
 *
 * @author tophu
 */
public class ToPhuocThai_59136167_BTTuan3_Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HangHoa HH1 = new HangHoa("Tivi", 1000000, "Tivi kỹ thuất số");
        HangHoa HH2 = new HangHoa("Honda", 2000000, "Xe máy");
        GioHang GH = new GioHang();
        GH.themHH(HH1);
        GH.themHH(HH2);
        IThanhToan TTOnline = new ThanhToanOnline();
        GH.setHinhThucTT(TTOnline);
        System.out.println("Tổng tiền online: " + GH.thanhToan(GH.tinhtien()));
        
        IThanhToan TTCOD = new  ThanhToanCOD();
        GH.setHinhThucTT(TTCOD);
        System.out.println("Tổng tiền COD: " + GH.thanhToan(GH.tinhtien()));
    }
}
