package org.seckill.dao;


import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessSeckilled;

/**
 * @describe �ɹ���ɱ��ϸdao
 * @author zc
 * @version 1.0 2017-08-22
 */
public interface SuccessKilledDao {

    /*
     * ����������ϸ���ɹ����ظ�
     * @param seckillId
     * @param userPhone
     * @return ���������
     */
    int insertSuccessKilled(@Param("seckillId")long seckillId,@Param("userPhone") long userPhone);

    /**
     * ����id��ѯSuccessKilled��Я����ɱ��Ʒ����ʵ��
     * @param seckillId
     * @return
     */
    SuccessSeckilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone") long userPhone);

}
