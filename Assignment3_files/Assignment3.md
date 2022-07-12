## Assignment 3

#### Explain the life cycle of servlets.
* Servlet is small program that execute on the server side of a web connection.
* Java servlet is more efficient, easier to use, more powerful, more portable, and
cheaper than traditional CGI and than many alternative CGI-like technologies.

* Life Cycle of Servlet
	1. Servlet class is loaded.
		- Servlet class is loaded when first request to web container.
	2. servlet instance is created:
		- Web container creates the instance of servlet class only once.
	3. init method is invoked:
		- It class the init method when it loads the instance. It is used to intialise servlet. Syntax of init method is
	```java	
		public void init(ServletConfig config) throws ServletException
	```
	4. Service method is invoked:
		- Web container calls service method each time when request for the servlet is received. If servlet is not initialized it calls init then it calls the service method. Syntax of service method is as follows
	```java
		public void service(Servlet request, ServletResponse response) throws ServletException, IOException
    ```
	5. Destroy method is invoked.
		- The web container calls the destroy method before it removes the servlet from service. It gives servlet an opportunity to clean up memory, resources etc. Servlet destroy method has following syntax.
	```java
		public void destroy().
	```
>There are three states of servlet new, ready, end. 
>It is in new state when servlet is created. After invoking the init () method servlet comes to ready state. In ready state servlet invokes destroy method it comes to end state.

#### Explain the difference between Servlets and CGI programs.
| Basis               | Servlet                                                                                           | CGI                                                                                                                                             |
|---------------------|---------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| Approach            | It is thread based i.e. for every new request new thread is created.                              | It is process-based i.e. for every new request new process is created.                                                                          |
| Language Used       | The codes are written in JAVA programming language.                                               | The codes are written any programming language.                                                                                                 |
| Object-Oriented     | Since codes are written in Java, it is object oriented and the user will get the benefits of OOPs | Since codes are written in any language, all the languages are not object-oriented thread-based. So, the user will not get the benefits of OOPs |
| Portability         | It is portable.                                                                                   | It is not portable.                                                                                                                             |
| Persistence         | It remains in the memory until it is not explicitly destroyed.                                    | It is removed from the memory after the completion of the process-basedrequest.                                                                 |
| Server Independent  | It can use any of the web-server.                                                                 | It can use the web-server that supports it.                                                                                                     |
| Data Sharing        | Data sharing is possible.                                                                         | Data sharing is not possible.                                                                                                                   |
| Link                | It links directly to the server.                                                                  | It does not link the web server directly to the server.                                                                                         |
| HTTP server         | It can read and set HTTP servers.                                                                 | It can neither read nor set HTTP servers.                                                                                                       |
| Cost                | Construction and destruction of new threads are not costly.                                       | Construction and destruction of the new processes are costly.                                                                                   |
| Speed               | Its can speed is slower.                                                                          | It can speed is faster.                                                                                                                         |
| Platform dependency | It can be Platform dependent                                                                      | It can be not Platform dependent.                                                                                                               |

#### How to handle HTTP GET request and HTTP Post request? Explain with examples.

* A client uses either the GET or POST method to pass information to a java servlet. 
* Depending on the method used by the client either doGet() or doPost() method is called in servlet.
* Data sent by a client is read into java servlet by calling getParameter() method of HttpservletRequest() object that instantiated in the argument list of doGet() method and doPost() method.
* getParameter() requires one argument, which is the name of parameter that contains the data sent by the client. 
* getParameter() returns the String object.
	- String object contains the value assigned by the client. An empty string object is returned when it does not assign a value to the parameter. Also a null is retuned when parameter is not returned in the client.
* getParameterValues() used to return the array of string objects.

