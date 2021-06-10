#### 작업예정.
- 스프링 프로젝트 순서
- 1. JUnit > 마이바티스(DB핸들링) > AOP(다중게시판기능) > 페이징기능+ > 검색기능 > 트랜잭션기능(게시판삭제시 댓글과 첨부파일까지 삭제처리되게) > 첨부파일기능(파일업로드/다운로드)배열+ > 스프링시큐리티+(로그인 인증/권한체크)
- 2. 댓글기능(RestAPI-백엔드,Ajax처리-프런트단) > 네이버아이디로그인(외부API사용) > 헤로쿠클라우드배포
- 3. 문서작업(회면기획서XLS 제작, 화면설계서PPT 제작)
- 1달간(프론트엔드)은 주로 UI계속 진행(VS code개발환경) 하면서,
- 피곤할때, 자바|스프링(이클립스-egov전자정부프레임워크개발환경) 기본 언어 실습진행.
- 피곤할때, 오라클DB(SQL디벨러퍼개발환경) Ansi-SQL(표준SQL) 기본 언어 실습진행CRUD.
- 2달째부터(백엔드), 주로 스프링으로 실습 진행(납품용-이력서포트폴리오용)
- VS code에서 만든 UI를 이클립스에서 JSP로 변경 한 후 스프링웹프로젝트를 진행합니다.
- 헤로쿠 클라우드에 배포할때,메퍼폴더의 mysql폴더내의 쿼리에 now()를 date_add(now(3), interval 9 HOUR) 변경예정.(이유는 DB서버 타임존 미국이기 때문에)

#### 20210610(목) 작업.
- 컨트롤러를 이용해서 관리자단 회원관리화면 JSP 만들기 진행 시작.
- JUnit 마치고, 관리자단 회원관리(CRUD) jsp까지는 작업합니다. 이후 앞에 내용을 참조해서 확장해 나가는 작업이 이뤄집니다.
- 수업전 내용 확인 합니다.(아래)
- 쿼리실습에서 .equals함수 사용에 대해서 설명할때,아래 isEmpty메서드와 착각해서 이야기 한 내용이 있어서 정정 합니다.
- 자바에서 객체가 공백 또는 비었는지 비교할때, 예를 들면, 우리프로젝트에서 첨부파일이 있는지 비교할때 아래 처럼 사용하지 않고
- if(save_file_name != null && "".equals(save_file_name))
- 다음처럼 짧게(널과공백체크를 한번에) 사용합니다.(아래)
if(!save_file_name.isEmpty())//게시판 첨부파일 체크시 사용 예정
=========================================
- GTM시간(그리니치전문대기준-표준시)-KST한국시간과는 9시간
- DB서버에 타임존설정 Asia/Seoul되어 있으면, 그냥 사용.
- 만약 위 GTM +9시간해서 Insert, Update 한국시간으로 사용.
- JUnit에서 회원관리 나머지 Read 테스트 진행.
- 오라클일때 확인: (어제 카톡방에 있음) SELECT
TO_CHAR(systimestamp + numtodsinterval( 9, 'HOUR' ), 'YYYY-MM-DD HH24:MI.SS.FF4') from dual;
- Mysql(마리아dB)확인 :(어제 카톡 단톡방에 있음) SELECT DATE_ADD(NOW(3), INTERVAL 9 HOUR);

----------------------------------------
- 업데이트 실습은 회원암호를 스프링시큐리티5 암호화(1234->헤시데이터)로 일괄변경 실습예정.
- 정방향 암호화 가능, 역방향 복호화는 불가능(JAVA용 스프링시큐리티암호화, DB용 MD5 등등)

```
BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
String userPwEncoder = passwordEncoder.encode(memberVO.getUser_pw());
memberVO.setUser_pw(userPwEncoder);
```

