package BLL;

import DAL.DataAccess;
import DTO.ChiTietHoaDon;
import DTO.ChiTietPhieuNhap;
import DTO.Chitietxuat;
import DTO.HoaDon;
import DTO.KhachHang;
import DTO.KhoNguyenLieu;
import DTO.KhuyenMai;
import DTO.PhieuNhap;
import DTO.PhieuXuat;
import DTO.SanPham;

public class ExecuteData {
    // <editor-fold defaultstate="collapsed" desc="User">  
   
    public static boolean ChangePassword(String username, String newPass){
        String temp = String.format("ALTER USER %s IDENTIFIED BY %s",username, newPass);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean DeleteProfile(String profilename){
        String temp = String.format("DROP PROFILE %s CASCADE",profilename);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean CreateProfile(String profilename, String sessionPer, String failLoginAttempts, String passLifetime, String IdleTime){
        String temp = String.format("CREATE PROFILE %s LIMIT\n" +
                            " SESSIONS_PER_USER %s\n" +
                            " FAILED_LOGIN_ATTEMPTS %s\n" +
                            " PASSWORD_LIFE_TIME %s\n" +
                            " IDLE_TIME %s\n",profilename, sessionPer, failLoginAttempts, passLifetime, IdleTime);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean UpdateProfile(String profileName, String resourceName,String value){
        String temp = String.format("ALTER PROFILE %s LIMIT %s %s",profileName, resourceName, value);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean EditProfileOfUser(String user, String profileNew){
        String temp = String.format("ALTER USER %s PROFILE %s",user, profileNew);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    public static boolean DropUser(String user){
        String temp = String.format("DROP USER %s CASCADE",user);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean createUser(String user, String pass){
        String temp = String.format("create user %s identified by %s",user,pass);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Hóa đơn">  
    GetData data ;
    public boolean InsertHoaDon(HoaDon t){
        data = new GetData();
        String temp;
        if(t.getKhachhangmakh() == null)
        {
              temp= String.format("insert into datacaphe.hoadon(HINHTHUC, KHACHHANGMAKH, KHUYENMAIMAKM, NHANVIENMANV) values (N'%s','%s','%s','%s')",t.getHinhthuc(),"KH000" ,t.getKhuyenmaimakm(), "NV000");
                DataAccess.ResultOfExecuteSql(temp);
        }     
        else
        {
             temp = String.format("insert into datacaphe.hoadon(HINHTHUC, KHACHHANGMAKH, KHUYENMAIMAKM, NHANVIENMANV) values (N'%s','%s','%s','%s')",t.getHinhthuc(),t.getKhachhangmakh() ,t.getKhuyenmaimakm(), "NV000");
            DataAccess.ResultOfExecuteSql(temp);
        }
        
        Object[][] d = data.getMAHD();
        String mahd = d[0][0].toString();
        String sql = null;
        for(ChiTietHoaDon i : t.getDscthd())
        {
           
            sql = String.format("insert into datacaphe.chitiethoadon(SOLUONG, HOADONMAHD, THUCDONMAMON) values('%s','%s','%s')",i.getSoLuong(),mahd ,i.getThucDonMaMon());
            DataAccess.ResultOfExecuteSql(sql);
        }
        sql = String.format("Update datacaphe.hoadon set NHANVIENMANV = '%s' where MAHD = '%s'",t.getNhanvienmanv(), mahd);
        return DataAccess.ResultOfExecuteSql(sql);
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Sản phẩm khuyến mãi">  
    public  static boolean insertSP(SanPham sp){
        String temp = String.format("INSERT INTO DATACAPHE.THUCDON(TENMON,GIA,KICHCO,TRANGTHAI,MOTA,PHANLOAIMALOAI) VALUES (N'%s','%s','%s','%s',N'%s','%s')", sp.getTenmon(),sp.getGia(),sp.getKichco(),sp.getTrangthai(),sp.getMota(),sp.getPhanloaimaloai());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public  static boolean deleteSP(SanPham sp){
        String temp = String.format("DELETE FROM DATACAPHE.THUCDON WHERE MAMON = '%s' ", sp.getMamon());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateSP(SanPham sp){
        String temp = String.format("UPDATE DATACAPHE.THUCDON SET TENMON = N'%s', GIA = '%s', KICHCO = '%s',TRANGTHAI = '%s',MOTA = N'%s',PHANLOAIMALOAI = '%s'  WHERE MAMON = '%s'", sp.getTenmon(),sp.getGia(),sp.getKichco(),sp.getTrangthai(),sp.getMota(),sp.getPhanloaimaloai(),sp.getMamon());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public  static boolean insertKM(KhuyenMai km){
        String temp = String.format("INSERT INTO DATACAPHE.KHUYENMAI(TENKM,TILE) VALUES (N'%s','%f')", km.getTenkm(),km.getTile());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteKM(KhuyenMai km){
        String temp = String.format("DELETE FROM DATACAPHE.KHUYENMAI WHERE MAKM = '%s'", km.getMakm());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateKM(KhuyenMai km){
        String temp = String.format("UPDATE DATACAPHE.KHUYENMAI SET TENKM = N'%s', TILE = '%f'  WHERE MAKM = '%s'", km.getTenkm(),km.getTile(),km.getMakm());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    // </editor-fold> 


   // <editor-fold defaultstate="collapsed" desc="Kho nguyên liêu">  
     public static boolean insertKhoNL(KhoNguyenLieu kho){
        String temp = String.format("INSERT INTO DATACAPHE.KHONGUYENLIEU (TENNL, SOLUONG, DONVI) VALUES (N'%s', %s, N'%s')", kho.getTennl(),kho.getSoluong(),kho.getDonvi());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
      
     public static boolean updateKhoNL(KhoNguyenLieu kho){
        String temp = String.format("UPDATE DATACAPHE.KHONGUYENLIEU SET TENNL = '%s', DONVI = N'%s', SOLUONG = %s WHERE MANL = '%s'", kho.getTennl(),kho.getDonvi(),kho.getSoluong(), kho.getManl());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
     public static boolean delecteKhoNL(KhoNguyenLieu kho){
       String temp = String.format("DELETE FROM DATACAPHE.KHONGUYENLIEU WHERE MANL = '%s'",  kho.getManl());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    // </editor-fold> 
     // <editor-fold defaultstate="collapsed" desc="Them Xoa Sua Nhan vien">
    public static boolean ThemNhanVien(String maNV,String hoTen, String sdt,String gioiTinh){
        String temp = String.format("insert into datacaphe.nhanvien(MANV, TENNV, SDT, GIOITINH) values('%s',N'%s','%s','%s')",maNV,hoTen, sdt, gioiTinh);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean XoaNhanVien(String maNV){
        String temp = String.format("delete from datacaphe.nhanvien where MANV='%s'",maNV);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    
    public static boolean SuaNhanVien(String maNV, String hoTen, String sdt,String gioiTinh){
        String temp = String.format("UPDATE datacaphe.NHANVIEN set TENNV = N'%s', SDT = '%s', GIOITINH = '%s' WHERE MANV = '%s'",hoTen, sdt, gioiTinh, maNV);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    // </editor-fold>
    
    public  static boolean insertKH(KhachHang kh){
        String temp = String.format("INSERT INTO DATACAPHE.KHACHHANG(TENKH,GIOITINH,SDT,DIEMTICHLUY,HSD) VALUES (N'%s',N'%s','%s','%s',TO_DATE('%s', 'YYYY-MM-DD HH24:MI:SS'))", kh.getTenkh(),kh.getGioitinh(),kh.getSdt(),kh.getDiemtichluy(),kh.getHsd());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteKH(KhachHang kh){
        String temp = String.format("DELETE FROM DATACAPHE.KHACHHANG WHERE MAKH = '%s'", kh.getMakh());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean updateKH(KhachHang kh){
        String temp = String.format("UPDATE DATACAPHE.KHACHHANG SET TENKH = N'%s', GIOITINH = N'%s', SDT = '%s', DIEMTICHLUY = '%s', HSD = TO_DATE('%s', 'YYYY-MM-DD HH24:MI:SS') WHERE MAKH = '%s'", kh.getTenkh(),kh.getGioitinh(),kh.getSdt(),kh.getDiemtichluy(),kh.getHsd().toString(),kh.getMakh());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    
    
    public static boolean insertPN(PhieuNhap pn){
        String temp = String.format("INSERT INTO DATACAPHE.PHIEUNHAP (NGAYNHAP, NHANVIENMANV) VALUES (TO_DATE('%s', 'YYYY-MM-DD HH24:MI:SS'), '%s')", pn.getNgaylap(),pn.getManv());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }


    public static boolean updatePN(PhieuNhap pn){
        String temp = String.format("UPDATE DATACAPHE.PHIEUNHAP SET NGAYNHAP = TO_DATE('%s', 'YYYY-MM-DD HH24:MI:SS'), NHANVIENMANV = '%s' WHERE MAPN = '%s'", pn.getNgaylap(),pn.getManv(), pn.getMapn());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    
    public static boolean deletePN(PhieuNhap pn){
        String temp = String.format("DELETE DATACAPHE.CHITIETPHIEUNHAP WHERE PHIEUNHAPMAPN = '%s'",pn.getMapn());
        DataAccess.ResultOfExecuteSqlUpdate(temp);
        temp = String.format("DELETE DATACAPHE.PHIEUNHAP WHERE MAPN = '%s'", pn.getMapn());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean insertPX(PhieuXuat px){
        String temp = String.format("INSERT INTO DATACAPHE.XUATNGUYENLIEU (NGAYXUAT, NHANVIENMANV) VALUES (TO_DATE('%s', 'YYYY-MM-DD HH24:MI:SS'), '%s')", px.getNgaylap(),px.getManv());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }

    public static boolean updatePX(PhieuXuat px){
        String temp = String.format("UPDATE DATACAPHE.XUATNGUYENLIEU SET NGAYXUAT = TO_DATE('%s', 'YYYY-MM-DD HH24:MI:SS'), NHANVIENMANV = '%s' WHERE MAXUAT = '%s'", px.getNgaylap(),px.getManv(), px.getMapx());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    
    public static boolean deletePX(PhieuXuat px){
        String temp = String.format("DELETE DATACAPHE.CHITIETXUAT WHERE XUATNGUYENLIEUMAXUAT = '%s'",px.getMapx());
        DataAccess.ResultOfExecuteSqlUpdate(temp);
        temp = String.format("DELETE DATACAPHE.XUATNGUYENLIEU WHERE MAXUAT = '%s'", px.getMapx());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }


    public static boolean insertCTPN(ChiTietPhieuNhap pn){
        String temp = String.format("INSERT INTO DATACAPHE.CHITIETPHIEUNHAP (SOLUONG, GIANHAP, TENNCC, NGUYENLIEUMANL, PHIEUNHAPMAPN) VALUES (%s, '%f', N'%s', '%s', '%s')",pn.getSoluong(),pn.getGianhap(),pn.getTenncc(),pn.getNguyenlieumanl(),pn.getPhieunhapmapn());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    
    public static boolean updateCTPN(ChiTietPhieuNhap pn){
        String temp = String.format("    UPDATE \"DATACAPHE\".\"CHITIETPHIEUNHAP\" SET SOLUONG = %s, GIANHAP = '%f', TENNCC = N'%s' WHERE PHIEUNHAPMAPN = '%s'",pn.getSoluong(),pn.getGianhap(),pn.getTenncc(),pn.getPhieunhapmapn());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
    public static boolean deleteCTPN(ChiTietPhieuNhap pn){
        String temp = String.format("    delete from \"DATACAPHE\".\"CHITIETPHIEUNHAP\" WHERE PHIEUNHAPMAPN = '%s'",pn.getPhieunhapmapn());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
}
