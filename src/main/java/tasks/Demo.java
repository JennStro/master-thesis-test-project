package tasks;

import annotations.NoEqualsMethod;
import checker.Checker;

@NoEqualsMethod
public class Demo {

    // TODO: Run this method first, then try to solve the task below.
    // TODO: Check if you have solved the task by running this method!
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.doIt();
        Checker.checkDemo();
    }

    // TODO: DEMO
    // TODO: How can the the "content" in class Bag be null?
    // TODO: Make changes to Bag such that content no longer is null.
    @NoEqualsMethod
    class Bag {

        private String content;

        public String getContent() {
            return this.content;
        }
    }

    private void doIt() {
        Bag bag = new Bag();
        if (bag.getContent() != null){
            System.out.println(bag);
        } else {
            System.out.println("Uh oh, the variable is " + bag.getContent());
            Checker.tell("Uh oh, the variable is " + bag.getContent());
        }
    }

}
