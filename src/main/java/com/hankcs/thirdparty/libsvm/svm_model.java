package com.hankcs.thirdparty.libsvm;

//
// svm_model
//
/**
 * 保存训练后的训练模型，当然原来的训练参数也必须保留
 */
public class svm_model implements java.io.Serializable
{
	/**
	 * 训练参数
	 */
	public svm_parameter param;	// parameter
	/**
	 * 类别数
	 */
	public int nr_class;		// number of classes, = 2 in regression/one class svm
	/**
	 * 支持向量数
	 */
	public int l;			// total #SV
	/**
	 * 支持向量
	 */
	public svm_node[][] SV;	// SVs (SV[l])
	/**
	 * 相当于判别函数中的alpha
	 */
	public double[][] sv_coef;	// coefficients for SVs in decision functions (sv_coef[k-1][l])
	/**
	 * 相当于判别函数中的b
	 */
	public double[] rho;		// constants in decision functions (rho[k*(k-1)/2])
	public double[] probA;         // pariwise probability information
	public double[] probB;
	/**
	 * 储存在训练集中的支持向量的下标
	 */
	public int[] sv_indices;       // sv_indices[0,...,nSV-1] are values in [1,...,num_traning_data] to indicate SVs in the training set

	// for classification only

	/**
	 * 每个类的标签
	 */
	public int[] label;		// label of each class (label[k])
	/**
	 * 每个类对应的支持向量个数
	 */
	public int[] nSV;		// number of SVs for each class (nSV[k])
				// nSV[0] + nSV[1] + ... + nSV[k-1] = l
};
