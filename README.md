# 🛠️ 공구리 (Gonguri) — 공동구매 플랫폼

---

## 📌 프로젝트 소개
**공구리**는 개인·소규모 판매자, 커뮤니티가 손쉽게 공동구매를 개설하고 참여할 수 있는 플랫폼입니다.  
주요 목표는 다음과 같습니다.

- 손쉬운 공동구매 개설/참여 흐름
- 정확하고 안전한 재고/결제 처리
- 마감 알림, 통계, 운영 편의 기능 제공
---

## ⚙️ 주요 기능 (Features)

- 사용자 인증/권한 (JWT 기반)
- 공동구매(그룹바이) 생성/참여/취소
- 재고 안전 감소 (Redis Lua + DB 동기화)
- 주문 비동기 처리 (Kafka)
- 결제 처리 연동 (외부 PG 연동 포인트)
- 마감 자동 처리 & 알림(문자/이메일)
- 관리자용 대시보드 (주문 / 통계 / 상품관리)

## ⚙️ 기술 스택
**Backend**
- Java 17, Spring Boot 3.x
- Spring Data JPA (Hibernate)
- Spring Security + JWT
- Redis (캐싱, 재고 처리)
- Kafka (비동기 주문 처리)
- MySQL

**Infra / DevOps**
- AWS (EC2, RDS, S3, Elastic Beanstalk)
- Docker, Docker Compose
- GitHub Actions (CI)
- Prometheus / Grafana (모니터링, 선택)

---

## 🗂️ ERD (Entity Relationship Diagram)

---

## 🏗️ 시스템 아키텍처

---

## 📋 기능 목록

---

## 🔁 시퀀스 다이어그램

---

---

## 📜 라이선스
