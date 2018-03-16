--���ݿ��ʼ���ű�

--�������ݿ�
CREATE DATABASE seckill;
--ʹ�����ݿ�
use seckill;
--������ɱ����
CREATE TABLE seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '��Ʒ���id',
`name` VARCHAR(120) NOT NULL COMMENT '��Ʒ����',
`number` int NOT NULL COMMENT '�������',
`start_time` TIMESTAMP NOT NULL COMMENT '��ɱ����ʱ��',
`end_time` TIMESTAMP NOT NULL COMMENT '��ɱ����ʱ��',
`create_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
PRIMARY KEY (seckill_id),
KEY idx_start_time(start_time),
KEY idx_end_time(end_time),
KEY idx_create_time(create_time)

)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='��ɱ����'

--��ʼ������
INSERT INTO
  seckill(name,number,start_time,end_time)
VALUES
  ('1000Ԫ��ɱiphone6',100,'2016-11-23 00:00:00','2016-11-24 00:00:00'),
  ('500Ԫ��ɱipad2',200,'2016-11-23 00:00:00','2016-11-24 00:00:00'),
  ('300Ԫ��ɱС��4',300,'2016-11-23 00:00:00','2016-11-24 00:00:00'),
  ('2000Ԫ��ɱiphone6s',400,'2016-11-23 00:00:00','2016-11-24 00:00:00');
  
create table success_killed(
seckill_id BIGINT NOT NULL COMMENT '��ɱ��Ʒid',
user_phone BIGINT NOT NULL COMMENT '�û��ֻ���',
state TINYINT NOT NULL  NOT NULL DEFAULT -1 COMMENT '��ʶ״̬ -1 ��Ч 0�ɹ� 1�Ѹ��� 2 �ѷ��� ',
create_time TIMESTAMP NOT NULL COMMENT '����ʱ��',
PRIMARY KEY (seckill_id,user_phone),
KEY idx_create_time(create_time)
)ENGINE =InnoDB DEFAULT CHARSET =utf8 COMMENT ='��ɱ�ɹ���ϸ';