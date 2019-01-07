package com.json.compare.controller;

import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Equals {

    public void test() throws Exception{
        String expected = "{\n" +
                "    \"errno\": 0,\n" +
                "    \"data\": {\n" +
                "        \"subSpec\": \"BasicSort\",\n" +
                "        \"path\": \"D:/1NJUST/Project/algspec/specification/oppo/wahaha/BasicSort\",\n" +
                "        \"username\": \"oppo\",\n" +
                "        \"specID\": \"wahaha\"\n" +
                "    },\n" +
                "    \"errmsg\": \"成功\"\n" +
                "}";
        String actual = "{\n" +
                "    \"errno\": 404,\n" +
                "    \"data\": {\n" +
                "        \"subSpec\": \"BasicSort\",\n" +
                "        \"path\": \"D:/1NJUST/Project/algspec/specification/oppo/wahaha/BasicSort\",\n" +
                "        \"username\": \"oppo\",\n" +
                "        \"specID\": \"wahaha\"\n" +
                "    },\n" +
                "    \"errmsg\": \"成功\"\n" +
                "}";
        JSONAssert.assertEquals(expected, actual, false);
    }
}

