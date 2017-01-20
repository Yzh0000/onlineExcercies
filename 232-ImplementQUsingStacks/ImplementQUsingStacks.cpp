class MyQueue {
public:
    stack<int> q;
    stack<int> q2;
    int top;
    /** Initialize your data structure here. */
    MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    void push(int x) {
        while(!q.empty()){
            q2.push(q.top());
            q.pop();
        }
        q.push(x);
        while(!q2.empty()){
            q.push(q2.top());
            q2.pop();
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    int pop() {
        int x=q.top();
        q.pop();
        return x;
    }
    
    /** Get the front element. */
    int peek() {
        return q.top();
    }
    
    /** Returns whether the queue is empty. */
    bool empty() {
        return q.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * bool param_4 = obj.empty();
 */