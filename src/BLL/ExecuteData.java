package BLL;

import DAL.DataAccess;

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
    }// </editor-fold>   

}
