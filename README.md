# MyBatis DB연결 세팅

### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요
- Users 엔티티 필요
- UsersDao 인터페이스 생성 필요

### MariaDB 사용자 생성 및 권한 주기
```sql
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE greendb;
GRANT ALL PRIVILEGES ON greendb.* TO 'green'@'%';
```

### 테이블 생성
```sql
USE greendb;

create table stadium(
    id int primary KEY auto_increment,
    stadiumname VARCHAR(20) NOT null,
    area VARCHAR(20),
    build DATE unique,
    createDate TIMESTAMP
);

CREATE TABLE team(
    id int primary KEY auto_increment,
    teamname VARCHAR(20) NOT NULL,
    stadiumname VARCHAR(20),     
	 t_area VARCHAR(20),
    t_START DATE unique,
    createDate TIMESTAMP
);

CREATE TABLE player(
    id int primary KEY auto_increment,
    playername VARCHAR(20) NOT NULL,
    teamname VARCHAR(20) NOT NULL,
    uniformnumber INT, 
    POSITION VARCHAR(50),
    createDate TIMESTAMP
);

CREATE TABLE expulsion(
    id int primary KEY auto_increment,
    name VARCHAR(20),
    uniformnumber INT, 
    POSITION VARCHAR(50),
	 reson VARCHAR(100) unique,
    createDate TIMESTAMP
);
```

### 더미데이터 추가
```sql
insert into stadium(stadiumname, area, build, createDate) VALUES('창원NC파크', '창원', '2019-03-18', NOW());
insert into stadium(stadiumname, area, build, createDate) VALUES('사직야구장', '부산', '1985-10-14', NOW());
insert into stadium(stadiumname, area, build, createDate) VALUES('대구삼성라이온즈파크', '대구', '2016-03-19', NOW());

insert into team(teamname, stadiumname, t_area, t_START, createDate) VALUES('NC다이노스', '창원NC파크', '창원', '2011-03-31', NOW());
insert into team(teamname, stadiumname, t_area, t_START, createDate) VALUES('롯데자이언츠', '사직야구장', '부산', '1975-05-06', NOW());
insert into team(teamname, stadiumname, t_area, t_START, createDate) VALUES('삼성라이온즈', '대구삼성라이온즈파크', '대구', '1982-02-03', NOW());



insert into player(playername, teamname, uniformnumber, POSITION, createDate) values('양의지', 'NC다이노스','25','포수', NOW());
insert into player(playername, teamname, uniformnumber, POSITION, createDate) values('강동연', 'NC다이노스','1','투수', NOW());
insert into player(playername, teamname, uniformnumber, POSITION, createDate) values('도태훈', 'NC다이노스','10','내야수', NOW());

insert into player(playername, teamname, uniformnumber, POSITION, createDate) VALUES('안중열', '롯데자이언츠','32','포수', NOW());
insert into player(playername, teamname, uniformnumber, POSITION, createDate) VALUES('박세웅', '롯데자이언츠','21','투수', NOW());
insert into player(playername, teamname, uniformnumber, POSITION, createDate) VALUES('이대호', '롯데자이언츠','10','내야수', NOW());

insert into player(playername, teamname, uniformnumber, POSITION, createDate) VALUES('강민호', '삼성라이온즈스','47','포수', NOW());
insert into player(playername, teamname, uniformnumber, POSITION, createDate) VALUES('구준범', '삼성라이온즈','19','투수', NOW());
insert into player(playername, teamname, uniformnumber, POSITION, createDate) VALUES('이원석', '삼성라이온즈','16','내야수', NOW());


COMMIT;
```