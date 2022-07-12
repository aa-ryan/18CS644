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
		<%! String MyCookieName=”EMPID”; String UserValue=”AN2536”; %>
	</body>
</html>
<!-- Reading Cookie: -->
<html>
	<head>
		<title>reading cookie </title>
	</head>
	<body>
<% String myCookieName=”EMPID”; String myCookieValue; String CName, CValue; int found=0;
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
