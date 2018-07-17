package util.redis;

 
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import redis.clients.jedis.Jedis;
 
/**
 * Jedis Cache 工具类
 * 
 * @author honghuaao
 * @version 2017-7-16
 */
public class JedisUtil {
	
	private static Logger logger = LoggerFactory.getLogger(JedisUtil.class);

	/**
	 * 获取缓存
	 * @param key 键
	 * @return 值
	 */
	public static String get(String key) {
		String value = null;
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtil.getJedis();
			if (jedis.exists(key)) {
				value = jedis.get(key);
				value = !StringUtils.isEmpty(value) && !"nil".equalsIgnoreCase(value) ? value : null;
				logger.debug("get {} = {}", key, value);
			}
		} catch (Exception e) {
			logger.warn("get {} = {}", key, value, e);
		} finally {
			JedisPoolUtil.closeJedis(jedis);
		}
		return value;
	}

	
	/**
	 * 设置缓存
	 * @param key 键
	 * @param value 值
	 * @param cacheSeconds 超时时间，0为不超时
	 * @return
	 */
	public static String set(String key, String value, int cacheSeconds) {
		String result = null;
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtil.getJedis();
			result = jedis.set(key, value);
			if (cacheSeconds != 0) {
				jedis.expire(key, cacheSeconds);
			}
			logger.debug("set {} = {}", key, value);
		} catch (Exception e) {
			logger.warn("set {} = {}", key, value, e);
		} finally {
			JedisPoolUtil.closeJedis(jedis);
		}
		return result;
	}
	
}
