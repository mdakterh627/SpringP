<%-- 
    Document   : Form
    Created on : Oct 16, 2019, 10:23:38 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <h1>Registration Form</h1>
        <form action="myForm">
              <table >    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Address :</td>    
          <td><form:input path="address" /></td>  
         </tr>   
         <tr>    
          <td>Mobile No :</td>    
          <td><form:input path="mobile" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table> 
            
        </form>
    </body>
</html>
