package ChangeUnidirectionalAssociationToBidirectional;

import java.util.HashSet;
import java.util.Set;

/**
 *将单向关联改成双向关联
 *2个类都需要使用对方特性,但其中只有一条单向连接
 *添加一个反向指针,并使修改函数能够同时更新2条连接
 *
 *决定由哪一个类负责控制关联关系
 *1:2个类都是引用对象,关系为1对多,由拥有单一引用的哪一方承担控制者角色,本例使用order控制关联关系
 *2:某个对象是组成另一对象的部件,由后者负责关联关系
 *3:多对多无所谓
 * @author wangchao
 */
public class Customer {
	private Set<Order> orders = new HashSet<Order>();
}
