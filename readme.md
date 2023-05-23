# 🤨 Spring Core Study

---
## gradle 한글 인코딩 설정하기
1. shift 두번 타건 후 통합검색창에 vm검색
2. 사용자 지정 vm옵션 편집 클릭
3. 가장 아래줄에 `-Dfile.encoding=utf-8`입력 후 인텔리제이 재실행

---
## 인텔리제이 화면상 글씨 크기 조절
1. File 메뉴창에서 Setting 선택
2. 좌측 Editor 탭의 General을 선택
3. 상단의 Change font size(Zoom) with Ctrl-Mouse Wheel 체크 저장

---
## 테마 및 아이콘 설치
1. File 메뉴창 Settings에서 plugin에서 material 검색
2. Atom material icon, Material Theme UI 적용
   (File -> Settings -> Theme 검색 후 모양 탭에서 테마 선택)

---
## 깃허브 연동
1. File -> Settings -> Version Control -> 깃허브계정 등록
2. 하단부에 Terminal 열고 $ git rm r --cached 입력

---
## 자바 옵션이 안 보이는 경우
1. File -> Settings -> build tools -> gradle 하단 SDK세팅
2. File -> project structure -> projects의 SDK는 버전맞게
   하단의 Language level은 SDK default로 설정

---
## 스프링 실행순서
스태틱 -> 스프링컨테이너(힙의 일종) -> 스택 -> 힙(동적으로 데이터 생성)
* 스프링컨테이너에 필요한 요소들을 미리 만들어 놓기 때문에 힙을 사용하는 경우가 많이 없음

---
## IOC와 DI
객체지향 프로그래밍에서 프로그램 구조를 변경하는 디자인 패턴이다.
객체간의 의존성을 줄이고 결합도를 느슨하게 만들기 위해 사용
### 1. IOC (제어의 역전)
* 프레임워크에서 객체의 생성과 관리를 수행
* 개발자는 객체를 사용하기 위해 필요한 인터페이스를 정의
