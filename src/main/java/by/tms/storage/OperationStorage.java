package by.tms.storage;

import by.tms.entity.Operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OperationStorage {
    private static List<Operation> operationList = new ArrayList<>();

    public void save(Operation o){
        operationList.add(o);
    }

    public List<Operation> getAll(){
        return new ArrayList <> (operationList);
    }
}


