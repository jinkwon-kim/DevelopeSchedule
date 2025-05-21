일정API
| **기능** | **Method** | **URL** | **Request** | **Response** | **상태코드** |
| --- | --- | --- | --- | --- | --- |
| 일정생성 | Post | /schedule | 요청 Body  <br>할일 : String  <br>작성자 : String  <br>비밀번호:  <br>String | 할일 : String  <br>작성자: String  <br>일정ID : Long  <br>작성일:LocalDate  <br>수정일:LocalDate | 200: 정상등록 |
| 일정전체조회 | Get | /schedule/{scheduleId} | 요청 Param  <br>수정일 :LocalDate  <br>작성자명:String | 할일 : String  <br>작성자: String  <br>일정ID : Long  <br>작성일:LocalDate  <br>수정일:LocalDate | 200: 정상조회 |
| 일정단일조회 | Get | /schedule | 요청Param  <br>일정 ID: Long | 할일 : String  <br>작성자: String  <br>일정ID : Long  <br>작성일:LocalDate  <br>수정일:LocalDate | 200: 정상조회 |
| 일정수정 | Put | /schedule/{scheduleId} | 요청 Param  <br>요청ID :Long  <br>요청Body  <br>비밀번호: String <br>작성자명: String| 할일 : String  <br>작성자: String  <br>일정ID : Long  <br>작성일:LocalDate  <br>수정일:LocalDate | 200: 정상수정 |
| 일정삭제 | Delete | /schedule/{scheduleId} | 요청Param  <br>요청ID: Long  <br>요청 Body  <br>비밀번호:String |  | 200: 정상삭제 |
유저 API
| **기능** | **Method** | **URL** | **Request** | **Response** | **상태코드** |
| --- | --- | --- | --- | --- | --- |
| 회원생성 | Post | /members | 요청 Body  <br>할일제목 : String  <br>할일작성자 : String | 상태코드:  <br>int  <br>핵심데이터:  <br>object  <br>할일식별자:  <br>id | 200: 정상등록 |
| 회원전체조회 | Get | /members | 요청 Param  <br>수정일 :LocalDate  <br>회원이름:String | 상태코드:  <br>int  <br>핵심데이터:  <br>object  <br>할일식별자:  <br>id  <br>회원이름:  <br>String  <br>회원나이:  <br>int | 200: 정상조회 |
| 회원단일조회 | Get | /members/{memberId} | 요청Param  <br>회원 ID: Long | 상태코드:  <br>int  <br>핵심데이터:  <br>object  <br>할일식별자:  <br>id  <br>회원이름:  <br>String  <br>회원나이:  <br>int | 200: 정상조회 |
| 회원수정 | Put | /members/{memberId} | 요청 Param  <br>요청ID :Long  <br>요청Body  <br>비밀번호: String | 상태코드:  <br>int  <br>핵심데이터:  <br>object  <br>할일식별자:  <br>id  <br>회원이름:  <br>String  <br>회원나이:  <br>int | 200: 정상수정 |
| 회원삭제 | Delete | /members/{memberId} | 요청Param  <br>요청ID: Long  <br>요청 Body  <br>비밀번호:String |  | 200: 정상삭제 |

ERD
![img.png](img.png)