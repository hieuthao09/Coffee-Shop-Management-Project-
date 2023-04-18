package BLL;

import DAL.DataAccess;
import java.util.ArrayList;


public class GetData {
    public ArrayList getAllUserAndProfile(){
        DataAccess da = new DataAccess("SELECT USER_ID, USERNAME, ACCOUNT_STATUS, LOCK_DATE, EXPIRY_DATE, CREATED, PROFILE FROM dba_users");
        return da.QueryTable();
    }
    
    public ArrayList getAllAccount()
    {
        DataAccess da = new DataAccess("SELECT USER_ID, username, CREATED, EXPIRY_DATE, ACCOUNT_STATUS, cast(LAST_LOGIN as date), PROFILE, TEMPORARY_TABLESPACE, EXTERNAL_NAME FROM DBA_USERS where account_status = 'OPEN'");
        return da.QueryTable ();
    }
    public String getCurrentUser()
    {
        DataAccess da = new DataAccess("SELECT sys_context('USERENV', 'CURRENT_SCHEMA') FROM dual");
        return da.QueryContentTable()[0][0].toString();
    }
    public Object[][] getInfoAccount(){
          DataAccess da = new DataAccess(String.format("select * from datacaphe.nhanvien where TAIKHOAN = '%s'",getCurrentUser().toLowerCase()));
          return da.QueryContentTable();
      }   
    public String getLastLogin()
    {
        String user = getCurrentUser();
        String sid = new DataAccess("SELECT sys_context('USERENV', 'SID') SID FROM DUAL").QueryContentTable()[0][0].toString();
        String query = String.format("select sid, name ,to_char(logon_time,'MM-DD-YYYY HH24:MI:SS') from sec.log_on where sid = %s and name = '%s' order by LOGON_TIME desc",sid, user);
        DataAccess da = new DataAccess(query);
        String kq = "null";
        try{
            kq = da.QueryContentTable()[1][2].toString();
        }
        catch(Exception err)
        {
            kq = "First Login";
        }
        return kq;
    }
    
    
     public Object[][] getAllProfileName(){
        DataAccess da = new DataAccess("SELECT distinct PROFILE from dba_profiles");
        return da.QueryContentTable();
    }
}