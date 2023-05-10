package 跳表;

import java.util.Random;
import java.util.Stack;
class SkipNode<T>
{
    int key;
    T value;
    SkipNode right,down;//左右上下四个方向的指针
    public SkipNode (int key,T value) {
        this.key=key;
        this.value=value;
    }

}
