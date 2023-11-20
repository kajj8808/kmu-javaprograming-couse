## Iterator<E>

- 배열 중간에 값을 넣는 경우가 많은 경우 Vector , Array list 를 사용하지 않고 Vector, ArrayList 를 상속받아 링크 구조의 컬렉션을 사용.
- vector 을 이용해 Iterator 객체를 얻을 수 있음.
  ```
  Iterator<Integer> it = vector.iterator()
  ```
- it.hasNext()
- it.next()

## HashMap<K,V>

- key 와 value 으로 구성되어 있는 컬렉션
- 삽입 삭제 빠르다
- 요소 삽입 put()
- 요소 검색 get()
- HashMap 예시
  ```
  HashMap<String , String> hashMap = new HashMap<String , String>();
  ```
- 여기서 Obejct.keys와 같은 역활을 하는 것은 keySet임

  ```
  Set<String> keys = javaScore.keySet()
  ```

- Iterator 와 같이 쓰기.

  ```Iterator<String> it = keys.iterator();
  while(it.hasNext()) {
    String name = it.next();
    int score = javaScore.get(name);
    System.out.println(name + " : " + score);
  }
  ```

### LinkedList

- 링크드 리스트임. 비연속적 메모리 공간에 존재 뒤에 있는 리스트 아이탬만 알려주면됨. 동일한 값 저장할때 메모리를 array보다는 더 쓰게됨. 검색은 용의 하지만 많은 데이터를 사용할때는 비효율적 일수도 있음.
- 링크드 리스트 코드 예시
  ```
  LinkedList<String> l = new LinkedList<String>();
  ```
