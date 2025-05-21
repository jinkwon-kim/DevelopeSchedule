SQL
CREATE TABLE 'schedule'(
    'id'             BIGINT PRIMARY KEY  NOT NULL auto_increment comment '식별자'
    'userId'       BIGINT FINAL KEY       NULL        comment '유저 테이블'
    'title'          VARCHAR(20)             NOT NULL comment '할일'
    'created_at'  DATETIME()               NOT NULL comment '생성일'
    'updated_at' DATETIME ()             NOT NULL comment '수정일'
    )
CREATE TABLE 'users'(
    'id'            BIGINT       PRIMARY KEY NOT NULL auto_increment comment '식별자'
    'username' VARCHAR(20)                 NOT NULL comment '유저 이름'
    'password' VARCHAR(200)                NOT NULL comment '비밀번호'
    'created_at' DATETIME()                   NOT NULL comment '생성일'
    'updated_at' DATETIME()                  NOT NULL comment '수정일'
    )