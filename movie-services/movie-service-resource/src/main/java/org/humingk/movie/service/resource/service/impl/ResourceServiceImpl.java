package org.humingk.movie.service.resource.service.impl;

import com.github.pagehelper.PageHelper;
import org.humingk.movie.common.annotation.RedisCache;
import org.humingk.movie.common.enumeration.CodeAndMsg;
import org.humingk.movie.common.exception.MyException;
import org.humingk.movie.dal.entity.ResourceMovie;
import org.humingk.movie.dal.entity.ResourceMovieExample;
import org.humingk.movie.dal.mapper.auto.ResourceMovieMapper;
import org.humingk.movie.service.resource.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** @author humingk */
@Service
@RedisCache
public class ResourceServiceImpl implements ResourceService {
  @Autowired private ResourceMovieMapper resourceMovieMapper;
  @Autowired private ResourceMovieExample resourceMovieExample;

  @Override
  public List<ResourceMovie> getResourceListByMovieDoubanId(Long id, int offset, int limit) {
    resourceMovieExample.start().andIdMovieDoubanEqualTo(id);
    resourceMovieExample.setOrderByClause("id_type_resource");
    PageHelper.offsetPage(offset, limit);
    List<ResourceMovie> resultList = resourceMovieMapper.selectByExample(resourceMovieExample);
    if (resultList.isEmpty()) {
      throw new MyException(CodeAndMsg.NO_RESOURCE);
    } else {
      return resultList;
    }
  }

  @Override
  public List<ResourceMovie> getResourceListByKeyword(String keyword, int offset, int limit) {
    resourceMovieExample.start().andNameZhLike("%" + keyword + "%");
    resourceMovieExample.or().andNameOriginLike("%" + keyword + "%");
    PageHelper.offsetPage(offset, limit);
    List<ResourceMovie> resultList = resourceMovieMapper.selectByExample(resourceMovieExample);
    if (resultList.isEmpty()) {
      throw new MyException(CodeAndMsg.NO_RESOURCE);
    } else {
      return resultList;
    }
  }
}
