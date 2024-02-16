public class SLList {
        private SLNode head;
        private SLNode tail;
        public SLList() {
            head = null;
            tail = null;
        }
        public void listAdd(SLNode newNode) {
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void listRemove(SLNode currentNode) {
            if (currentNode == null && head != null) {
                SLNode succeedingNode = head.next;
                head = succeedingNode;
                if (succeedingNode == null) {
                tail = null;
            }
        }
        else if (currentNode.next != null) {
            SLNode succeedingNode = currentNode.next.next;
            currentNode.next = succeedingNode;
            if (succeedingNode == null) {
                tail = currentNode;
            }
        }
    }
        public String toString() {
            String string = "";
            SLNode currentNode = head;
            while (currentNode != null) {
                string += "\n" + "{Title: " + currentNode.book.title + ", Author: " + currentNode.book.author
                        + ", Price: " + currentNode.book.price + "}";
                currentNode = currentNode.next;
            }
            return string;
        }
}
