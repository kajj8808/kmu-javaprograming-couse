# 9주차

### 패키지

- 클래스와 인터페이스가 하나의 디렉토리에 있는걸 패키지

### 모듈

- 패키지들이 모여있는 것이 모듈.
- 모듈 파일(.jmod) ZIP 포맷으로 압축된 파일
- 자바의 모듈
  - java.base 라는 모듈 안에는 io, lang , util , time , math등이 있음. 가장 기본적으로 사용되는 패키지들. util안에는 Scanner도 있음. java.util.Scanner(디렉토리 명 명시)
- import
  - 명시 하지 않고 사용.(java.util.Scanner scanner = new java.util.Scanner(System.in));
  - 명시 하고 사용.(import java.util.Scanner; Scanner scanner = new Scanner(System.in));
  - 명시 사용할때 특정 클래스 경로만이 아니라 패키지 내의 모든 클래스 가져오는 방법으로는 import.java.util.\*; 으로 util안의 모든걸 끌어 쓸수 있음.
- 클래스 -> 패키지 -> 모듈 그냥 계층(레이어)이 하나더 생겼다 생각하면 ok!
- 기본 모듈: java.base 모듈: io, lang, math, util 패키지 포함

### 패키지

- 패키지 선언 (package UI; public class Tools{ ... })
- 패키지 사용 (import UI.Tools; Tools t = new Tools();)
- 디폴트 패키지?
- 장점
  - 패키지 계층구조
  - 패키지별 접근 제한
