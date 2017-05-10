package com.chitucode.wwfsample.controllers;

import com.chitucode.wwf.WWFController;
import com.chitucode.wwf.action.ActionResult;
import com.chitucode.wwf.action.StringActionResult;
import com.chitucode.wwf.annotations.Interceptors;
import com.chitucode.wwf.annotations.Path;
import com.chitucode.wwfsample.interceptors.IndInterceptor;

/**
 * Created by kowaywang on 17/5/10.
 */
@Path("/index")
@Interceptors(interceptors = {IndInterceptor.class  })
public class IndexController extends WWFController{

    @Path("/hello")
    public ActionResult index(){

        System.out.println("hello world");

        return new StringActionResult("23333333");
    }

}
