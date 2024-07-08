package com.ds.Stacks;

public class Main {
    public static void main(String[] args) {
        Stacks<Integer> st = new Stacks<>();
        // System.out.println(st.push(20));
        st.push(30);
        st.push(40);
        st.push(78);
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.peek());

    }
}
