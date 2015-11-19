package com.hankcs.thirdparty;

import junit.framework.TestCase;

public class svm_predictTest extends TestCase
{
    public void testMain() throws Exception
    {
        String cmdLine = "dataset/iris.scale.txt dataset/iris.scale.model dataset/iris.scale.result";
        svm_predict.main(cmdLine.split(" "));
    }
}