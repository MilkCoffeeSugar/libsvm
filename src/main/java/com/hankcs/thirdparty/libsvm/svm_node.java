package com.hankcs.thirdparty.libsvm;

/**
 * 用来存储单一向量中的单个特征
 */
public class svm_node implements java.io.Serializable
{
	/**
	 * 向量的第几维
	 */
	public int index;
	/**
	 * 该维的值
	 */
	public double value;
}
