package org.humingk.movie.api.celebrity;

import org.humingk.movie.api.common.vo.CelebrityDetailsVo;
import org.humingk.movie.api.common.vo.CelebrityVo;
import org.humingk.movie.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;

// 用于生成API文档
// import org.springframework.web.bind.annotation.RestController;
// @RestController

/**
 * 影人API
 *
 * @author humingk
 */
@Validated
@FeignClient("movie-server-celebrity")
public interface CelebrityApi {

  /**
   * 影人基础信息
   *
   * @param id 豆瓣影人ID
   * @return
   * @apiNote 包括影人头像,影人简介等
   */
  @RequestMapping(value = "/celebrity/bases", method = RequestMethod.GET)
  Result<CelebrityVo> bases(@RequestParam("id") @NotNull Long id);

  /**
   * 影人详细信息
   *
   * @param id 豆瓣影人ID
   * @return
   * @apiNote 包括影人基础信息，别称，图片，相关的电影，获得的奖项
   */
  @RequestMapping(value = "/celebrity/details", method = RequestMethod.GET)
  Result<CelebrityDetailsVo> details(@RequestParam("id") @NotNull Long id);
}
