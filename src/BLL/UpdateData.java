/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DataAccess;

/**
 *
 * @author PC THAO
 */
public class UpdateData {
     private DataAccess da;
     private String user;
    public UpdateData() {
        da = new DataAccess ("select distinct owner from DBA_TABLES where owner like (select owner from DBA_TABLES where table_name ='HOADON')");
        user = da.returnValue ().toString ();      
    }
   
}
