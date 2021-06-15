package cn.zhanghub.designPattern.visitor.example1;

//抽象元素类
interface Element {
    void accept(Visitor visitor);
}