#### 20210609(수) 작업.
- 프로젝트를 진행: 보유기술 70%(솔루션있는업체) + 신기술 30%(개발사도 모릅니다.) - 9할 성공.
- PageVO.java 클래스 생성 마무리.
- JUnit에서 위 작업한 내용을 기준으로 selectMember() 테스트 진행. (검색, 페이징)
- <![CDATA[ 쿼리]]> : 태그 안쪽에 부등호를 상용하기 위해서 문자열 변환 태그를 사용.
- 쿼리에서 변수와 문자열과의 연결할 때는 +(자바)X, ,(X), ||(O)
- JUnit에서 회원관리 나머지 CRUD 테스트 진행.
- 컨트롤러를 이용해서 관리자단 회원관리화면 JSP 만들기 진행예정.

#### 20210608(화) 작업.
- 페이징에 사용되는 변수(쿼리변수+VO변수) 아래
- queryStarNo, queryPerPageNum, page, perPageNum, startPage, endPage
- 검색에 사용되는 변수(쿼리변수만): 검색어(search_keyword), 검색조건(search_type)

```
--SQL쿼리 페이징을 구현해서 변수로 삼을것을 정의
--PageVO의 멤버변수로 사용예정
SELECT TableB.* FROM
(
    SELECT ROWNUM AS RNUM, TableA.* FROM
    (
        SELECT * FROM tbl_member
        WHERE user_id LIKE '%admin%'
        OR user_name LIKE '%사용자8%'
        ORDER BY reg_date DESC
    ) TableA WHERE ROWNUM <= (1*5)+ 5 --  (page*b)+b
) TableB WHERE TableB.RNUM > 1*5      --  (page*b)
--페이징쿼리에서 필요한 변수는 2개
--현재페이지수의 변수 page*b == queryStartNo
--1페이당보여줄 개수의변수 b == queryPerPageNum
--PageVO에서 필요한 추가변수: page
--UI하단의 페이지 선택번호 출력할때 사용하는 변수(아래) 
-- perPageNum 변수받아서 startPage, endPage 를 구해서
-- 하단의 페이지 선택 번호를 출력
```

- 스프링코딩 작업순서 1부터6까지(아래)
- 1. ERD를 기준으로 VO클래스를 생성.
- M-V-C 사이에 데이터를 입출력하는 임시저장 공간(VO클래스-멤버변수+Get/Set메서드) 생성
- 보통 ValueObject클래스는 DB테이블과 1:1로 매칭이 됩니다.*오늘 MemberVO만듬
- 2. 매퍼쿼리(마이바티스사용)를 만듭니다.(VO사용해서쿼리생성)-내일만들예정
- 3. DAO(데이터엑세스오브젝트, DTO)클래스를 생성(SqlSession사용쿼리실행).*오늘 Sql세션은 root-context에 빈으로 만들었습니다.(1개)
- IF인터페이스는 만드는 목적: 복잡한 구현 클래스를 간단하게 구조화 시켜서 개발자가 관리하기 편하게 정리하는 역할 -> 기사시험 책: 캡슐화 구현과 관련(알약 캡슐-안에 어떤 약이 있는지 모르게 먹게하기) 프로그램에서도 캡슐화는 구현 내용은 몰라도, 이름만 보고 사용하게 만든 것.
- 스프링 부트(간단한 프로젝트)에서는 4번 Service클래스가 없이 바로 컨드롤러로 이동합니다.
- 4. Service(서비스)클래스생성(서비스에 쿼리결과를 담아 놓습니다.)(1개)
- 게시물을 등록하는 서비스 1개(tbl_board-DAO1, tbl_attach첨부-DAO2)
- JUnit에서 위 작업한 내용을 CRUD 테스트(선배작업) -> 대리,사원에게 아래 작업을 맡깁니다.
- 5. Controller(컨트롤러)클래스생성(서비스결과를 JSP로 보냅니다.)
- 6. JSP(View파일) 생성(컨트롤러의Model객체를 JSTL을 이용해 화면에 뿌려 줍니다.)

