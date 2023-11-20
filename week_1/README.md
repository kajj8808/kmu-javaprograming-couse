## week_1

### infomation

- JAVA VM
- JAVA DATA TYPE

### 자바 용어?

- private , protected , public -> keyword
- 메소드 안의 var -> local variable

### 식별자

class , variable , const , method( 함수 )

- @ # ! 와 같은 특수문자, 공백 또는 tap 불가
- boolen return , null return 불가
- $test ( 가능 ) , 3test ( 불가 ) , test_3 ( 가능 ) , 테스트\_1 ( 가능 ) , %test ( 불가 )

### 메모 (2023.09.06)

- OOP( 객체지향 언어 )
- class 안의 함수 -> method
- JAVA 는 null safety 가 없음. ( int a; ) 변수 이름만 가지고 선언할수있음.
- 자바 class 생성방법 public class Hello { } ( 스네이크 방식을 따르고 있는걸로 보임 )
- 주석문 ( // , /\* \*/ )
- 자바 class에서는 main 메소드가 init 함수로 지정(예약)되어 있음 부르면 자동 호출. 이처럼 예약이 되어있어 하나만 선언가능.
- 대소문자 구분 ( method 는 시작은 소문자( javascript 와 같이 isLoading... ), class 시작은 대문자로 )
- 문자열 이 섞여있으면 문자열로 연산 ( 1 + " hello " -> 1 hello )
- 명시적 ( long a = 2321L; ) 문자로 마지막에 적어놓으면 명시가 되서 보기 편하다함.
- \u -> 유니코드를 사용하겠다. \u0041(A)
- while 에서 1 사용 불가( while(1) -> error)
- int a = null; 불가 기본타입에는 불가 String a = null;은 가능함.
- var a = "test"; 가능 이때 지역변수 일때만 사용가능. 이때 값을 보고 auto로 int 등을 잡아주기에 var a; 이떄 에러가 발생 nullsafty!
- 타입 강제 변환 # double n = 3.123; int a = (int)n; => a = 3;

### 단축키

- System.out.println( "..." ); -> sysout
