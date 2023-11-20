# WEEK_10

- 객체 비교
- == (값이 같아도 다른 객체면 false)
- equals (다른 객체라도 값이 같으면 true)
- 1234554367234 ( 붙어있는 문자 삭제 )

### String

- String_1.compareTo(String_2) -> 같으면 0 다르면 사전에서 먼저 나온 순서로 먼저 나오면 음수 나중에 나오면 양수
- String_1.trim() -> 공백 제거 \t 이런 tap도 공백으로 보고 제거됨. 스페이스/ \t 제거

### StringBuffer

- 객체의 크기는 스트링 길이에 따라 가변적(차이)
- 문자열 길때 사용.
- .append -> String , StringBuffr을 넣을수 있고 뒤에 붙히는거
- capacity() -> 버퍼의 크기 확인 가능.
- .replace(int start , int end , String str) -> start, end까지의 스트링을 지우고 str으로 대치
- .reverse -> 반대 순서로 변경
- setLength -> 문자열 크기 변경됨. 길이보다 크면 null 문자 ''로 채우며 작은 경우는 기존 문자열이 잘린다.
- insert -> offset을 받고 그위치에 str을 넣어줌 그위치에 있던 값은 str값만큼 뒤로 밀려있음

### StringTokenizer

- 문자열 분리 split() 메소드와 동일한 기능
- String query = "name=nick&address=gu" -> StringTokenizer st = new StringTokenizer(query , "&");
- 위의 예시에서 StringTokenizer(query , "&="); 이렇게하면 or 연산 처리가 되기 떄문에 name, nick , adress , gu 이렇게 나눠지게 됨.
- countTokens => 토근수 개수 리턴
- hasMoreTokens => 다음 토큰 있으면 true
- nextToken => 다음 토큰 return

### Calendar

- 날짜 정보 제공
- js 랑 같이 month , hour 이 0 부터시작
- 객체생성 (Calendar now = Calendar.getInstance();) 시스템에서 시간을 가져오기 떄문에.
- int year = now.get(Calendar.YEAR);
- int month = now.get(Calendar.MONTH)+ 1 ;
- now.clear()
- now.set(Calendar.MINUTE, 30) // 30분으로 설정

### Math

- ceil => 정수 리턴 올림 실수 타입의 정수 리턴 기억
- floor => 내림
- random => 0.0 ~ 1.0 사이의 임의의 값을 doble 으로 반환
- sqrt => 제곱근
- 변수 한번은 찾아보기

### Collection

- Vector<E> ( 값이 5개면 5차원 상의 Vector -> Vector는 물체의 속도 )

- ArrayList<E> (Vector랑 비슷하지만 안에 들어있는 것이 객체임)

- LinkedList<E> (Array List 와 다르게 칸이아니라 줄로 연결 -> node 처럼)

- Stack<E> (위에서 아래로 -> First in Lest out)

- HashSet<E> ( 값만 있는거 )
- HashMap<K , V> ( key와 value 조합 object , dicnary )

- E (element) K (key) V(value)

- Vector<String> 문자열만 저장할 수 있는 벡터
- Vector<Integer>( Integer -> 객체 integer int 로 만들어진 객체 )

- 객체만 컬렉션의 요소가 될 수 있음
- 이때 객체는 Generic으로 설정가능 -> String 객체의 틀로 만들어 놓겠다 (Stack <String> ) 이러면 String 만 push 가능

### Vector <E>

- util class에 있음.
- 객체 null도 넣어둘 수 있음.
- 기본 타입은 Wrapper 로 boxing 을 한후 객체로 만들어 사용 int -> Integer
- 백터의 맨뒤에 객체를 추가하거나 , 중간에 객체 삽입이 가능. array에서 한거처럼 사용가능 array인데 안에 값이 객체들임.

- add , get , remove , capacity
- add 객체만 넣으면 가장 가장 뒤에 값을 넣고 index와 객체를 넣으면 원하는 위치에 넣을수 있음 이때 값들은 뒤로 밀리게 됨.
- get은 특정 index의 값을 가져올 수 있음 이때 빼서 가져오는 거
- capacity는 vector의 총 길이 (기본값 10)
- size는 vector안에 있는 객체들의 개수
- 이때 모두다 객체라 뽑아서 값을 다시 가져오는 과정을 거쳐야함. remove도 값이 아니라 index위치로
- 컬렉션을 매개변수로 받아 사용가능 (printVector(Vector <Integer> v){}) 이때 객체라도 Vector로 받은거라 다른거? 임
- 스레드 동기화 기능이 없기에 스레드 동기화를 지원 가능 -> 스레드 작업할떄 막 가져와서 사용가능.

### ArrayList<E>

- 그냥 가변적인 목록 총크기 capacity 이런게 x size만 존재 Vector과의 차이.
