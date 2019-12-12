package org.humingk.movie.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.humingk.movie.entity.MovieImdb;
import org.humingk.movie.entity.MovieImdbExample;

public interface MovieImdbMapper {
    long countByExample(MovieImdbExample example);

    int deleteByExample(MovieImdbExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MovieImdb record);

    int insertSelective(MovieImdb record);

    List<MovieImdb> selectByExampleWithBLOBs(MovieImdbExample example);

    List<MovieImdb> selectByExample(MovieImdbExample example);

    MovieImdb selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MovieImdb record, @Param("example") MovieImdbExample example);

    int updateByExampleWithBLOBs(@Param("record") MovieImdb record, @Param("example") MovieImdbExample example);

    int updateByExample(@Param("record") MovieImdb record, @Param("example") MovieImdbExample example);

    int updateByPrimaryKeySelective(MovieImdb record);

    int updateByPrimaryKeyWithBLOBs(MovieImdb record);

    int updateByPrimaryKey(MovieImdb record);
}