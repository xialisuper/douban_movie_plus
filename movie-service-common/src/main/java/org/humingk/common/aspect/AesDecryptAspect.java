package org.humingk.common.aspect;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.humingk.common.Utils.AesUtil;
import org.humingk.common.common.StatusAndMessage;
import org.humingk.common.exception.MyException;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * AES解密切面类
 * 拦截请求,解密参数
 *
 * @author humingk
 */
@Aspect
@Component
@Slf4j
public class AesDecryptAspect {

    /**
     * 切点定义:
     * 使用@AESDecrypt注解的类or方法
     */
    @Pointcut("@within(org.humingk.common.annotation.AesDecrypt) || @annotation(org.humingk.common.annotation.AesDecrypt)")
    public void aesDecryptPointCut() {
    }

    /**
     * 环绕通知:
     * 对controller层方法请求参数解密
     *
     * @param joinPoint
     * @return
     */
    @Around("aesDecryptPointCut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 请求参数
        Object[] args = joinPoint.getArgs();
        try {
            args[0] = AesUtil.decrypt(args[0].toString());
        } catch (Exception e) {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = attributes.getRequest();
            Map logMap = new HashMap() {
                {
                    put("ip", request.getRemoteAddr());
                    put("url", request.getRequestURL());
                    put("args", joinPoint.getArgs());
                }
            };
            log.error(e.getMessage(), e);
            log.warn("decrypt failed:{}", new JSONObject(logMap));
            throw new MyException(StatusAndMessage.BADREQUEST);
        }
        return joinPoint.proceed(args);
    }
}