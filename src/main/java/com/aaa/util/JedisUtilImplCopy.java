package com.aaa.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;


@Component
public class JedisUtilImplCopy implements  JedisUtil {

    @Autowired
    private JedisCluster jedisCluster;

    @Override
    public void putObject(Object key, Object value) {
        // TODO Auto-generated method stub
        jedisCluster.set(SerializeUtil.serialize(key.toString()),
                SerializeUtil.serialize(value));
    }
    @Override
    public Object removeObject(Object arg0) {
        // TODO Auto-generated method stub
        Object expire = jedisCluster.expire(
                SerializeUtil.serialize(arg0.toString()), 0);
        return expire;
    }
    @Override
    public Object getObject(Object arg0) {
        // TODO Auto-generated method stub
        Object value = SerializeUtil.unserialize(jedisCluster.get(
                SerializeUtil.serialize(arg0.toString())));
        return value;
    }
}