* HTML code calling servlet
```html
<FORM ACTION="/servlet/myservlets.js2">
	Enter Email Address :< INPUT TYPE="TEXT" NAME="email"> <INPUT TYPE="SUBMIT">
</FORM>
```
```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class js2 extends Httpservlet {
public void doGet(HttpservletRequset request,HttpservletResponse response) throws servletException , IOException {
	String email;
	Email=request.getParameter("email"); 
	Response.setContentType("text/html");
	PrinterWriter pw=response.getWriter(); 
	pw.println("<HTML>\n" + "HEAD><TITLE> Java Servlet</TITLE></HEAD>\n" + "<BODY>\n"+  "<p>MY Email Address :" + email +"</p>\n" + <h1> My First Servlet </h1> + "</BODY>\n" +</HTML>");
	} 
}
```

#### What is JSP? Explain the varies types of JSP tags with example.

- JSP
	* A JSP is java server page is server side program that is similar in design and functionality to a java servlet. 
	* A JSP is called by a client to provide web services, the nature of which depends on client application. 
	* A JSP is simpler to create than a java servlet because a jsp is written in HTML rather than with the java programming language. 

- JSP Tags
	* A jsp tag begin with a `<% which is followed by java code , and ends with %>`
	* There ia an XML version of jsp tag `<jsp:TagId></jsp:TagId>`
	* A jsp tags are embedded into the HTML component of a jsp program and are processed by JSP virtual engine such as Tomcat.
	
	1. Comment Tags
		- A comment tag opens with ` <%-- and close with --%>` and is follwed by a comment.
		- Ex
			`<%-- This is comment --%>`
	2. Declaration statement Tags
		- A declartion statement tag opens with `<%!` And is followed by declaration statements that define the variables, object, and methods that are availabe to other component of jsp program.
		- Ex
			`<%! Integer i = 1; Double num = 2.00 %>`
	3. Directive Tags
		-  A directive tag opens with `<%@` and commands the jsp virtual engine to perform a specific task, such as importing java package required by objects and methods used in a declaration statement. The directive tag closes with `%>` 
		-  Ex
			`<%@ page import = "import java.sql.*"; %>`
	4. Expression Tags
		- An expression tag opens with `<%=` and is used for an expression statement whose result page replaces the expression tag when the jsp virtual engine resolves JSP tags. An expression tag closes with `%>`
		- Ex
			`Current Time: <%= java.util.Calendar.getInstance().getTime() %> `
	5. Scriptlet Tags
		- A sciptlet tag opens with `<%` and contains commonly used java control statements and loops. And Scriptlet tag closes with `%>`
		- Ex
			`<% out.print("welcome to jsp"); %> `

#### What is a cookies? Write the JSP program to create and read a cookie.
* Cookies are text files stored on the client computer and they are kept for various information tracking purpose. 
* Java Servlets transparently supports HTTP cookies. 
* There are three steps involved in identifying returning users:
 	- Server script sends a set of cookies to the browser. For example name, age, or identification number etc.
	- Browser stores this information on local machine for future use.
	- When next time browser sends any request to web server then it sends those cookies information to the server and server uses that information to identify the user.

* Program
```html
 <!-- Create cookie: -->
<html>
	<head>
		<title> creating cookie</title> 
	</head>
	<body>
		<%! String MyCookieName="EMPID"; String UserValue="AN2536"; %>
	</body>
</html>
<!-- Reading Cookie: -->
<html>
	<head>
		<title>reading cookie </title>
	</head>
	<body>
<% String myCookieName="EMPID"; String myCookieValue; String CName, CValue; int found=0;
	Cookie[] cookies=request.getCoookies(); 
	for(int i=0;i<cookies.length;i++) {
		CName= cookies[i].getName();
		CValue =cookies[i].getValue(); 
		if(myCookieName.equals(CName)) { 
			found=1;
			myCookieValue=Cvalue; 
		} 
	}
	if (found== 1) { %>
	<p> Cookie Name = < %= CName %> </p> 
	<p> Cookie Value = < %= CValue %> </p>
	<% } 
	%> 
	</body>
</html>
```
#### Write short notes on: i) Session tracking ii) Cookies in java servlet.
* Session Tracking
	- A session is created each time a client requests service from a java servlet. 
	- The java servlet processes the request and response accordingly, after which the session is terminated. Many times the same client follows with another request to the same java servlet, java servlet requires information regarding the previous session to process request. However, HTTP is stateless protocol, meaning that there is not hold over from the previous sessions.
	- Java servlet is capable of tracking sessions by using HttpSession API. It determines if the request is a continuation from an existing session or new session.
	- A java servlet calls a getSession() method of HttpservletRequset object, which returns a session object if it is a new session. The getSession() method requires one argument which is Boolean true. Returns session object.
	- Syntax :
	```java
	HttpSession s1=request.getSession(true);
	```