#### 20210607(월) 작업.
- 마이바티스 추가 순서
- 1. pom.xml에 의존성 추가.
- 2. 마이바티스 설정 파일 추가(쿼리를 저장할 위치 지정+파일명 지정)
- JUnit로 CRUD 실습(아래).
- JUnit의 oldQueryTest메서드처럼 직접쿼리를 사용하지 않고, 쿼리를 관리하는 프로그램으로 제어를 합니다.
- 위 쿼리를 관리하는 프로그램이 마이바티스 입니다. 그래서, 마이바티스 모듈을 추가한 후 JUnit실습을 진행합니다.
- 스프링: 관리자단, 회원관리부터 스프링 작업예정.
- 책 스프링 웹프로젝트는 개발 STS(스프링툴슈트) 툴. => 기반은 이클립스 기반을 확장.
- 책 스프링 웹프로젝트는 개발 전자정부표준프레임워크 개발 툴. => 기반은 이클립스 기반을 확장. => 전자정부표준프레임워크를 커스터마이징(제외)

---------------------------------------------------------------------
- 스프링에서는 마이바티스를 이용해서 퀴리를 관리하게 됩니다.
- 이전에는 자바코드(jsp코드)안에 쿼리를 만들어서 프로그램을 제작하였음. -> 문제점발견(스파게티 코딩)
- MVC로 분리: MOdel부분의 쿼리를 SQL쿼리를 분리하도록 기능을 추가한 것이 마이바티스입니다.
- 마이바티스(mybatis): 형은 아이바티스(ibatis) 지금 X -> 마이바스트(현재)
- 스프링(마이바티스) 나오기 전에는 쿼리를 모아서 작업을 프로시저로 만들어서 작업을 했습니다.
- 지금은 스프링으로 옮기지 못한 프로그램만 제외하고는 대부분 마이바티스로 쿼리를 관리합니다.
- 그래서, 마이바티스 메이븐 셋팅을 합니다.
- 오라클의 DB관리 로그인정보(Application Express웹프로그램이름): admin/apmsetup -> 암호변경요청: Apmsetup1234%(대문자추가+특수문자추가+숫자추가)

```
--SQL디벨러퍼에서 system 로그인 후 아래 쿼리로 XE2사용을 완벽하게 지우기(아래)
select * FROM all_users;
-- all_users는 테이블X, 시노님(동의어)
--delete from all_users WHERE username='XE2';
-- 시노님=테이블명이 사용하기 힘들정도로 길거나
--오라클은 스프링과 같은 방식 패키지명안에 함수,
--프로시저(오라클프로그램)를 만들수 있습니다.
--패키지명이 길어서 사용시 개발자에게 부담이 됨.
--위 상황을 해결하도록 만든 것이 시노님(동의어)임.
DROP USER XE2 CASCADE; --XE2사용자를 지울때,
--XE사용자의 생성한 테이블까지 모두 지우는 명령
--CSS(Cascade계층형 Style Sheet)
```
- 현업에서는 오픈소스인 mysql(마리아DB)를 사용하실 기회가 더 많습니다.-개발자가 많은 편.
- 오라클은 납품시 SW비용이 산정이 되어서 사용하실 기회가 적지만, 개발자가 상대적으로 적은 편.
- 보통은 학교, 시청, 기업체 전산실에 부탁을 해서 XE사용자를 추가해 달라고 요청해서, 발급받은 계정으로 개발을 시작
- 오라클 기초이론 마무리: 시퀸스(스프링에서 사용-AutoIncreament자동증가기능)
- 만약 시퀸스(AI)기능이 없다면, 게시물 작성시 첫번째, 두번째 게시물 등등을 구별하는
- 숫자를 계속 추가하려면, 현재까지 저장된 게시물의 최고번호값(MAX)을 구해서 +1 해야 합니다.(개발자가 Insert시)
- DB에서 기본으로 위 Max값을 구해서 + 1하는 로직을 만들게 됨. 이 기능이 시퀸스(AI) 입니다.
- 스프링 프로젝트에서는 2개 시퀸스를 만듭니다.(게시물 시퀸스SEQ_BNO, 댓글 시퀸스SEQ_RNO)
- 시노님(긴 객체를 개발자가 타이핑하기 어려워서 만든 단축 이름) 예, sys.dual -> dual 단축이름으로 사용가능
- 오라클: 더미데이터 일괄등록 예정. 회원관리(100명), 게시판관리(공지사항50개,겔러리50개)
- 위 더미데이터는 프로시저(함수)라는 DB프로그램방식으로 추가합니다.
- 오라클: 댓글은 수동등록 후 마무리.

