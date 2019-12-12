package org.humingk.movie.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.humingk.movie.entity.CelebrityDouban;
import org.humingk.movie.entity.CelebrityDoubanExample;

public interface CelebrityDoubanMapper {
    long countByExample(CelebrityDoubanExample example);

    int deleteByExample(CelebrityDoubanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CelebrityDouban record);

    int insertSelective(CelebrityDouban record);

    List<CelebrityDouban> selectByExampleWithBLOBs(CelebrityDoubanExample example);

    List<CelebrityDouban> selectByExample(CelebrityDoubanExample example);

    CelebrityDouban selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CelebrityDouban record, @Param("example") CelebrityDoubanExample example);

    int updateByExampleWithBLOBs(@Param("record") CelebrityDouban record, @Param("example") CelebrityDoubanExample example);

    int updateByExample(@Param("record") CelebrityDouban record, @Param("example") CelebrityDoubanExample example);

    int updateByPrimaryKeySelective(CelebrityDouban record);

    int updateByPrimaryKeyWithBLOBs(CelebrityDouban record);

    int updateByPrimaryKey(CelebrityDouban record);
}