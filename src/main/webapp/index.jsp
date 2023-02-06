<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>JavaScript 에 대해 배워보자</h1>
<p>js의 역사 : 브라우저를 동적(브라우저가 이벤트에 반응)으로 만들기 위해 개발된 언어로
    JAVA 가 굉장히 인기있는 언어라 이름에 JAVA 을 붙여서 JavaScript 가 되었다.
    java 에서 이름사용을 못하게 하여 ECMAScript es로 불린다. es06는 표준화된 버전을 의미한다.
</p>
<p>바닐라 js: js로 된 라이브러리나 프레임워크(jquery,react,view,.....)을 사용하지않고 순수한 js 문법만 사용.</p>
<p>옛날옛날 10년전에는 바닐라 js로 개발이 불가능 했다. es6로 표준화 되면서 가능해 졌다.(크로스 브라우징)</p>
<nav>
    <ul>
        <li><a href="l00_variable_const.html">0.변수와 상수(var,let,const)</a></li>
        <li><a href="l01_var_hoisting.html">1.window 필드 var 변수의 hoisting 현상(*)</a></li>
        <li><a href="l02_primitive_type.html">2.기본데이터타입(number,bigint,string,boolean,symbol,null,undefined)</a></li>
        <li><a href="l03_object_type.html">3.자료형 (Object {},ProtoType)</a></li>
        <li><a href="l04_array_list.html">4.배열 (ArrayList [])</a></li>
        <li><a href="l05_function.html">5.함수 </a></li>
        <li><a href="l06_for.html">6.반복문 (for,내부반복문,iterator for)</a></li>
        <li><a href="">7.배열의 내부 반복문과 정렬</a></li>
        <li><a href="">8.if,switch</a></li>
        <li><a href="">9.함수와 타입</a></li>
        <li><a href="">10.JSON 과 Object</a></li>
        <li><a href="">11.브라우저 객체 window 와 document</a></li>
        <li><a href="">12.document DOMTree 와 node 객체</a></li>
        <li><a href="">13.js를 참조하는 방법들 (태그,파일 (defer async))</a></li>

    </ul>

</nav>
<script>
    //HTML 에서 js의 실행 순서는 DOMTree 와 연관있다~
    //html 문서가 브라우저에서 로딩되면서 스크립트 태그가 있거나 실행한다.
    //만약 스크립트 문서가 참조되고 있으면 다운받고 실행한다.
    //alert("안녕하세요 스크립트로 경고창을 생성했습니다!.");
    console.log("안녕하세요 스크립트로 경고창을 생성했습니다!.");
</script>
</body>
</html>