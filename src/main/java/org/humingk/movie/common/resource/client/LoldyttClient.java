package org.humingk.movie.common.resource.client;

import org.humingk.movie.common.resource.AbstractMovieResourceAdapter;
import org.humingk.movie.common.resource.type.ClientType;
import org.humingk.movie.entity.Resource;
import org.humingk.movie.entity.Search;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取Loldytt资源
 *
 * @author lzx
 * @author humingk
 */
public class LoldyttClient extends AbstractMovieResourceAdapter {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 基本 url
     */
    private static final String BASE_URL = "https://www.loldytt.tv";

    /**
     * 通过关键字获取电影搜索结果
     *
     * @param keyword 搜索关键字
     * @param max     每个网站电影搜索结果最大数
     */
    @Override
    public List<Search> getMovieSearch(String keyword, int max) {
        List<Search> result = null;
        String url = BASE_URL + "/search/index.asp";
        try {
            // 请求参数
            String data = "keyword=" + URLEncoder.encode(keyword, "gb2312");
            // 获取电影搜索网页
            Document doc = httpUrlConnRequest(url, data, "POST");
            // 解析搜索页面，获取每部电影的链接
            Elements elements = doc.select("div.solb");
            Elements movieList = elements.select("ol a");
            if (movieList.size() != 0) {
                result = new ArrayList<>();
                for (int i = 0; i < max && i < movieList.size(); i++) {
                    String movieName = movieList.get(i).text();
                    String movieUrl = movieList.get(i).attr("href");
                    result.add(new Search(keyword, movieName, movieUrl, ClientType.CLIENT_LOLDYTT));
                }
                logger.debug("(LOL电影天堂)获取电影搜索列表成功,共 " + movieList.size() + " 条...keyword: " + keyword);
            }
        } catch (Exception e) {
            logger.error("(LOL电影天堂)获取电影搜索列表失败...keyword: " + keyword, e);
        }
        return result;
    }

    /**
     * 通过电影url获取电影资源
     *
     * @param search 搜索页面信息
     * @return
     */
    @Override
    public List<Resource> getMovieResource(Search search) {
        List<Resource> result = null;
        try {
            Document doc = jsoupRequest(search.getMovieUrl(), Connection.Method.GET);
            Element movieAll = doc.getElementById("liebiao");
            Elements movieList = movieAll.select("div.con4 li a");
            if (movieList.size() != 0) {
                result = new ArrayList<>();
                // 解析迅雷链接和磁力链接
                result = parseMagnetAndThunder(search.getKeyword(), ClientType.CLIENT_LOLDYTT, movieList);
                logger.debug("(LOL电影天堂)获取电影资源成功...keyword: " + search.getKeyword()
                        + " size: " + movieList.size()
                        + " movieName: " + search.getMovieName() +
                        " movieUrl: " + search.getMovieUrl());
            }
        } catch (Exception e) {
            logger.error("(LOL电影天堂)获取电影资源失败...keyword: " + search.getKeyword()
                    + " movieName: " + search.getMovieName() +
                    " movieUrl: " + search.getMovieUrl(), e);
        }
        return result;
    }
}
