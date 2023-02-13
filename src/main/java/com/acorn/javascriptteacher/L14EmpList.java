package com.acorn.javascriptteacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//톰캣에서 동적페이지(서블릿)를 생성하기 위한 2가지 약속!
//서블릿으로 정의할 타입을 HttpServlet 으로 정의
//서블릿을 리소스로 등록하기 위해 DD(web.xml)에 주소를 등록 (@WebServlet)
@WebServlet("/l14_emp_list.do")
public class L14EmpList extends HttpServlet {
    //클라이언트에서 리소스를 요청하는 2가지 방식 (GET : url, POST: 양식제출)
    //doGet 클라이언트(브라우저)가 /l14_emp_list.do를 url 호출하면 톰캣이 해당 리소스의 doGet()함수를 실행
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter(); //resp.getWriter() : 리소스로 반환될 문자열 작성
        //java.sql.* :JDBC java 제공하는 db 접속 객체들
        //JDBC 가 mysql 에 접속하기 위해서는 mysql-j-connector.jar 가 필요하다
        String user="root";
        String pw="mysql123";

        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        String empListStr="";
        try { //try catch 오류가 발생해도 시스템이 멈추지 않게 하는 예외처리
            Class.forName("com.mysql.cj.jdbc.Driver");//동적로딩의 대상
            //동적로딩  : 특정 객체(DriverManager)가 작업을 수행할때 객체를 생성하는 행위 (제어의 역전)
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/scott",user,pw);
            pstmt=conn.prepareStatement("SELECT * FROM EMP");
            rs=pstmt.executeQuery(); //질의어를 실행하는 함수
            while(rs.next()){
                empListStr+=rs.getInt("empno");
                empListStr+=rs.getString("ename");
                empListStr+=rs.getString("job");
            }
        }catch (Exception e){ //부모타입의 예외를 작성할 수록 더 많은 예외 처리를 한다.(Exception 모든 예외처리 가능)
            e.printStackTrace();
        }
        out.println("<h1>Scott.emp list 출력</h1>");
        out.println(empListStr);
        //java 문서가 바뀌면 class 로 컴파일하고 톰캣에 배포된 webapp 바꿔야한다. (배포!)
        //4시 10분까지 쉬었다가 오세요~ 오류는 해결해드릴께요

    }
}
