<h1>JVM & JAVA 동작원리</h1>
<hr/>

JAVA의 동작원리를 이해하기 위해서 먼저 JVM(자바가상머신)을 알아야한다.

동작원리와 JVM에 대하여 순서대로 설명하겠다.

* 개발자가 자바코드를 작성하면(.java) 자바 컴파일러가 자바 바이트 코드로 컴파일한다.


* 컴파일 된 바이트 코드를 JVM에 전달한다.


* JVM-Class Loader가 필요 클래스들을 로딩하여 JVM의 메모리(Runtime Data Area)에 올린다.


* 실행 엔진(Execution Engine)이 올라온 코드들을 명령어 단위로 하나씩 실행한다.
