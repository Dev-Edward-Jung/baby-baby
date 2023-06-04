# 🎃아기자기
Spring JPA 프로젝트 아기자기


# 👓기획배경
- 획일화된 교육에 지친 아이들에게 휴식을 제공하고자
- 장애인이라는 이유로 차별당하는 아이들에게 동등한 기회를 제공함

# 🎉목적 및 기대 효과
- 맞벌이 부부에게 휴식과 여가시간 보장
- 사회적으로 이슈가 되고있는 장애인과 비장애인간의 갈등에 대한 관심과 노력의 필요성을 대중에게 알려줌


# 🛠사용 툴
- Java
- jQuery
- Thymeleaf
- QueryDSL
- Spring Data JPA
- Spring Boot
- HTML, CSS, JS
- Oracle
- JDK 11.0.15
- YAML
- JSON
- REST:API
- Sourcetree
- DBeaver
- IntelliJ IDEA
- git, gitHub
- JUnit5
- POSTMAN
- Lombok
- Naver OAuth
- Kakao OAuth
- Kakao Map
- Spring Security

# 💪프로젝트에서 맡은 역할 
- 서비스 기획 및 전반적인 구성 디자인 업무 수행
- 프론트 업무 : 마이페이지, 공지사항
- 백엔드 업무 : 지금 우리아이들은, 놀러가요(메인 이벤트), 회원 상세 페이지, 결제
- DB 설계 및 구축 
- 지금우리아이들은, 놀러가요 글쓰기 전체(파일 업로드 및 작성)
- 지금 우리 아이들은 배너사진 및 무한스크롤 구현
- 놀러가요 리스트페이지 무한스크롤 및 검색 구현
- 놀러가요 상세페이지 구현
- BootPay API를 통한 놀러가요 결제 구현

# 🎈ERD
![캡처](https://github.com/dev-Adward/baby-baby/assets/122762326/8ef166aa-117a-4879-aa98-a22a1ad38f07)



# 📅 아기자기 프로젝트 진행률
아기자기 프론트 진행률
![baby_front](https://github.com/dev-Adward/baby-baby/assets/122762326/f5f210a4-60ba-4e35-b5cd-7cf9a07c71ea)

아기자기 백엔드 진행률
![baby_back](https://github.com/dev-Adward/baby-baby/assets/122762326/46e8c673-c48f-43f4-bfe9-4d07b4608238)



# ✨프로젝트에서 느낀점
- 어려웠던 부분 
 : 테이블이 30개가 넘어가는 상황에서 QueryDSL로 테이블을 조인해서 데이터를 불러오는 과정이 너무 어려웠습니다.
그 과정에서 myBatis와는 다른 문제에 많이 시달렸습니다. 저의 생각과는 다르게 조인을 해도 조인이 안되는 상황에서 많은 당황스러움이 있었으며,
어떻게 그래프 탐색을 해야될지 막막한 상황이 많았습니다.

- 문제를 해결했던 부분
 : 강사님께 질문도 하고, 모르는것을 계속 구글링 하면서 JPA와 QueryDSL에 대해서 많은 이해가 되었습니다. 
특히 조인이 안되는 상황에서는 from절 안에 해당 객체의 객체를 넣으면 안된다는 것을 깨닫고, QueryDSL을 사용했습니다.

- 총평 
: 처음엔 너무 어려웠지만, 하면 할수록 QeuryDSL과 JPA의 매력에 빠져버렸습니다. 
MyBatis에서는 하지못했던 그래프 탐색이라는 것과 객체로 다른 객체를 찾는다는 것이 너무 흥미로웠습니다.
