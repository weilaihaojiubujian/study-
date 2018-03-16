package org.seckill.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

/**
 * @describe ��Ʒ���dao
 * @author zc
 * @version 1.0 2017-08-22
 */
public interface SeckillDao {

    /**
     * �����
     * @param seckillId
     * @param killTime
     * @return ���Ӱ������>1����ʾ���µļ�¼����
     */
    int reduceNumber(@Param("seckillId")Long seckillId, @Param("killTime")Date killTime);

    /**
     * ����id��ѯ��ɱ����
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * ����ƫ������ѯ��ɱ��Ʒ�б�
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * ʹ�ô洢����ִ����ɱ
     * @param paramMap
     */
    void killByProcedure(Map<String,Object> paramMap);
}