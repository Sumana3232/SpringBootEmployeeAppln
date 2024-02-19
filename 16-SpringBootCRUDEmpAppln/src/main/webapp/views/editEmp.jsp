<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
  <body bgcolor="pink"> 
        <h1>Edit Employee Details Here</h1>   
       <form:form method="GET" action="/editandsave">     
        <table >     
        <tr>   
        <td></td>     
         <td><form:hidden path="empId" /></td>   
         </tr>   
         <tr>     
            <td>Employee Name :</td>     
            <td><form:input path="empName" /></td>   
           </tr>   
         <tr>     
          <td>Designation : </td>    
          <td><form:input path="designation"  /></td>   
         </tr>   
         <tr>     
          <td>Email Id :</td>     
          <td><form:input path="email" /></td>   
         </tr>  
         <tr>     
            <td>Mobile Number :</td>     
            <td><form:input path="mobileno" /></td>   
           </tr> 
         <tr>     
            <td>Gender :</td>     
            <td><form:input path="gender" /></td>   
           </tr>   
           <tr>     
            <td>City name :</td>     
            <td><form:input path="city" /></td>   
        </tr>    
        <tr>     
            <td>State :</td>     
            <td><form:input path="state" /></td>   
           </tr> 
           <tr>     
            <td>Country :</td>     
            <td><form:input path="country" /></td>   
           </tr> 
           <tr>     
            <td>Address :</td>     
            <td><form:input path="address" /></td>   
           </tr> 
      <tr>     
       <td> </td>     
       <td><input type="submit" value="EditSave" /></td>     
      </tr>     
     </table>     
    </form:form>   
    
    </body>