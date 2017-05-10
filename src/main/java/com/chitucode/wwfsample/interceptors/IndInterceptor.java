package com.chitucode.wwfsample.interceptors;

import com.chitucode.wwf.action.ActionResult;
import com.chitucode.wwf.context.BeatContext;
import com.chitucode.wwf.interceptor.WWFInterceptor;

/**
 * Created by kowaywang on 17/5/10.
 */
public class IndInterceptor implements WWFInterceptor {

    @Override
    public ActionResult before(BeatContext beatContext) {
        System.out.println("before 11111");
        return null;
    }

    @Override
    public ActionResult after(BeatContext beatContext, ActionResult actionResult) {
        return null;
    }

    @Override
    public ActionResult complete(BeatContext beatContext, ActionResult actionResult) {
        return null;
    }
}
