## 9주차

- import (java.util 이런걸 매번 적기 힘들어서 미리 import 해놓음)

### Object class

### 객체 비교 vs. equals()

- 객체 비교 (레퍼런스를 비교 -> 같은 객체를 가르키고 있는지)
- equals (객체의 값을 비교 -> 같은 객체를 가르키고 있지 않아도 같은 값을 가지고 있으면 true)

### Wrapper class

- 자바가 가지고 있는 기본타입을 객체로 다루기 위한 8개의 클래스 통칭 (class폴더가 따로 x)
- String , Boolean 등이 여기에 포함됨
- 문자열 으로 생성 가능 (Integer I = Integer.valueOf(“10”);)

### 박싱(boxing) & 언박싱(unboxing)

- boxing (Integer ten = Integer.valueOf(10);)
- unboxing (int i = ten.Value();)

### String class

- 리터널 생성 (String s = "hello";)
- String 객체로 생성 (String s = new String("hello");)
- 둘다 다르게 만들어짐 (리터널은 같은 string값이 있으면 그 같은 값을 같은 메모리를 보게하지만, 객체로 만들경우 힙메모리 따로따로 만들어짐)
- split 으로 만들어지는 배열도 객체 배열임
