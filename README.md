# 회원 인증 기반 게시판 프로젝트

Spring Boot 기반의 웹 애플리케이션으로,  
본 프로젝트는 기능 구현을 넘어 **Layered Architecture의 구조적 의미와 실무적 가치**를 이해하기 위해 진행되었습니다.

---

## 프로젝트 개요

- **프로젝트명**: 회원 인증 기반 게시판
- **개발 목적**
  - Layered Architecture의 책임 분리 원칙 이해
  - 웹 계층과 비즈니스 로직 분리 경험
  - 세션 기반 인증 흐름 이해
- **개발 인원**: 1명 (개인 프로젝트)
- **개발 환경**: Eclipse 기반 STS 3

---

## 기술 스택

| 구분 | 기술 |
|----|----|
| Language | Java 17 |
| Framework | Spring Boot |
| IDE | Eclipse (STS 3) |
| Web | Spring MVC |
| ORM | Spring Data JPA (Hibernate) |
| DB | MySQL |
| Auth | Session 기반 로그인 |
| Build Tool | Gradle |
| Test | JUnit |

---

## 설계 포인트

- Controller는 요청/응답 처리만 담당
- Service 계층에서 모든 비즈니스 로직 수행
- Repository 계층을 통한 데이터 접근 분리
- Entity 직접 노출 방지를 위해 DTO 사용
- 유지보수 및 확장성을 고려한 패키지 구조 설계

---

## 설계 관점에서의 정리

각 계층의 책임을 명확히 분리함으로써,
비즈니스 로직이 웹 기술이나 데이터 접근 방식에 종속되지 않도록 설계하였습니다.  
이를 통해 유지보수성과 확장성이 높은 구조의 중요성을 체감할 수 있었습니다.  
가시성이 높은 설계 구조로 데이터의 흐름을 이해하기 쉬웠으나,  
아직 대규모 데이터나 높은 트래픽 환경에서 Layered Architecture의 강점을 직접 검증하지는 못했습니다.  
이 경험은 이후 Layered Architecture 및 보다 확장된 아키텍처를 이해하는 기반이 되었습니다.
