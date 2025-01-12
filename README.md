# 🐝 포켓몬 도감 프로젝트 🐝


# 1. 프로젝트 소개

---

## 🚩개요

포켓몬 도감 프로젝트는 포켓몬 팬들이 쉽고 재미있게 포켓몬에 대한 정보를 탐색할 수 있는 플랫폼입니다. 사용자들은 다양한 포켓몬을 조회하고, 게임을 통해 포켓몬에 대한 지식을 쌓을 수 있으며, 커뮤니티와 소통할 수 있는 기회를 제공합니다. 이 도감은 사용자 친화적인 인터페이스와 다양한 기능으로 포켓몬 트레이너의 꿈을 실현할 수 있도록 돕습니다.

## 🚩기획 배경 및 기대 효과

많은 사람들이 어릴 적 꿈꿔왔던 포켓몬 트레이너의 삶. 포켓몬은 단순한 게임을 넘어, 세대와 문화를 초월한 상징이 되었습니다. 그러나 포켓몬에 대한 정보와 콘텐츠는 방대하여, 많은 팬들이 원하는 만큼 깊이 있게 탐구하기 어려운 상황입니다. 이 도감은 그러한 필요를 충족시키기 위해 기획되었습니다. 포켓몬의 다양한 정보와 특성을 체계적으로 정리하고, 이를 쉽게 탐색할 수 있는 플랫폼을 제공함으로써, 사용자들이 포켓몬 세계에 더 가까워질 수 있도록 돕습니다. 특히, 포켓몬 사진의 일부를 확대해 맞추는 게임은 기억력과 관찰력을 기를 수 있는 재미있는 경험을 제공하여, 사용자의 흥미를 유도하고 지속적인 참여를 이끌어낼 것입니다.

또한, 신규 팬들도 쉽게 접근할 수 있도록 설계하여, 포켓몬 커뮤니티의 확장과 활성화를 기대합니다. 이 프로젝트를 통해 포켓몬에 대한 열정을 나누고, 모두가 함께 즐길 수 있는 공간을 마련하고자 합니다. 

# 2. 개발 환경

---



<img src="https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white"> 
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=Thymeleaf&logoColor=white">
<img src="https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white">
<img src="https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white">
<img src="https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white">
<img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white">



# 3. UserFlow

---

## 🚩사용자관점
![사용자관점](https://github.com/user-attachments/assets/8656635c-8a8b-4f60-b149-b5d39514a580)


## 🚩관리자관점
![관리자관점](https://github.com/user-attachments/assets/629b723a-8905-4894-bb97-93e33ca03241)



# 4. 기능 명세서

---

## 🚩관리자 페이지

### 🏷️로그인

- 로그인 성공 시 관리자 페이지로 이동

### 🏷️마이페이지

- 로그인 시 접근 가능하도록 설정
- 포켓몬 수집 목록 조회

### 🏷️관리자 정보 관리

- 관리자 정보 조회
- 관리자 정보 수정
- 관리자 권한 부여
- 관리자 권한 삭제

### 🏷️회원 관리

- 가입된 회원 목록 및 정보 조회
- 회원 삭제

### 🏷️기본 설정

- 사이트 기본 정보 수정 및 조회
- 회원가입 약관 관리

### 🏷️게시판 관리

- 게시판 목록
- 게시판 등록
- 게시글 관리

### 🏷️상품 관리

- 상품 목록 조회
- 상품 등록
- 상품 등록 분류 관리
- 배송 정책 관리



## 🚩사용자 페이지

### 🏷️메인페이지

- 메뉴 선택 시 각 메뉴로 이동

### 🏷️로그인

- 아이디, 비밀번호 일치 여부 확인
- 로그인 성공 시 메인페이지로 이동
- 회원이 아닌 경우 회원가입 페이지로 이동

### 🏷️로그아웃

- 로그아웃 시 마이페이지 메뉴 접근불가 설정

### 🏷️회원가입

- 이메일 형식 확인
- 비밀번호 8자리 이상 입력 확인
- 비밀번호, 비밀번호 확인 동일여부 확인
- 회원가입 성공 시 로그인 페이지로 이동

### 🏷️마이페이지

- 로그인 시 접근 가능하도록 설정
- 회원 정보 조회
- 회원 정보 수정
- 비밀번호 변경 시 비밀번호 일치 여부 확인
- 포켓몬 찜목록 조회

### 🏷️포켓몬 도감

- 포켓몬 이미지 클릭 시 포켓몬 개별 페이지로 이동

### 🏷️포켓몬 게임

- 포켓몬 대전 게임 진행
  


# 5. 회의록
---
https://level-throat-c67.notion.site/16f30930082780b19472f44abb775790
