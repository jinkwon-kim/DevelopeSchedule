CREATE TABLE 'schedule'(
    'id'             BIGINT PRIMARY KEY  NOT NULL auto_increment comment '식별자'
    'userId'       BIGINT                NULL        comment '유저 테이블'
    'title'          VARCHAR(20)             NOT NULL comment '할일'
    'password'  VARCHAR(20)             NOT NULL comment '비밀번호'
    'created_at'  DATETIME()               NOT NULL comment '생성일'
    'updated_at' DATETIME ()             NOT NULL comment '수정일'
    )
CREATE TABLE 'users'(
    'id'            BIGINT       PRIMARY KEY NOT NULL auto_increment comment '식별자'
    'username' VARCHAR(20)                 NOT NULL comment '유저 이름'
    'email'       VARCHAR(100)               NOT NULL comment '이메일'
    'password' VARCHAR(200)                NOT NULL comment '비밀번호'
    'created_at' DATETIME()                   NOT NULL comment '생성일'
    'updated_at' DATETIME()                  NOT NULL comment '수정일'
    )