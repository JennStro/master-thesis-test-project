/**
 *  You have a class Bag, that contains some items. A bag is equal to another bag
 *  when it has the same content. You should change the class Bag such that the code
 *  below prints "SUCCESS".
 */
@NoEqualsMethod
public class FirstTask {

    public class Bag {

        private int content = 0;

        public void setContent(int content) {
            this.content = content;
        }

    }

    public void FirstTask() {
        Bag bag1 = new Bag();
        bag1.setContent(5);
        Bag bag2 = new Bag();
        bag2.setContent(5);

        if (bag1.equals(bag2)) {
            System.out.println("SUCCESS");
            WriteToFile.write("SUCCESS", 1);
        } else {
            System.out.println("FAIL");
            WriteToFile.write("FAIL",1);
        }
    }

    public static void main(String[] args) {
        FirstTask firstTask = new FirstTask();
        firstTask.FirstTask();
    }


}
