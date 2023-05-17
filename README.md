### 핵사고날 연습

- 클린아키텍처 해보기
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
    "comment": "너무 피곤하다.",
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
    "comment": "너무 피곤하다.",
    "createdDateTime": "2023-05-18T00:16:39",
    "lastModifiedDateTime": "2023-05-18T00:16:39"
    }
]

```