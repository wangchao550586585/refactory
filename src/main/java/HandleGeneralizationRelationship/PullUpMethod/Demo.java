package HandleGeneralizationRelationship.PullUpMethod;

/**
 * 函数上移
 * 有些函数,各个子类产生完全相同的结果
 * 该函数移动到超类
 * 如果方法名不一样，修改一样
 * 如果需要使用子类函数,超类将该函数声明抽象
 * 如果需要使用子类字段,字段提升超类,也可以selfEncapsulateField,将超类中取值函数声明抽象函数
 * 观察该函数调用者,看是否可以改为超类类型对象
 * 349
 * Created by Administrator on 2017/5/15.
 */
public class Demo {

}
