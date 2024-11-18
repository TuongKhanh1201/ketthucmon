<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@page import="model.TheLoai"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<TheLoai> dsTheLoai = (ArrayList<TheLoai>) request.getAttribute("dsTheLoai");
%>
<div class="card mb-3">
    <h3 class="card-header">Category</h3>  
    <ul class="list-group list-group-flush">
        <%
            if (dsTheLoai != null) {
                for (TheLoai theloai : dsTheLoai) {
        %>
        <li class="list-group-item"> <a href="san-pham?maloai=<%=theloai.getMaLoai()%>"><%=theloai.getTenLoai()%></a> </li>           
            <%
                    }
                }
            %>
    </ul>   
</div>
