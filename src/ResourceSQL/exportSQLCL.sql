set SQLFORMAT csv;
set encoding UTF-8;
SPOOL 'D:\hhhhhh.csv'
select * from CHITIETHOADON;
SPOOL off
exit