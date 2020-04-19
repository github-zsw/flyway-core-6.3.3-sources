-- account 表 id 使用uuid 类型，需要先添加uuid-ossp模块。
CREATE TABLE issue_info (
    id varchar(50) PRIMARY KEY     NOT NULL,
    issue_name varchar(50),
	times int
);

