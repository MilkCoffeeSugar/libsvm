package com.hankcs.thirdparty;

import junit.framework.TestCase;

public class svm_trainTest extends TestCase
{
    public void testMain() throws Exception
    {
        String cmdLine = "dataset/iris.scale.txt dataset/iris.scale.model";
        svm_train.main(cmdLine.split(" "));
    }
}