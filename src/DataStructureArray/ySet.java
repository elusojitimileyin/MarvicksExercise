package DataStructureArray;

public class ySet {
    private boolean isEmpty = true;

    public boolean isEmpty() {
        return true;
    }
    private String[] elements = new String[3];
    private int number;


    public void add(String element) {
        elements[number]=element;
        isEmpty = false;
        number++;
    }

    public void remove(String element) {
        isEmpty = false;
        number--;
    }

    public String getIndex(int index) {
        return elements[index-1];
    }

    public int getElement(String element) {
        for (int count = 0; count < element.length(); count++){
            if(elements[count].equals(element)){
                return count;
            }
        }return -1;
    }

}
