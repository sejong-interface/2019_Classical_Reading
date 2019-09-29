# JAVA 5(2)

<Do it! 자바 프로그래밍 입문> 이라는 책을 바탕으로 기본적인 자바 문법들을 정리해보았다.

참고 자료: <Do it! 자바 프로그래밍 입문>, 박은종 저



## 객체 / 인스턴스 / 클래스
**객체**: 의사나 행위가 미치는 대상
**클래스**: 객체를 코드로 구현한 것
**인스턴스**: 클래스가 메모리 공간에 생성된 상태

**클래스의 생성자를 호출 => 인스턴스가 만들어짐**
=> 하나의 클래스로부터 각각 다른 인스턴스를 생성할 수 있다.
=> 클래스라는 틀 안에서 인스턴스를 여러 개 만들어 프로그램을 구현.

이해하기 어려워서 예시...
ex) '학생'이라는 추상어는 뜻이 하나이지만, 학생 개개인은 다른 특성을 가진 여러 명인것과 마찬가지입니다.



## 참조 변수 사용하기
**참조변수(레퍼런스)**란? 객체의 위치(주소)를 저장하는 변수.
=> 멤버 변수와 메서드를 참조하여 사용할 수 있음.

```JAVA
ex) 참조변수 : studentAhn, 멤버 변수 : studentName, 메서드 : getStudentName

studentAhn.studentName = "안연수"; //참조 변수로 멤버 변수에 이름을 저장
System.out.println(studentAhn.getStudentName()); //참조 변수로 메서드 사용
```



## 인스턴스와 힙 메모리 자세히 알아보기

new Student() 선언 => Student 생성 => 가지고 있는 멤버 변수를 저장할 공간 필요
이를 저장할 때 사용하는 메모리가 **힙 메모리**

=> 클래스 생성자를 하나 호출하면 **인스턴스가 힙 메모리에 생성**

​	ex) Student studentAhn = **new** Student();
​	생성된 클래스를 studentAhn 변수 (지역변수)에 대입, 인스턴스가 저장된 메모리를
​	studentAhn 변수가 가리킨다.



## 힙 메모리

힙은 프로그램에서 사용하는 **동적 메모리 공간**
프로그램은 스택, 힙, 데이터 이렇게 세 영역 사용.
동적으로 할당된 후에 사용이 끝나면 메모리를 해제
=> JAVA에서는 **가비지 컬렉터**가 자동으로 메모리를 해제해줌.



## 헷갈리는 개념 용어 정리

**객체** : 객체 지향 프로그램의 대상, **생성된 인스턴스**
**클래스** : **객체**를 프로그래밍하기 위해 코드로 만든 상태
**인스턴스** : 클래스가 **메모리에 생성**된 상태
**멤버 변수** : 클래스의 속성, 특성
**메서드** : **멤버변수**를 이용해 **클래스의 기능을 구현**한 것.
**참조 변수** : 메모리에 생성된 **인스턴스를 가리키는 변수** 
**참조값** : 생성된 인스턴스의 메모리 주소 값.



## 생성자

클래스를 처음 만들 때 멤버 변수나 상수를 초기화해주는 역할. => 클래스를 생성할 때만 호출.

생성자 이름은 클래스 이름과 같고, 생성자는 반환값이 없다.



**생성자가 없는 클래스는?**

클래스 파일을 컴파일할 때, 컴파일러에서 자동으로 생성자를 만들어 준다. => **디폴트 생성자**

다만, 생성자가 하나도 없는 경우에만 디폴트 생성자 제공.

```java
package constructor;

public class PersonTest{
	public static void main(String[] args){
		Person personLee = new Person();
	}
}
```

=> 위와 같은 코드의 경우 디폴트 생성자가 없어서 오류가 난 것.

```java
package constructor;

public class Person{
	String name;
	float height;
	float weight;
	
	public Person(){} // 디폴트 생성자 직접 추가
	
	public Person(String pname){
		name = pname;
	}
}
```





**생성자 오버로드**

> 오버로드 : 객체 지향 프로그램에서 메서드 이름이 같고 매개변수만 다른 경우

클래스에 두 개 이상의 생성자 제공하는 것을 ㄴㄴ말한다.

매개변수의 수와 타입이 다르다면 여러 개의 생성자를 선언할 수 있다.

여러 가지 생성자 중 하나의 생성자를 선택하여 사용할 수 있다.

```java
public class Car{
        String name;
        int number;

        public Car(){

        }

        public Car(String name){
            this.name = name;
        }

        public Car(String name, int number){
            this.name = name;
            this.number = number;
        }
    }
```



```java
 public class CarExam4{
        public static void main(String args[]){
            Car c1 = new Car();
            Car c2 = new Car("소방차");
            Car c3 = new Car("구급차", 1234);
        }
    }
```

*출처 : https://programmers.co.kr/learn/courses/5/lessons/171*



## 참조 자료형

기본 자료형 변수 : 크기가 정해진 기본 자료형(int, char...)으로 선언.

참조 자료형 변수 : 클래스 자료형으로 선언.

```java
package reference;

public class Student{
	int studentID;
	String studentName; //JDK에서 제공하는 참조 자료형.
	int koreaScore;
	int mathScore;
    String koreaSubject;
    String mathSubject;
}
```

![ㄴㅁㅇㄹ](C:\Users\user\Downloads\ㄴㅁㅇㄹ.png)

```java
package reference;

public class Subject{
	String SubjectName;
	int ScorePoint;
}

#########################

package reference;

public class Student3{
	int StudentID;
	String studentName;
	Subject korean;
	Subject math;
}
```



## 정보 은닉

**접근 제어자** : 객체 지향 프로그램에서는 예약어를 사용해 클래스 내부의 변수나 메서드, 생성자에 대한 **접근 권한**을 지정할 수 있습니다.

**public** : 변수, 메서드는 외부 클래스에서 접근 가능. 외부 클래스가 사용할 수 있음.

**private** : 외부 클래스에서 사용할 수 없음.

```java
package hiding;

public class Student{
	int studentID;
	private String studentName;
	int grade;
	String address;


    Public String getStudentNane(){
        return studentName;
	}

	public void setStudentName(String studentName){
		this studentName = studentName;
    }
}
```



```java
package hiding;

public class StudentTest{
	public static void main(Stringp[] args){
		Student studentLee = new Student();
		studentLee.studentName = "이상원"; //오류 발생 : 외부 클래스의 접근이 허용되지 않기 때문.
		
		system.out.println(studentLee.getStudentName());
	}
}
```



private 선언한 변수 외부 코드에서 사용 => public 메서드를 제공하지 않고 사용할 수 있는 방법.

get(), set() -> 사용해서 접근 가능.



```java
package hiding;

public class Student{
	int StudentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName(){
		return studentName; // private 변수에 접근해 값을 가져옴
	}
	
	public void setStudentName(String studentName){
		this.studentName = studentName; //private 변수에 접근해 값 지정.
	}
}
```