#### 20210604(금) 작업.
- 오라클일때: localhost:1521/XE 접속URL끝의 XE 서비스(서버) ID명 1개 > XE, XE2 스키마2개(DB2개) 존재합니다.
- 오라클은 사용자명(XE)이 테이블스페이스명(DB명)입니다. 사용자(XE2)워크스페이스를 추가하면 테이블스페이스 (DB)가 새로 만들어집니다.(구버전은 테스크답프로그램->지금은 웹프로그램 사용자추가/DB(테이블스페이스)추가)
- Mysql(마리아DB): localhost:3306/XE URL끝의 XE 스키마명(DB명)
- junit테스트시 SQL에러를 디버그하는 방법은 jdbc드라이버 -> log4jdbc드라이버 바꾸면, SQL에러가 나오게 됩니다.
- junit에서는 SQL에러가 보입니다. 콘솔창에는 보이지 않습니다. 콘솔창에서 SQL로그상황이 나오게 하는 드라이버를 추가pom.xml에 추가합니다.
- 오라클: 07장 마무리 후 13장으로 바로 실습예정.(나머지는 아래 실습 후)
- 스프링: JUnit테스트: oldQueryTest메서드 실습 예정.
- 오라클: 08,09,10,11,12,14장 실습예정.
- 스프링: JUnit테스트: 회원관리부분 CRUD 테스트 진행예정.
- 오라클: 더미데이터 일괄등록 예정. 회원관리(100명), 게시판관리(공지사항50개,겔러리50개)
- 스프링: 관리자단, 회원관리부터 스프링 작업예정.

#### 20210603(목) 작업.
- 작업비중(시간)=관리단프로그램(70%)+사용자단(30%)
- 스프링에서 오라클연동 방법 2가지:
- 1. jdbc(Java DabaBasa Connection) 확장모듈 pom에 추가
- 2. 오라클 접속 드라이버 확장 모듈을 pom에 추가X 직접 jar 파일을 추가
- root-context.xml 파일에 오라클 커넥션 빈(스프링클래스)을 추가
- 스프링이 관리하는 클래스를 추가하는 방법 2-1: @Controller,@Repository,@Service,@Component
- 스프링이 관리하는 클래스를 추가하는 방법 2-2: -context.xml에서 빈(been태그)을 추가하면, 스프링 클래스 됨
- JUnit테스트: 오라클 연동한 후 회원관리부분 CRUD 테스트 진행예정
- 오라클 05장부터 CRUD 실습예정.
- admin 회원관리(jsp디자인) 부터 프로그램 작업 시작예정.

