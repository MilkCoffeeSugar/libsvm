package com.hankcs.thirdparty.libsvm;

/**
 * 所有样本及类别
 */
public class svm_problem implements java.io.Serializable
{
	/**
	 * 样本总数
	 */
	public int l;
	/**
	 * 样本所属类别
	 */
	public double[] y;
	/**
	 * 样本特征向量
	 */
	public svm_node[][] x;
}
