package BLL;

import DAL.DataAccess;
import DTO.KhuyenMai;
import DTO.SanPham;

public class ExecuteData {
    public static boolean ExecuteSql(String SID, String SerialID)
    {
        return DataAccess.ResultOfExecuteSql(String.format("Alter system kill session '%s,%s'",SID,SerialID));
    }
    public static boolean CreateAuditPolicy(String objectSchema, String objectName, String policyName, String statement)
    {
        String temp = String.format("BEGIN DBMS_FGA.ADD_POLICY(object_schema      => '%s',object_name        => '%s',policy_name        => '%s',statement_types    => '%s');END;commit work;",objectSchema, objectName, policyName, statement);
        return DataAccess.ResultOfExecuteSql(temp);
    }
    public static boolean DeleteAuditPolicy(String objectSchema, String objectName, String policyName)
    {
        String temp = String.format("BEGIN DBMS_FGA.DROP_POLICY( object_schema  => '%s', object_name  => '%s', policy_name => '%s'); END;commit work;",objectSchema, objectName, policyName);
        return DataAccess.ResultOfExecuteSql(temp);
    }
   
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
        String temp = String.format("UPDATE DATACAPHE.KHUYENMAI SET TENKM = '%s', TILE = '%f'  WHERE MAKM = '%s'", km.getTenkm(),km.getTile(),km.getMakm());
        return DataAccess.ResultOfExecuteSqlUpdate(temp);
    }
}
