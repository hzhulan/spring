package com.hzhu.utils;

import org.apache.log4j.Logger;

/**
 * @authod: pp_lan on 2018/4/27.
 */
public class LogUtil {

    private static Logger logger = null;

    public static void init(String moduleName) {
        if (logger==null) {
            if (!"".equals(moduleName)) {
                logger = Logger.getLogger(moduleName);
            } else {
                logger = Logger.getLogger(LogUtil.class);
            }
        }
    }

    public static void debug(String content, String moduleName) {
        init(moduleName);
        logger.debug(content);
    }

    public static void debug(String content, Object rs, Long costTime,String moduleName) {
        init(moduleName);
        logger.debug(new StringBuilder(content).append("Cost time:").append(costTime).append("ms,").append(" RS:").
                append(String.valueOf(rs)));
    }

    public static void info(String content, String moduleName) {
        init(moduleName);
        logger.info(content);
    }
    public static void error(String content, String moduleName) {
        init(moduleName);
        logger.error(content);
    }

    public static void error(String content, Throwable e, String moduleName) {
        init(moduleName);
        logger.error(content,e);
    }
}
