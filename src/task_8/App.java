package task_8;

import task_8.service.InsertService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(8);
        
        b.add(1);
        b.add(5);
        b.add(5);
        InsertService insertService = new InsertService();
        insertService.getInsertedIndexes(a, b);
    }
}
