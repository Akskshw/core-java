package dao;

public class JdbcHospitalTester {
	public static void main(String[] args) {	
		HosiptalDao dao=new HosiptalDao();
		dao.saveHosiptalInfomation();
	}}
	
/*  statement                  and                    
 * statemnet is a super interface which is used to carry the sql query
 * prstmnt is sub interface of statement interface it is also used query sql query plussome advanced features
* sql is passed after creating statement object 
* Statement interface compiles and execute sql query
*Statement interface is very slow while executing the sql query 
*this uses static sql query ex: insert into tableName values(1,'name',address) 
*because of static sql query static injection may happen 
**/
/*prepared statement
*sql query is passed during object creation of psmt
*psmt compiles only one time and execute many time 
* this uses dynamic sql query using place holder ex: inert into tableName values (?,?,?,?,?) here place represent column number 
* psmt is faster compare to statement interface
* due to dynamic sql query sql injection will not happen*/

/*------interview question -----
what is jdbc
steps in jdbc
what is divermanager how connection is established
name different types of statements and execute method
write a program*/