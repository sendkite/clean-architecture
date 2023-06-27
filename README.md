## Testcontainer + Spring Boot

본 프로젝트는 Josh Long의 세미나에서 소개한 Testcontainer 사용하여 개발 환경 구성을 적용했다.

### How to run

- 실행전에 도커가 설치되어 있어야한다.
- 스프링부트 3.1 부터 개발 시점에 Testcontainer와 Docker Compose를 사용하여 외부서비스 관리를 할 수 있다.
- 개발 시점에 Testcontainer로 Mysql를 띄워서 개발을 할 수 있도록 구성했다.
- 프로젝트는 TestAutoAilApplication 클래스에서 실행한다. 
- 실행 후 코드 변경이 일어나면 command + shift + F9으로 recompile하여 수정 사항을 반경한다. 

![프로젝트-실행](https://github.com/sendkite/clean-architecture/assets/90877864/2435e5ed-5b3e-4a07-8ad1-dbdbd9424437)

- 명령어로 recompile 하면 아래와 같이 0.3초 안에 변경된 코드가 반영되는 것을 확인할 수 있다.

![실행시간](https://github.com/sendkite/clean-architecture/assets/90877864/02983b06-b86a-48a1-8f56-fd0efb9e60e3)


### 핵사고날 연습

- 클린아키텍처을 적용하여 작성했다.
  - [우아한테크 아키텍처 영상](https://www.youtube.com/watch?v=saxHxoUeeSw&list=WL&index=1)
  - [NHN 클린 아키텍처 영상](https://www.youtube.com/watch?v=g6Tg6_qpIVc&t=145s)
- 
- 간단한 회고 등록하고 조회하는 API를 만들었다.

```json
POST localhost:8080/retrospectives
// Req body
{
    "wellDone": "코틀린 멀티플렛폼 관련 찾아보기",
    "improvement": "AWS 관련해서 파고들기",
    "actionItem": "질문 3개 이상하기",
    "comment": "너무 피곤하다."
}
// Response
{
    "id": 1,
    "wellDone": "코틀린 멀티플렛폼 관련 찾아보기",
    "improvement": "AWS 관련해서 파고들기",
    "actionItem": "질문 3개 이상하기",
    "comment": "가자!",
    "createdDateTime": "2023-05-18T00:16:39",
    "lastModifiedDateTime": "2023-05-18T00:16:39"
}
            
GET localhost:8080/retrospectives

// Response
[
    {
    "id": 1,
    "wellDone": "코틀린 멀티플렛폼 관련 찾아보기",
    "improvement": "AWS 관련해서 파고들기",
    "actionItem": "질문 3개 이상하기",
    "comment": "가자!",
    "createdDateTime": "2023-05-18T00:16:39",
    "lastModifiedDateTime": "2023-05-18T00:16:39"
    }
]

```