#### 20210602(수) 작업.
- 예외처리하는 목적: 에러상황에서도 프로그램이 중단되지 않도록 하는 것이 주목적(에러상황을 세련되게 넘기게 처리)
- 스프링에서는 개발자가 처리하는 100개의 코딩에서 2~3개 정도(파일업로드, 다운로드)이고, 대부분 throws Exception 스프링으로 넘김.(예외의 전파)
- 쓰레드:thread, 실행되는 프로그램을 명시, 1개의 프로그램에는 보통 1개의 쓰레드가 실행(웹프로그램은1:1쓰레드임), 특이한 경우(http웹네트워크프로그램인경우-게시물 다운로드버튼 다운로드 100G 쓰레드가 실행 되면서, 리스트버튼을 클릭했을때 목록보기 쓰레드가 동시에 실행) 여러개 쓰레드가 실행이 필요한 경우가 있습니다.
- 예외처리: Throwable 오브젝트가 실행시 에러가 발생하면, 예외(내용)를 보낼 때(던질 때) 사용하는 클래스 Throwable클래스 입니다.
- 스프링에서는 예외(에러)정보를 스프링 처리합니다.
- 자바앱에서는 예외(에러)정보를 개발자가 처리합니다.(개발자가 손이 많이 갑니다.) 지금 실습합니다.
- 예외처리: 에러발생시 프로그램이 중지되는 것을 방지하고, 계속 프로그램을 사용할 수 있도록 처리하는 방법=Exception
- 패키지는 관련기능을 한곳에 모아서 개발자 관리하기 편하게 하기 위해서 구분한 이름(폴더명)
- Controller클래스 + home/index.jsp(화면) 한쌍 입니다. 그래서,컨트롤러클래스 만든 변수를 index.jsp에서 사용가능하게 됩니다.
- 안드로이드앱 = 엑티비티(java) + 레이아웃.xml(화면) 한쌍
- C#닷넷 = test.aspx.cs(프로그램) + test.aspx(화면) 한쌍
- 일반홈페이지(cafe24)-URL직접접근이 가능(보안위험높음)
- MVC웹프로그램 차이점-URL직접접근이 가능X(보안위험이낮음)-관공서,대학,은행 주사용
- MVC프로젝트에도 URL직접접근이 가능한 resources폴더 직접접근이 가능-static콘텐츠(html,css,js)를 모아 놓은 폴더.views폴더 jsp는 직접접근이 불가능
- views폴더처럼 직접 접근이 불가능한 콘텐츠는 Controller(라우터)로 접근하게 됨
- views/home/index.jsp 액박처리, 분해는 관리자단 실습작업 후 작업합니다.
- 개발 순서: ERD제작 -> html제작 -> jsp제작(현재:관리자단10기능  작업 후 사용자단 5기능)
- admin 폴더 만든이후 분해OK. Junit 실습 후 작업합니다.
- Junit(Java Unit Test): 자바 단위 테스트(서비스프로그램 만들기전 프로토타입 시제품 제작)- Junit CRUD 작업 후 본격작업시작.
- 로거의 레벨: DEBUG > INFO > WARN > ERROR > FATAL
- 개발할때: DEBUG 로거레벨을 설정
- 납품할때: WARN으로 로거레벨을 변경
- admin 부터 프로그램 작업 시작예정.
- 4장 패키지와 예외처리 실습 후 오라클 CRUD 실습. 

#### 20210601(화) 작업.
- 에러: 404(file not found 경로이상일때), 500(자바프로그램에러)
- 프로젝트의 버전을 올립니다. -> 외부라이브러리 부분의 버전을 올림 - 메이븐 컴파일러 -> pom.xml 버전을 관리 메이븐은 수정 및 추가 -> maven 메뉴애서 maven update 메뉴사용
- Controller클래스에서 생성한 변수 사용 (자바)model객체전송(스프링)return home -> home.jsp 출력
- 출력하는 방식1: 25년전부터 방식 EL(Express Language)방식출력-${변수} , <%=${변수} %>
- 많이 사용하는 방식 JSTL방식(*표준) 사용. 출력,반복,조건 등등 다양한 방식
- 언어를 배우는 순서: 주석, 디버그하는방법 > 변수 > 메서드(함수) > 클래스 > MVC모델
- 디버그하는 방법: 자바(System.out 이용해서 콘솔창에 출력)
- 스프링에서는 logger(로거)를 사용해서 디버그 내용을 출력.
- 스프링이 관리하는 클래스(빈)의 종류 3가지.(사용법은 개발자가 만드는 클래스명 상단에 입력)
- 1.@Controller 클래스빈: 라우터역할 메서드를 만듭니다.(라우터역할의클래스기능)
- 2.@Service 클래스빈      : 비지니스로직 메서드를 만듭니다.(개발자위주의외부클래스기능)
- 3.@Repository 클래스빈: Model처리 메서드를 만듭니다.(DB핸들링외부클래스사용)
- 위 3가지의 @를 사용하는 클래스는 DI(객체생성-의존성주입), AOP, IoC(제어의 역전-자동메모리관리)
- 프런트 개발자가 작업한 결과 백엔드 개발자가 확인.
- 일괄 바꾸기 1. "/home -> "/resources/home
- 일괄 바꾸기 2. '/home -> '/resources/home

