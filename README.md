# ToDoList
예제 코드 없이 혼자 스프링 부트로 처음 만들어보는 To-Do-List 웹 어플리케이션 입니다.

🙋‍♂️ 이 프로젝트는 이걸 사용했어요!

### Java 8
### Spring Boot 2.4.8
### Spring Data JPA
### 데이터베이스 - H2 Database
### 템플릿 엔진 (서버 사이드) - Thymeleaf
### 테스트 코드 프레임 워크 - JUnit4
### 프론트 엔드 프레임 워크 - Bootstrap


## 작동 영상
![ezgif com-gif-maker](https://user-images.githubusercontent.com/52690419/125570322-c4c2bc2b-e04b-4f7c-86c1-ed67e7fae6d2.gif)

## 애플리케이션 아키텍처
![image](https://user-images.githubusercontent.com/52690419/125570661-711d539f-6364-4dce-9870-b5c027e75b2a.png)

### 기능 요구사항
- 내용과 마감 기한을 설정할 수 있다.
- 사용자는 저장한 todolist를 리스트로 볼 수 있다.
- 사용자는 저장된 todo를 삭제할 수 있다.
- 사용자는 특정 todo에 대해 언제 만들었는지 알 수 있다.


### 개선할점
- h2 database를 실행하지 않으면 에러가 발생해, 다른 사람들이 이 앱을 로컬에서 실행시키기 힘들다. -> 몇 가지 간단한 작업을 통해 실행시킬 수 있도록 바꾸고 싶다.
- 테이블이 단 하나(todo) 밖에 잡지 못해, 연관관계 매핑을 전혀하지 않았다. -> 여러가지 엔티티를 만들어 조금 더 복잡한 설계를 해야 할 것 같다.
- Spring 뿐만 아니라, Thymeleaf, Bootstrap 도 익숙치 않아 구글링만 하다보니 사전에 생각했던 그림과 달라진 부분이 많다. -> 프론트 영역도 학습이 필요하다.