* Cookies
	- Cookies are text files stored on the client computer and they are kept for various information tracking purpose. 
	- Java Servlets transparently supports HTTP cookies. 
	- There are three steps involved in identifying returning users:
		- Server script sends a set of cookies to the browser. For example name, age, or identification number etc.
		- Browser stores this information on local machine for future use.
		- When next time browser sends any request to web server then it sends those cookies information to the server and server uses that information to identify the user.

#### Explain four types of JDBC drivers.
*  JDBC stands for Java Database Connectivity, which is a standard Java API for database-independent connectivity between the Java programming language and a wide range of databases.
*  JDBC to ODBC Driver
	1. It is also called JDBC/ODBC Bridge , developed by MicroSoft.
	2. It receives messages from a J2EE component that conforms to the JDBC specifications
	3. Then it translates into the messages understood by the DBMS.
	4. This is DBMS independent database program that is ODBC open database connectivity.
* JAVA / Native Code Driver
	1. Generates platform specific code that is code understood by platform specific code only understood by specific databases.
	2. Manufacturer of DBMS provides both java/ Native code driver.
	3. Using this provides lost of portability of code.
	4. It won’t work for another DBMS manufacturer
* JDBC Driver
	1. Most commonly used JDBC driver.
	2. Coverts SQL queries into JDBC Formatted statements.
	3. Then JDBC Formatted statements are translated into the format required by the DBMS.
	4. Referred as Java protocol
* JDBC Driver
	1. Referred as Type 4 database protocol
	2. SQL statements are transferred into the format required by the DBMS. 3. This is the fastest communication protocol.

#### Describe the varies steps of JDBC with code snippets.
* Loading the JDBC driver
	- The jdbc driver must be loaded before the J2EE component can be connected to the database.
	- Driver is loaded by calling the method and passing it the name of driver
		```java
			Class.forName(“sun:jdbc.odbc.JdbcOdbcDriver”);
		```
* Connecting to the DBMS.
	- Once the driver is loaded , J2EE component must connect to the DBMS using DriverManager.getConnection() method.
	- It is highest class in hierarchy and is responsible for managing driver information.
	- It takes three arguments URL, User, Password
	- It returns connection interface that is used through out the process to reference a database
		```java
		String url="jdbc:odbc:JdbcOdbcDriver";
		String userId="yamete"
		String password="kudasai";
		Statement DataRequest;
		private Connection db;
		try{
			Class.forName(“sun:jdbc.odbc.JdbcOdbcDriver”); 
			Db=DriverManager.getConnection(url,userId,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		```

* Creating and Executing a statement
	- The next step after the JDBC is loaded and connection is successfully made with a particular database managed by the dbms, is to end a particular query to the DBMS for processing.
	- SQL query consists series of SQL command that direct DBMS to do something example Return rows.
	- Connect.createStatement() method is used to create a statement Object.
	- The statement object is then used to execute a query and return result object that contain response from the DBMS
		```java
		Statement DataRequest;
		ResultSet Results;
		try {
			String query="select * from Customers";
			DataRequest = Database.createStatement();
			Results = DataRequests.executeQuery(query);
			} catch (Exception e) {
				e.printStackTrace();
			}
		```
* Processing data returned by the DBMS
	- java.sql.ResultSet object is assigned the result received from the DBMS after the query is processed.
	- java.sql.ResultSet contain method to interact with data that is returned by the DBMS to the J2EE Component.
	```java
		Results= DataRequests.executeQuery(query);
		do
		{
			Fname=Results.getString(Fname)
	} while(Results.next())
	```
	- In the above code it return result from the query and executes the query and getString() is used to process the String retrived from the database.
	- Terminating the connection with the DBMS, to terminate the connection Database.close() method is used.

