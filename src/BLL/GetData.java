package BLL;

import DAL.DataAccess;
import java.util.ArrayList;

public class GetData {

    // <editor-fold defaultstate="collapsed" desc="Lấy thông tin user">  
    public ArrayList getAllUserAndProfile() {
        DataAccess da = new DataAccess(
                "SELECT USER_ID, USERNAME, ACCOUNT_STATUS, LOCK_DATE, EXPIRY_DATE, CREATED, PROFILE FROM dba_users");
        return da.QueryTable();
    }

    public ArrayList getAllAccount() {
        DataAccess da = new DataAccess(
                "SELECT USER_ID, username, CREATED, EXPIRY_DATE, ACCOUNT_STATUS, cast(LAST_LOGIN as date), PROFILE, TEMPORARY_TABLESPACE, EXTERNAL_NAME FROM DBA_USERS where account_status = 'OPEN'");
        return da.QueryTable();
    }

    public String getCurrentUser() {
        DataAccess da = new DataAccess(
                "SELECT sys_context('USERENV', 'CURRENT_SCHEMA') FROM dual");
        return da.QueryContentTable()[0][0].toString();
    }

    public Object[][] getInfoAccount() {
        DataAccess da = new DataAccess(String.format(
                "select * from datacaphe.nhanvien where TAIKHOAN = '%s'",
                getCurrentUser().
                        toLowerCase()));
        return da.QueryContentTable();
    }

    public String getLastLogin() {
        String user = getCurrentUser();
        String sid = new DataAccess(
                "SELECT sys_context('USERENV', 'SID') SID FROM DUAL").
                QueryContentTable()[0][0].toString();
        String query = String.format(
                "select sid, name ,to_char(logon_time,'MM-DD-YYYY HH24:MI:SS') from sec.log_on where sid = %s and name = '%s' order by LOGON_TIME desc",
                sid,
                user);
        DataAccess da = new DataAccess(query);
        String kq = "null";
        try {
            kq = da.QueryContentTable()[1][2].toString();
        } catch (Exception err) {
            kq = "First Login";
        }
        return kq;
    }

    public Object[][] getAllProfileName() {
        DataAccess da = new DataAccess(
                "SELECT distinct PROFILE from dba_profiles");
        return da.QueryContentTable();
    }

    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Thao">  
    public ArrayList getDataTimKiemThucDon(String tenmon) {
        String temp = "select MAMON,TENMON,KICHCO, GIA,TRANGTHAI, HINHANH from datacaphe.THUCDON where tenmon like N'%"+ tenmon +"%'";
        DataAccess da = new DataAccess(temp);
        return da.QueryTable();
    }
    public ArrayList getDataThucDon(String tenloai) {
        DataAccess da = new DataAccess(String.format("SELECT MAMON,TENMON,KICHCO, GIA,TRANGTHAI, HINHANH FROM datacaphe.THUCDON Where PHANLOAIMALOAI = '%s'",tenloai));
        return da.QueryTable();
    }
    public ArrayList getDataPhanLoai() {
        DataAccess da = new DataAccess("SELECT MALOAI, TENLOAI FROM datacaphe.PHANLOAI");
        return da.QueryTable();
    }
    public boolean checkKhachHang(String sdt) {
        DataAccess da = new DataAccess();
        return  da.checkData(String.format("select * from datacaphe.khachhang where SDT = '%s'",sdt));
    }
    public Object[][] getdataKhacHang(String sdt) {
        DataAccess da = new DataAccess(String.format("select * from datacaphe.khachhang where SDT = '%s'",sdt));
        return  da.QueryContentTable();
    }
    public Object[][] getdataKhuyenMai() {
        DataAccess da = new DataAccess("select * from datacaphe.khuyenmai");
        return  da.QueryContentTable();
    }
    public Object[][] getdataTenKH(String sdt) {
        DataAccess da = new DataAccess(String.format("select MAKH,TENKH, DIEMTICHLUY from datacaphe.khachhang where SDT = '%s'",sdt));
        return  da.QueryContentTable();
    }
    public Object[][] getCurrentMANV()
    {
        DataAccess da = new DataAccess("select MANV from datacaphe.nhanvien where taikhoan = (SELECT lower(sys_context('USERENV', 'CURRENT_SCHEMA')) FROM dual)");
        return  da.QueryContentTable();
    }
    public Object[][] getMAHD()
    {
        DataAccess da = new DataAccess("select MAHD from datacaphe.hoadon where nhanvienmanv = 'NV000' order by ngaylap desc");
        return  da.QueryContentTable();
    }
   