- VS code 작업한 html를 이클립스에 배치를 합니다. (프런트 개발자가 작업 결과 백엔드 개발자가 받아서 배치합니다.)
- resources 폴더에 static콘텐츠(html, css, js, font) 배치합니다.
- ERD기준으로 게시판 UI 마무리합니다.-board_write.html 부터 시작
- 오늘부터는 VS code -> 이클립스에서 작업합니다.
- 관리자단 AdminLTE적용-스프링시간 선택 후 아래 작업진행예정
- (회원관리CRUD-jsp, 게시판생성관리CRUD-jsp)
- html을 분해(1개의 페이지를 2개로 분해, 1.header.jsp(메뉴를공통), 2.footer.jsp(공통))
- 이클립스로 작업한 html 내용을 -> resources 폴더(admin,home,root파일까지)로 배치
- 스프링 작업의 시작

#### 20210531(월) 작업.
- 토드(sql디벨러퍼와 비슷상용)에서는 버튼으로 포워드엔지니어링이 처리.
- 무료sql디벨러퍼에서는 버튼X. DDL문을 실행해서 포워드엔지니어링을 처리.
- 참고, mysql을 워크벤치는 무료이지만, 버튼으로 포워드엔지니어링이 가능
- sql쿼리 3가지로 분류:
- 초기DDL문: Data Definition Language. 데이터 정의 언어 Create table문
- 유지DCL문: Data Control Language. 데이터 제어 언어 Commit, rollback
- 개발DML문: Data Manufacture Language 데이터 조작언어 CRUD 쿼리
- ERD 그림 만든것을 물리 테이블로 만드는 것: forward 엔지니어링
- 데이터 딕셔너리를 모델과 동기화: 자료사전 (데이터의 데이터)을 DB테이블과 동기화
- 데이터 딕셔너리는 메타 데이터와 동일합니다.:콘텐츠X, 구조, 구성 정보만 존재
- 물리테이블을 ERD 그림으로 만드는 것: reverse 엔지니어링(기존DB분석시 사용)
- 스프링시큐리티는 2단계: 구현예정
- 1단계. 로그인인증(ENABLED): AUTHENTICATION(로그인X, 글쓰기 기능X, 관리자X)
- 2단계. 권한체크(LEVELS): AUTHORLTY (관리자-admin URL(폴더 접근 가능), 일반회원은 사용자홈페이지에서 공지사항X, 겔러리만 사용가능합니다.)
- 1:N관계? 게시물1개에 댓글 n개 달릴 수 있습니다.
- E-R다이어그램은 그림일뿐, 물리DB(테이블)은 ERD기준으로 생성가능.
- PK를 AI(Auto Increment자동증가)로 만들기: 오라클(시퀸스객체로기능구현), Mysql(AI라는 필드속성으로 처리)
- ERD애서 Relation 생성: 게시판타입테이블(부)과 게시물관리테이블(자)의 관계를 생성
- 부자의 관계는 부모의 PK를 기준, 자식에게는 FK(Foreign Key)로 관계를 맺습니다.
- 게시판타입: notice, gallery 2가지가 존재한다면,
- Relation관계가 필요한 이유 : 공지사항이나 겔러리 게시판이 아니면, 개발자가 예외처를 하지 않아도 다른 게시판으로 등록하는 상황 발생이 되지 않게 됨.
- 데이터 무결성을 유지하는 역할.(외래키 관계)
- 필드 데이터형3: Timestamp(시간도장) 년월일시분초밀리초, Date(년월일까지)
- 필드 데이터형2: CLOB(CHAR LOGN BYTE) 글내용이 많을때 사용하는 데이터형태
- 필드 데이터형: VARCHAR2(2바이트를 1글자-한글),VARCHAR(1바이트 1글자-영문자용)
- 테이블구성: 필드(컬럼, 열)=테이블의 멤버변수(자바VO클래스의 멤버변수)
- 필드구성: PrimayKey(주키, 기본키, 고유키)=테이블영역에서 고유한 ID를 말함(중복되지 않는 값)
- PK(개인을 식별할 수 있는 값): 로그인 id, 개인 이메일 주소, 주민번호등등, 게시판타입
- RDBMS : RelationDataBaseManagementSystem(관계형데이타베이스관리시스템)
- 오라클: 테이블스페이스(TableSpace) = 스키마(Scheme:Mysql) = 데이터베이스(DB-MS-SQL)
- 지난주 금요일날, 오라클 웹용 관리프로그램에서 XE라는 테이블스페이스를 XE사용자로 추가했음.
- EntityRelationDiagram (ERD-객체관계그림): Entity=테이블을
- MVC 스프링프로젝트에서 M이 Model 이고, 스프링프로젝트 구성중에 DB를 가리킴.
- 참고로, V는 View jsp를 말합니다.
- 참고로, C는 Controller고 클래스를 말합니다.
- 데이터 모델: Model Object를 형상화 시킨것을 모델이라고함. 데이터베이스를 말함.
- 설치시 암호는 apmsetup 로 통일 합니다.
- 스프링프로젝트 ERD 제작 후 게시판 UI디자인 적용

