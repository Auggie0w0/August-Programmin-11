import java.util.ArrayList;

public class InsertInMiddleArrayList {
    public static void insertInMiddle(ArrayList<String> list, String element, int position) {
        if (position < 0 || position > list.size()) {
            System.out.println("Invalid position for insertion.");
            return;
        }

        // Create a new ArrayList to store the result
        ArrayList<String> resultList = new ArrayList<>();

        // Iterate through the original list and insert the element at the specified position
        for (int i = 0; i < list.size(); i++) {
            if (i == position) {
                resultList.add(element);
            }
            resultList.add(list.get(i));
        }

        // If the element should be inserted at the end
        if (position == list.size()) {
            resultList.add(element);
        }

        // Copy the result back to the original list
        list.clear();
        list.addAll(resultList);
    }

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        String elementToInsert = "Grapes";
        int insertionPosition = 1; // Insert in the middle at position 1

        System.out.println("Original ArrayList:");
        System.out.println(myList);

        insertInMiddle(myList, elementToInsert, insertionPosition);

        System.out.println("\nArrayList after insertion:");
        System.out.println(myList);
    }
}
