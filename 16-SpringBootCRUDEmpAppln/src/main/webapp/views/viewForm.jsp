<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<table border="1"> 
<tr> 
    <th>EMPLOYEE ID</th> 
    <th> EMPLOYEE NAME</th> 
    <th>DESIGNATION</th> 
    <th>EMAIL</th>
    <TH>MOBILE NUMBER</TH>
    <th>GENDER</th> 
    <TH>CITY NAME</TH>
    <th>STATE</th>
    <th>COUNTRY</th>
    <th>ADDRESS</th> 
    <th>DELETE</th> 
    <th>EDIT</th> 
</tr> 
<c:forEach var="emp" items="${emps}">
    <tr>   
        <td>${emp.empId}</td>   
        <td>${emp.empName}</td>    
        <td>${emp.designation}</td>  
        <td>${emp.email}</td> 
        <td>${emp.mobileno}</td> 
        <td>${emp.gender}</td>
        <td>${emp.city}</td> 
        <td>${emp.state}</td> 
        <td>${emp.country}</td> 
        <td>${emp.address}</td> 
        <td>
            <a href="/delete/${emp.empId}">Delete</a> 
        </td> 
        <td> 
            <a href="/edit/${emp.empId}">Edit</a> 
        </td> 
        </td>  
    </tr>   
</c:forEach> 
</table>