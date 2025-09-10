# 🛠️ 공구리 (Gonguri) — 공동구매 플랫폼



## 📌 프로젝트 소개
**공구리**는 개인·소규모 판매자와 커뮤니티가 쉽고 간편하게 공동구매를 개설하고 참여할 수 있는 플랫폼으로 소비자들이 함께 모여 더 저렴한 가격에 제품을 구매할 수 있도록 설계되었습니다.

대량 공동구매(GroupBuy) / 소량 공동구매(MiniBuy) 두 가지 형태의 공동구매를 제공하며 단순한 공동구매를 넘어, 다양한 기능을 통해 완성도 높은 쇼핑 경험을 제공합니다.

특히 **대규모 사용자 트래픽 환경에서도 안정적인 데이터 처리가 가능**하도록 설계되어 있어, 사용자가 몰리는 이벤트성 공동구매 상황에서도 끊김 없는 서비스 제공을 목표로 합니다.



##  주요 기능 

- 회원 관리 시스템
- 구매자·판매자 구분 공동구매 목록/조회/참여
- 실시간 쿠폰 발급 및 관리
- 주문 비동기 처리 및 상태 전이 관리
- 마감 자동 처리 및 알림 발송 구현
- 관리자용 대시보드 (주문 / 통계 / 상품관리)

##  기술 스택
**Backend**

- Java 17, Spring Boot 3.x
- Spring Data JPA (MySQL RDS)
- Spring Security + JWT
- Redis
- Kafka
- springdoc-openapi (Swagger UI)

**Infra & DevOps (AWS)**

- Elastic Beanstalk
- RDS, S3, ElastiCache
- GitHub Actions (CI/CD)
- Nginx & Certbot
- Docker
- Prometheus + Grafana

**Collaboration Tool**

- Github : 코드 협업
- Notion : 문서 작업
- Discord : 연락



## 🗂️ ERD
<img width="2070" height="1152" alt="Image" src="https://github.com/user-attachments/assets/0c24b602-05bb-4945-a43c-05a1918ae0d4" />


## 🏗️ 시스템 아키텍처
<img width="2596" height="1296" alt="Image" src="https://github.com/user-attachments/assets/bae9543c-0cad-4677-af4d-f1843e875fac" />

## 📋 기능 목록
**사용자 관련**

- 회원가입 / 로그인 : Spring Security + JWT 및 소셜 로그인 (Kakao) 지원
- 본인 인증: 휴대폰(SMS API) 및 이메일 인증을 통한 안전한 회원가입 제공
- 마이페이지

**상품 관리**

- 상품 등록 / 수정 / 삭제
- 상품 조회  : 전체 상품 목록 및 상세 정보
- 판매 모니터링 및 관리
- 판매자 환경 웹 / 모바일 웹 분리 :
- 모바일 웹 : 상품의 **간단한 정보**를 빠르게 확인 가능
- 웹: 상품 등록, 수정 등 **상세하고 디테일한 관리 작업** 수행

**공동구매**

- 대량 공동 구매  :  판매자가 등록한 인기 상품을 다수가 함께 구매하여 저렴한 가격에 제공하며 결제까지 연결되는 구조의 공동구매
- 소량 공동 구매   :  2+1 묶음 상품 등과 같은 상품을 위해 소량 인원을 모집하는 구조이며 일반 유저도 등록이 가능.
결제가 아닌 인원 모집을 목표로 하여 빠른 참여 유도

**주문 및 결제**

- 주문 생성 / 조회 / 취소 / 삭제

**선착순 쿠폰**

- 쿠폰 생성 / 수정 / 삭제
- 한정 수량의 쿠폰을 선착순 발급 및 적용

**알림**

- 공동구매 모집 완료/취소, 주문 완료 등의 주요 이벤트 시 문자 알림 발송


## 🔁 시퀀스 다이어그램
**1.회원**

**회원가입/로그인**

- Spring Security + JWT + SMTP 기반 인증
- JWT를 활용한 AccessToken 관리
- Redis와 쿠키를 활용한 RefreshToken 관리

**회원가입**
<img width="1000" height="901" alt="image" src="https://github.com/user-attachments/assets/63d5a94f-a027-4715-8d4f-395e87fda4cc" />

**로그인**
<img width="1000" height="901" alt="image" src="https://github.com/user-attachments/assets/afd9039d-62bf-4333-b77a-d99a6ab2f4fa" />

**2. 주문**

<img width="1212" height="648" alt="image" src="https://github.com/user-attachments/assets/63ec8316-c43d-4ceb-afe1-bd4d7a57d3cf" />

