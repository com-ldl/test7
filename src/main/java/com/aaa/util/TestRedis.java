package com.aaa.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

/**
 * fileName:TestRedis
 * description:
 * author:Ldl
 * createTime:2019-03-02 17:36
 */

public class TestRedis {
    public static void main(String[] args) {
        Set<HostAndPort> hashSet = new HashSet();
        hashSet.add(new HostAndPort("192.168.111.20", 7001));
        hashSet.add(new HostAndPort("192.168.111.20", 7002));
        hashSet.add(new HostAndPort("192.168.111.20", 7003));
        hashSet.add(new HostAndPort("192.168.111.21", 7004));
        hashSet.add(new HostAndPort("192.168.111.21", 7005));
        hashSet.add(new HostAndPort("192.168.111.21", 7006));
        /*Jedis jedis = new Jedis("192.168.111.20",6379);
        jedis.set("aaa","111");
        System.out.println(jedis.ping());*/

        JedisCluster jedisCluster = new JedisCluster(hashSet);
        jedisCluster.set("bbb", "2222");
        String bbb = jedisCluster.get("bbb");
        System.out.println(bbb);
    }
}
