## 7주차

## 인자 전달

- 기본 타입 값 전달 ( 기본 타입의 값들을 보내게되면 함수에서 값을 복사해서 사용 )
- 객체 전달 ( 실제 객체를 보내주기 떄문에 함수 안에서 객체의 값을 바꾸는 로직을 사용시 값이 변경이 됨 )
- 배열 전달 ( 배열{array} 를 보내줄 시 함수 안에서 값을 ++ 한다 하면 하나씩 변경됨 이때 값이 변경됨 1,2,3,4 => 2,3,4,5 )

## 객체의 소멸 & 가비지 컬렉션

- 객체 소멸 ( new에 의해 할당된 객체 메모리를 자바 가상 기계의 가상 메모리로 되돌려 주는 것 이떄 자바 응용 프로그램에서 임의로 객체를 소멸할 수 없음 그래서 안쓰는건 가비지 컬렉션에 들어감)
- 가비지 ( 자신을 가리키는 레퍼런스가 하나도 없는 객체 , 프로그램에서 사용할 수 없게 된 메모리 )
- 가비지 컬렉션 ( 가비지 컬렉터가 자동으로 가비지 수집 )

## 접근 지정자

- private (동일 클래스 내에서만 접근 가능하고, 상속 받은 클래스에서도 접근 불가)
- 디폴트
- protected (상속 받은 서브 클래스는 다른 패키지에 있어도 접근가능)
- public

## static

- 객체를 선언하지(생성하지)않아도 사용 가능하다는 것 (public static toDollar \ new Currency... x => Currency.toDollar())
- 이때 static으로 변수를 지정해주면 변수도 static하게 사용가능함.

## inheritance (상속)

- 상속을 하는 class 를 super class라고 함.
- super class는 상속 받는 class에서 공통적으로 있는 것들을 가지고 있으면 됨.
- extends 키워드를 사용해 상속을 받음(subClass extends superClass)

### super

- SubClass에서 상속한 superClass에 값을 전달하는 방법 (super(값) super에서 받는 방법은 public superClass(int x) 이렇게 하면 받아 쓸 수 있음)

### 업캐스팅(upcasting)

- 서브 클래스로 만들어놓은 객체를 superClass으로 변경가능함. (Student s = new Student() \ Person p = s; ) 이렇게 하면 자동으로 타입이 변환됨. 이떄 업캐스팅 된 객체는 superClass의 멤버만 접근가능.

### 다운캐스팅(downcasting)

- superclass 객체를 서브로 타입변환 하는것 ( Student s = (Student)p )이렇게 사용하면 됨. superclass가 가지지 않았던 멤버를 부를 수 있음.

### instanceof

- 레퍼런스가 가르키는 객체의 타입을 알수 있음