#### What is Result set? Explain types of Result sets in JDBC.
1. ResultSet object contain the methods that are used to copy data from ResultSet into java collection object or variable for further processing.
2. Data in the ResultSet is logically organized into the virtual table for further processing. Result set along with row and column it also contains meta data.
3. ResultSet uses virtual cursor to point to a row of the table.

* Types of Result Set
	- Forward Only (ResultSet.TYPE_FORWARD_ONLY)
		- This type of ResultSet instance can move only in the forward direction from the first row to the last row. ResultSet can be moved forward one row by calling the next() method. We can obtain this type of ResultSet while creating Instance of Statement, PreparedStatement or CallableStatement.
	- Scroll Insensitive (ResultSet.TYPE_SCROLL_INSENSITIVE)
		- Scroll Insensitive ResultSet can scroll in both forward and backward directions. It can also be scrolled to an absolute position by calling the absolute() method. But it is not sensitive to data changes. It will only have data when the query was executed and ResultSet was obtained. It will not reflect the changes made to data after it was obtained.
	- Scroll Sensitive (ResultSet.TYPE_SCROLL_SENSITIVE)
		- Scroll Sensitive ResultSet can scroll in both forward and backward directions. It can also be scrolled to an absolute position by calling the absolute() method. But it is sensitive to data changes. It will reflect the changes made to data while it is open.
	
#### What are the transactions? Write a program to execute a database transaction.
1. A transaction may consists of a set of SQL statements, each of which must be successfully completed for the transaction to be completed. If one fails SQL statements successfully completed must be rolled back.
2. Transaction is not completed until the J2EE component calls the commit() method of the connection object. All SQL statements executed prior to the call to commit() method can be rolled back.
3. Commit() method was automatically called in the program. DBMS has set AutoCommit feature.
4. If the J2EE component is processing a transaction then it has to deactivate the auto commit() option false.
5. Transaction can also be rolled back. When not happened. Db.rollback().
6. A transaction may consists of many tasks , some of which no need to roll back . in such situation we can create a savepoints, in between transactions. It was introduced in JDBC
3.0. save points are created and then passed as parameters to rollback() methods.
7. releaseSavepoint() is used to remove the savepoint from the transaction.
8. Savepoint `s1=DataBase.setSavePoint("sp1");to create the savepoint.`
9. `Database.rollback(sp1);` to rollback the transaction.
```java
	try {
	// Assume a valid connection object connection
	conn.setAutoCommit(false);
	Statement stmt = conn.createStatement();
	Statement SQL = "insert into Employees values (1, 2, 'Aryan')"
	stmt.executeUpdate(SQL);
	// Wrong SQL statement that breaks
	String SQL = "insert in Employees values (1, 2, 'Ankit')";
	stmt.executeUpdate(SQL);
	conn.commit();
	}
	catch (SQLException e) {
		conn.rollback();
	}
```

#### Write a program to connect to database with following information:
Drive: JDBC/ODBC bridge URL: “jdbc,odbc:Ex” Username: “xyz” Password: “123”  
Retrieve all rows with marks >60 using prepared statement object. Assume following table:  
Table Name: STUDENT Fields: USN-Varchar (20)  
Marks – int  
Name- Varchar(25)  

* Program
```java
	String url=" jdbc,odbc:Ex";
	String userId="xyz";
	String password="123";
	ResultSet rs;

	Private Connection db;

	try{
		Class.forName("sun:jdbc.odbc.JdbcOdbcDriver");
		// code to load driver

		Db=DriverManager.getConnection(url,userId,password);
		//code to connect to the database

		String query="SELECT * FROM STUDENT where Marks>60";

		PreparedStatement pstatement=db.preparedStatement(query);
		rs= pstatement.executeQuery();
	}
	catch(SQLException err)
	{
		System.err.println("Error");
		System.exit(1);
	}
```