#### 20210528(금) 작업.
- 추상클래스 실습은 오늘, 인터페이스 실습은 스프링에서 엄청하시게 됩니다.
- extends관계클래스에서 this.(현재클래스), super.(부모클래스)
- 다형성? 메서드 @오버라이드(상속), 메서드 오버로딩(동일 함수명의 파라미터의 갯수, 종류 틀린 메서드)구현됩니다.
- 오버라이드: 상속 받아서 재정의 메서드 @오버라이드 = 다형성구현했다.
- 오라클11g ExpressEditon 설치 예정 OracleXE112_Win64.zip
- SQL디벨러퍼를 다운받아서 압축풉니다. -ERD재작할 예정
- StructuredQueryLanguage: 구조화된 질의 언어(오라클 서버) -> 답변
- QueryString: URL에서 전송하는 값(서버에 질의문)을 문장으로 저장한 내용 ?로 시작
- CommendLineInterface : SQL*Plus 터미널화면으로 SQL쿼리 실행 X
- GrapicUserInter: SQL디벨러퍼 원도우화면 에디터에서 SQL쿼리 실행 O
- SQL Developer 프로그램으로 ERD 다이어그램그림으로 프로그젝트 구조 제작 예정
- EntityRelationDiagram: 테이블관계도형(아래)
- 프로젝트 진행: 발주(클라이언트) -> 수주(개발사) -> 디자인UI(Client-Dev) -> ERD(이사, 팀장) -> 코딩시작(ERD 보면서+UI소스프로그램입히기)
- ERD에서 SQL쿼리가 생성 -> 물리테이블을 생성
- -------------------------------------------------------------------------
- 첨부파일(자식)->게시판테이블(부모)<-댓글테이블(자식)
- 자바앱에서는 객체를 생성 후 사용이 끝나면, 메모리에서 삭제하는 명령이 필수
- 객체를 메모리에서 삭제: Object = null; Object.close();
- 스프링에서는 내장된 가비지컬렉터(garbage쓰레기수집가)가 자동 실행 사용하지 않는 객체를 자동으로 지워줌
- 위와 같이 개발자가 하던 메모리 관리를 스프링이 대신 = IoC(Inversion Of Control)제어의 역전. 스프링 특징 3가지(IoC, AOP, DI) 

#### 20210527(목) 작업.
- 3장 객체와 클래스 부터 시작
- 스프링에서는 클래스 extends(상속)보다는 인터페이스 (implements)를 더 많이 사용합니다.
- abstract클래스(추상클래스): 구현 내용 없이, 메서드 명만 있는 클래스
- 메서드 명만 있기(구현 내용이 없기) 때문에, *객체로 만들 수 없는 클래스 입니다.
- 부모로서 자식에게 상속만(메서드 이름만)해서 재사용 가능하게 됩니다.
- *객체로 만들 수 없다? 실행 가능한 클래스 사용 못하지만, 프로그램을 구조화 시킬때 필요.
- Step1 aaa = new Stpe1();//이렇게 생성자로 객체를 만들지 못함. 
- final클래스: 부모가 될 수 없는 클래스(상속해서 재사용이 불가능한 클래스임)
- 접근제어자: public(패키지 위치에 상관 없이 접근-제일 많이 사용)
- public 클래스안에서 멤버변수는 private을 제일많이 사용.(private보안성갖춤)
- public 클래스안에서 멤버메서드는 public을 많이 사용(외부 다른 클래스의 메서드를 실행 가능) 대신, 변수가 private이기 때문에, 직접 수정 않됨. 실행만 됩니다.
- 인스턴스(클라우드주로사용)=오브젝트(자바)=객체=실행중인클래스
- 클래스 자료형(int, long, String처럼)는 멤버변수, 멤버메서드, 서브클래스 등등 포함할 수 있습니다.=C언어 구조체 자료형
- 이클립스 커밋, 푸시가 않될 때 커밋 팝업창 하단에 Force 항목을 체크하시고, 진행하면 됨.

