package org.humingk.movie.api.common.converter;

import org.humingk.movie.api.common.util.ConverterUtil;
import org.humingk.movie.api.common.vo.ResourceMovieVo;
import org.humingk.movie.common.util.BaseConverter;
import org.humingk.movie.service.resource.dto.ResourceMovieDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

/** @author humingk */
@Mapper(
    componentModel = "spring",
    uses = {ConverterUtil.class})
public interface ResourceMovieVoConverter extends BaseConverter<ResourceMovieVo, ResourceMovieDto> {
  @Override
  @Mappings({
    @Mapping(
        target = "urlMovieDouban",
        source = "idMovieDouban",
        qualifiedByName = {"util", "urlMovieDouban"}),
    @Mapping(
        target = "urlMovieImdb",
        source = "idMovieImdb",
        qualifiedByName = {"util", "urlMovieImdb"}),
    @Mapping(
        target = "urlWebsiteResource",
        source = "idWebsiteResource",
        qualifiedByName = {"util", "urlWebsiteResource"}),
    @Mapping(
        target = "websiteResource",
        source = "idWebsiteResource",
        qualifiedByName = {"util", "websiteResource"}),
    @Mapping(
        target = "typeResource",
        source = "idTypeResource",
        qualifiedByName = {"util", "typeResource"}),
    @Mapping(target = "urlResource", source = "resourceMovieDto", qualifiedByName = "urlResource")
  })
  ResourceMovieVo to(ResourceMovieDto resourceMovieDto);

  @Named("urlResource")
  default String urlResource(ResourceMovieDto resourceMovieDto) {
    String url = resourceMovieDto.getUrlResource();
    short idResourceType = resourceMovieDto.getIdTypeResource();
    short idWebsite = resourceMovieDto.getIdWebsiteResource();
    // 非在线
    if (idResourceType >= 100 && idResourceType != 101) {
      return url;
    }
    String new_url = url.substring(2);
    // 正版在线
    if (idWebsite < 100) {
      return "https://www.douban.com/link2/?url=" + new_url;
    }
    // 非正版在线
    switch (idWebsite) {
      case 101:
        return "https://www.dy2018.com/player/index.php?id=https://" + new_url + "/index.m3u8";
      case 103:
        return "http://www.btbtdy.me/play/" + new_url + ".html";
      case 105:
        return "https://www.66s.cc/" + new_url + ".html";
      case 106:
        return "http://www.goudaitv.com/vodplay/" + new_url + "-1-1.html";
      case 107:
        return "http://www.zxzjs.com/video/" + new_url + "-1-1.html";
      default:
        return url;
    }
  }
}
