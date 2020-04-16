/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tophuocthai_59136167_bttuan3_bai1;
import Tinh.Chia;
import Tinh.Cong;
import Tinh.ITinh;
import Tinh.Nhan;
import Tinh.Tru;
import context.context;
/**
 *
 * @author tophu
 */
public class ToPhuocThai_59136167_BTTuan3_Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        context pheptinh1 = new context();
        ITinh cong = new Cong();
        pheptinh1.setTinhToan(cong);
        System.out.println("Kết quả phép tính cong: " + pheptinh1.tinh(3, 4));
        
        context pheptinh2 = new context();
        ITinh tru = new Tru();
        pheptinh2.setTinhToan(tru);
        System.out.println("Kết quả phép tính tru: " + pheptinh2.tinh(8, 2));
        
        context pheptinh3 = new context();
        ITinh nhan = new Nhan();
        pheptinh3.setTinhToan(nhan);
        System.out.println("Kết quả phép tính nhan: " + pheptinh3.tinh(5, 14));
        
        context pheptinh4 = new context();
        ITinh chia = new Chia();
        pheptinh4.setTinhToan(chia);
        System.out.println("Kết quả phép tính chia: " + pheptinh4.tinh(10, 4));
    }
    
}