    // </editor-fold> 
    
     public ArrayList getDataDSSP(){
        DataAccess da = new DataAccess("SELECT MAMON,TENMON,GIA,KICHCO,TRANGTHAI,MOTA FROM DATACAPHE.THUCDON");
        return da.QueryTable();
    }
     // <editor-fold defaultstate="collapsed" desc="Thi">  
  
    public ArrayList getDataTD(String maLoai){
        DataAccess da = new DataAccess(String.format("SELECT MAMON,TENMON,GIA,KICHCO,TRANGTHAI,MOTA FROM DATACAPHE.THUCDON WHERE PHANLOAIMALOAI = '%s'",maLoai));
        return da.QueryTable();
    }
    public ArrayList getDataKM(){
        DataAccess da = new DataAccess( "SELECT * FROM DATACAPHE.KHUYENMAI");
        return da.QueryTable();
    }
    
        // </editor-fold> 
    public Object[][] getDataKhoNguyenLieu(){
        DataAccess da = new DataAccess( "SELECT MANL, TENNL,DONVI,SOLUONG FROM DATACAPHE.KHONGUYENLIEU");
        return da.QueryContentTable();
    }
    // <editor-fold defaultstate="collapsed" desc="Lấy thông tin nhân viên"> 
    public ArrayList getDataNhanVien() {
        DataAccess da = new DataAccess("SELECT MANV, TENNV, SDT,GIOITINH, TAIKHOAN FROM datacaphe.NHANVIEN");
        return da.QueryTable();
    }
    
    public ArrayList getDataKhachHang() {
        DataAccess da = new DataAccess("SELECT * FROM datacaphe.KHACHHANG");
        return da.QueryTable();
    }
    public ArrayList getDataKH(){
        DataAccess da = new DataAccess( "SELECT * FROM DATACAPHE.KHACHHANG");
        return da.QueryTable();
    }
    // </editor-fold>
    
    public Object[][] getDataPhieuNhap(){
        DataAccess da = new DataAccess( "select MAPN, TO_CHAR( NGAYNHAP,'yyyy-MM-dd HH:mm:ss'), TENNV from datacaphe.PHIEUNHAP , datacaphe.NHANVIEN nv where NHANVIENMANV  = nv.MANV");
        return da.QueryContentTable();
    }
     public Object[][] getDataPhieuXuat(){
        DataAccess da = new DataAccess( "SELECT MAXUAT, TO_CHAR( NGAYXUAT,'yyyy-MM-dd HH:mm:ss'), TENNV FROM DATACAPHE.XUATNGUYENLIEU , datacaphe.NHANVIEN nv where NHANVIENMANV  = nv.MANV");
        return da.QueryContentTable();
    }
     public Object[][] getDataCTPhieuNhap(String ma){
        DataAccess da = new DataAccess( String.format("select * from datacaphe.CHITIETPHIEUNHAP where PHIEUNHAPMAPN  = '%s'", ma));
        return da.QueryContentTable();
    }
     public Object[][] getDataCTPhieuXuat(String ma){
        DataAccess da = new DataAccess( String.format("select * from datacaphe.CHITIETXUAT where XUATNGUYENLIEUMAXUAT  = '%s'", ma));
        return da.QueryContentTable();
    }
     
     
}
