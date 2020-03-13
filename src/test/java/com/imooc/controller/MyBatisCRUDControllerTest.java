package com.imooc.controller;

import com.imooc.ImoocApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class MyBatisCRUDControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mvc;

    @Before
    public void setup(){
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }

    @Test
    public void queryUserListPaged() throws Exception {
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post("/mybatis/queryUserListPaged", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        String contentAsString = mvcResult.getResponse().getContentAsString();
        System.out.println(contentAsString);

    }
}