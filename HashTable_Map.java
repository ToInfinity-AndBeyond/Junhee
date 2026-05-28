import java.util.HashMap;

public class HashTable_Map {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        // put: key-value pair을 hash table에 추가하는 메서드.
        hashMap.put("name", "Minseok");
        hashMap.put("id", "12345");
        hashMap.put("age", "20");
        hashMap.put("major", "Computer Science");

        // get: key에 해당하는 value를 반환하는 메서드. key가 존재하지 않으면 null을 반환.
        String value = hashMap.get("name");
        System.out.println("Value for key 'name': " + value);


        // containsKey: 특정 key가 hash table에 존재하는지 확인하는 메서드. 
        boolean hasKey = hashMap.containsKey("id");
        System.out.println("Does the hash map contain key 'id'? " + hasKey);

        // remove: key-value pair를 hash table에서 제거하는 메서드. key가 존재하지 않으면 null을 반환.  
        String removedValue = hashMap.remove("age");
        System.out.println("Removed value for key 'age': " + removedValue);

        System.out.println(hashMap.get("age")); // null, because "age" key has been removed.

        
    }
}


// Hash Table은 key --> value 형태로 저장하는 자료구조.

/*
"name" --> "Minseok"
"id"    --> "12345"
"age"   --> "20"
"major" --> "Computer Science"
 */

// Hash Table의 주요 특징:
// 1. Key-Value Pair: Hash Table은 데이터를 key와 value의 �쌍으로 저장합니다. 각 key는 고유하며, value는 해당 key에 연결된 데이터를 나타냅니다.
// 2. Hash Function: Hash Table은 key를 hash function을 통해 hash code로 변환하여 데이터를 저장할 위치를 결정합니다. 좋은 hash function은 충돌을 최소화하고 데이터를 고르게 분포시키는 것이 중요합니다.
// 3. Collision Resolution: 서로 다른 key가 동일한 hash code를 가질 때 발생하는 충돌을 해결 . 
// 4. 속도가 빠름. 보통 배열은 처음부터 끝까지 순차적으로 탐색해야 하지만, Hash Table은 hash function을 사용하여 데이터를 빠르게 검색할 수 있습니다.
//  평균적으로 O(1)의 시간 복잡도를 가집니다.

// HT은 key를 숫자로 변환해서 (hashing) 배열의 인덱스로 사용. 

// Hashing alogrithm: "name"

/*
'n' --> 110
'a' --> 97
'm' --> 109
'e' --> 101
합: 110 + 97 + 109 + 101 = 417, table size가 10이면 417 % 10 = 7, "name"은 index 7에 저장됨.
 */

class Main {
    
}

// Collision: 다른 key인데 같은 index가 나올 수 있음. ex) "name"과 "age"는 같은 index 7에 저장될 수 있음.

// Load Factor = (number of entries) / (table size). Load factor가 높으면 충돌이 더 많이 발생할 수 있음. 
// 일반적으로 load factor가 0.7 이상이면 hash table의 크기를 늘리는 것이 좋음.

// Rehasing: hash table의 크기를 늘리고 기존 데이터를 새로운 hash table로 재배치하는 과정. 일반적으로 load factor가 일정 수준을 초과할 때 수행됨.


// Chaining: 한 index에 여러 개 저장 가능하게 Linked Listfmf tkdyd

// h(x) = x mod 6
// Insert 35 --> 35 % 6 = 5, index 5에 35 저장
// Insert 11 --> 11 % 6 = 5, index 5에 11 저장 (collision 발생, chaining으로 해결)
// Insert 25 --> 25 % 6 = 1, index 1에 25 저장
// Insert 17 --> 17 % 6 = 5, index 5에 17 저장 (collision 발생, chaining으로 해결
// chaining으로 해결된 hash table:
/*
index 0: null
index 1: 25 --> null
index 2: null
index 3: null
index 4: null
index 5: 35 --> 11 --> 17 --> null
 */

// Chaining의 장점: 충돌이 발생해도 데이터를 저장할 수 있음, 구현 쉬움, 데이터 개수 예측 어려울 때 좋음.
// 단점: 충돌이 많이 발생하면 검색 속도가 느려질 수 있음. 메모리 더 씀. 

// Open Addressing: 충돌이 발생하면 다른 빈 슬롯을 찾아 데이터를 저장하는 방법. 
// Linear Probing, Quadratic Probing, Double Hashing 등이 있음.

// Linear Probing: 충돌이 발생하면 다음 슬롯을 순차적으로 탐색하여 빈 슬롯을 찾는 방법.
// Insert 35 --> 35 % 6 = 5, index 5에 35 저장
// Insert 11 --> 11 % 6 = 5, index 5에 충돌 발생, index 6 (table size가 6이므로 index 0) 탐색, index 0에 11 저장
// Insert 25 --> 25 % 6 = 1, index 1에 25 저장
// Insert 17 --> 17 % 6 = 5, index 5에 충돌 발생, index 6 (table size가 6이므로 index 0) 탐색... 

// 문제점: clustering (충돌이 발생한 슬롯 주변에 데이터가 몰리는 현상) 발생 가능 --> 검색 느려짐.

// Quadratic Probing: 다음 칸을 단순하게 +1 이 아니라, +1, +4, +9, ... (i^2) 만큼 탐색하는 방법. clustering 문제 완화 가능.

// Double Hashing: 충돌이 발생하면 두 번째 hash function을 사용하여 탐색 간격을 결정하는 방법. clustering 문제 완화 가능.

// Open addressing의 장점: 메모리 효율적, 구현 간단, 배열만 사용, 데이터 개수 예측 가능할 때 좋음.
// 단점: collision 많으면 느려짐, 삭제 어려움.. 