#### 20210526(수) 작업.
- 붕어빵: 붕어빵틀(클래스) -> 붕어빵이 구워져서 나오면 오브젝트(객체)
- OOP: 자바를 객체지향(클래스를 실행가능하게 하는) 프로그래밍
- 객체 = 오브젝트 = 인스턴스 = 실행가능한 클래스
- 객체(Object) 와 클래스? 클래스형 자료를 실행 가능하게 만든 것을 오브젝트(객체)라고함.
- 추상화(Abstract): 오프라인 업무 -> 대표 업무만 뽑아낸 클래스 = 추상클래스
- 클래스는 멤버변수 + 멤버메서드(실행) + 서브클래스
- 변하지 않는 변수=상수=변수명을 대문자(원주율)PI=3.141592...
- 보통 상수변수는 클래스의 제일 상단 위치합니다.
- 기본형(정수 자료형-소문자 시작): byte<short<int<long, 10L(롱타입 변수)
- 기본형(실수 자료형-소수점, 소문자 시작): float<double, 12.34f(실수형 숫자)
- 기본형(문자형-''단따옴표 값을 입력해야 에러가 나지 않음): char, 1개 문자만 입력.
- 문자형에서 유니코드 \u숫자 입니다.
- 기본형(블린형-참, 거짓): boolean, (0|1)
- 참조형(대문자로 시작): 참조형 변수의 대표적인 변수 클래스입니다.
- 클래스변수(저장된 상태) -> 실행 가능하게 되었을 때, 인스턴스 변수(메모리 로드된 상태)
- 인스턴스라는 말보다는 오브젝트라는 말을 더 많이 사용합니다.
- String(문자열 클래스 변수): 대문자로 시작.
- 상수 변수를 명시적으로 만들 때: final int MAX = 100;
- for-cach 반복문전까지 실습

#### 20210525(화)
- 스프링MVC프로젝트: ModelviewController? 약자 MVC구조(웹프로그램구조)
- src/test/java폴더 만들었습니다.: 테스트작업은 이 폴더에서 하라는 약속
- src/main/java폴더가 진짜 프로그램작업을 하는 폴더
- javac HelloWorld.java -encoding UTF-8(한글 내용도 컴파일됨)
- 위 java컴파일러로 실행한 결과 -> HelloWorld.class 실행파일이 생성됨
- 주), 클래스파일은 실행 패키지의 루트(최상위)에서 실행해야 함
- kr.or.test패키지 root폴더 src/test/java폴더에 실행을 해야함
- java kr.or.test.HelloWorld 클래스를 실행하게 됨
- 이클립스 나오기 전, 25년전 javac 컴파일에서 class프로그램 만들었습니다.
- 지금은 터미널에서 javac 사용하지 않고, 이클립스에서 바로 실행합니다.
- javac? 자바앱 컴파일러 -> 클래스 실행파일을 만듬 .class(바이트코드) (자바환경JVM실행)
- 메이븐?Maven: 웹프로그램 컴파일러 -> 웹프로그램(앱) 실행파일을 만듬 .war (톰캣에서 실행)
- 메이븐이 컴파일할때, 자바소스만 컴파일하는 것이 아니고, 외부 라이브러리도 가져와서 바인딩(묶어줌)하게 됨 = 패키징 이라고 합니다. = .war(와르)파일로 패키징 됨.
- 메이븐이 관리하는 외부 라이브러리파일(lib) 목록을 저장하는 파일 pom.xml입니다.
- pom.xml에서 자바버전을 1.6 -> 1.8 변경 후 메이븐을 업데이트 합니다.
- 외부 라이브러리 파일을 참조하는 방식을 영어로 = dependency디펜던시
- jar파일? JavaARchive = jar 자바클래스를 패키징한 파일입니다.