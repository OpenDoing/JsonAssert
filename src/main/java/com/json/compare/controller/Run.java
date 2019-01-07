package com.json.compare.controller;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;

public class Run {
    public static void main(String[] args) throws Exception{
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
                    "    \"errno\": 40,\n" +
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
