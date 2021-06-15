package cn.zhanghub.designPattern.visitor.example1;

//抽象访问者
interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
